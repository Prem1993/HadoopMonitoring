package com.wipro.analytics.Hibernate;

import com.wipro.analytics.beans.FinishedJobsInfo;
import com.wipro.analytics.beans.FinishedWorkflowInfo;
import org.hibernate.Query;
import org.hibernate.classic.Session;

import java.util.Date;
import java.util.Iterator;
import java.util.List;

/**
 * Created by cloudera on 6/26/18.
 */
public class PutJobInfoIntoDB {

    public static void main(String[] args)
    {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Query query=session.createQuery("SELECT sum(avgMapTime) , sum(avgReduceTime), sum(avgShuffleTime), sum(avgMergeTime), sum(gcTime), sum(usedPhysicalMemory),\n" +
                " sum(cpuTimeSpentMaps), sum(cpuTimeSpentReducers), sum(cpuTimeSpentTotal), sum(vCoreSecondsMaps),\n" +
                "sum(vCoreSecondsReducers), sum(memorySecondsMaps), sum(memorySecondsReducers), sum(slotsTimeMaps), sum(slotsTimeReducers),\n" +
                "sum(timeMaps), sum(timeReducers),sum(noOfMaps),sum(noOfReducers),sum(occupiedMemory),sum(allocatedMemory),sum(usedPerAllocatedMemory),sum(usedPerAllocatedCPU),\n" +
                "sum(totalFileBytesRead) ,sum(totalFileBytesWritten),sum(totalFileReadOps),sum(totalFileLargeReadOps )\n" +
                ",sum(totalFileWriteOps),sum(totalHDFSBytesRead),sum(totalHDFSBytesWritten),sum(totalHDFSReadOps )\n" +
                ",sum(totalHDFSLargeReadOps),sum(totalHDFSWriteOps), workflowId, count(id), (max(floor(finishTime/1000)))\n" +
                "FROM FinishedJobsInfo\n" +
                "GROUP BY(workflowId)");
             /*List<FinishedJobsInfo> finishedJobsInfoList=query.list();*/
        //System.out.println("No of record is "+query.list().size());
        Iterator iterator=query.list().iterator();
        while(iterator.hasNext())
        {
            System.out.println("in loop");
            Object object[]= (Object[]) iterator.next();
            FinishedWorkflowInfo finishedWorkflowInfo=new FinishedWorkflowInfo((Long) object[0],(Long)object[1],(Long)object[2],(Long)object[3],(Long)object[4]
                    ,(Long)object[5],(Long)object[6],(Long)object[7],(Long)object[8],(Long)object[9],(Long)object[10],(Long)object[11],(Long)object[12],(Long)object[13],(Long)object[14],(Long)object[15]
                    ,(Long)object[16],(Long)object[17],(Long)object[18],(Double)object[19],(Double)object[20],(Double)object[21],(Double)object[22],(Long)object[23],(Long)object[24],(Long)object[25],(Long)object[26],(Long)object[27]
                    ,(Long)object[28],(Long)object[29],(Long)object[30],(Long)object[31],(Long)object[32],(String)object[33],(Long)object[34],1234);
             System.out.println(" id is "+(String)object[33]);
             finishedWorkflowInfo.setFinishdate((Integer) object[35]);
            if (object[33]!=null)
            session.saveOrUpdate(finishedWorkflowInfo);
        }
        //Commit the transaction
        session.getTransaction().commit();
        HibernateUtil.shutdown();
    }
}
