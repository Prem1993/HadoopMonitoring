package com.wipro.analytics;

import com.wipro.analytics.fetchers.DataFetcherMain;

import java.sql.*;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by cloudera on 3/19/17.
 */
public class HiveConnection {

    private static final String HIVE_DRIVER_NAME = DataFetcherMain.HIVE_DRIVER_NAME;
    private static final String HIVE_USER = DataFetcherMain.HIVE_USER;
    private static final String HIVE_PASSWORD = DataFetcherMain.HIVE_PASSWORD;
    private static final String FILE_LINE_SEPERATOR = DataFetcherMain.FILE_LINE_SEPERATOR;
    private static final String FILE_FIELD_SEPERATOR = DataFetcherMain.FILE_FIELD_SEPERATOR;
    private static final String DBNAME = DataFetcherMain.DBNAME;
    private static final String HIVE_CONNECTION_URL = DataFetcherMain.HIVE_CONNECTION_URL;
    private static final String NAME_NODE_HOST = DataFetcherMain.nameNodeHost;
    private static final String NAME_NODE_PORT = DataFetcherMain.nameNodePort;
    public static Connection getHiveJDBCConnection(String dbName, String hiveConnection) throws SQLException {
        try {
            Class.forName(HIVE_DRIVER_NAME);
            String hiveUser = HIVE_USER;
            String hivePassword = HIVE_PASSWORD;
            Connection connection = DriverManager.getConnection(hiveConnection + "/" + dbName, hiveUser, hivePassword);
            /* con.createStatement().execute("set hive.exec.dynamic.partition.mode=nonstrict");
            con.createStatement().execute("set hive.exec.dynamic.partition=true");
            con.createStatement().execute("set hive.exec.max.dynamic.partitions.pernode=1000");*/
            return connection;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }

    }


    public void loadIntoHive(String filename, String tableName){
        try {
            Connection conn = getHiveJDBCConnection(DBNAME,HIVE_CONNECTION_URL);
            Statement stmt = conn.createStatement();
	        Configuration conf = new Configuration();
            conf.set("fs.defaultFS","hdfs://"+NAME_NODE_HOST+":"+NAME_NODE_PORT);
            FileSystem fs = FileSystem.get(conf);
		    File sourceFile = new File(filename);
            fs.copyFromLocalFile(new Path(sourceFile.getPath()),new Path("/tmp/"+tableName,sourceFile.getName()));
            String hdfsDir="/tmp/"+tableName;

            Calendar calendar = Calendar.getInstance();
            Date date = calendar.getTime();
            DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
            String dateStr = df.format(date);
            int hour = calendar.get(Calendar.HOUR_OF_DAY);

            String query = "LOAD DATA INPATH '" + hdfsDir + "' INTO TABLE " + tableName +" PARTITION(date='"+dateStr+"' , hour="+hour+")";
            System.out.println("query = " + query);
            stmt.executeUpdate(query);
            sourceFile.delete();
            stmt.close();
            conn.close();

        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
