package com.wipro.analytics.beans;

import com.wipro.analytics.fetchers.DataFetcherMain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

/**
 * Created by cloudera on 3/19/17.
 */@Entity
@Table(name="FinishedWorkflowInfo")
public class FinishedWorkflowInfo implements Serializable {
    @Column
long avgMapTime;
    @Column
long avgReduceTime;
    @Column
long avgShuffleTime ;
    @Column
long avgMergeTime ;
    @Column
long gcTime ;
    @Column
long usedPhysicalMemory ;
    @Column
long cpuTimeSpentMaps ;
    @Column
long cpuTimeSpentReducers ;
    @Column
long cpuTimeSpentTotal ;
    @Column
long vCoreSecondsMaps ;
    @Column
long vCoreSecondsReducers ;
    @Column
long memorySecondsMaps ;
    @Column
long memorySecondsReducers ;
    @Column
long slotsTimeMaps ;
    @Column
long slotsTimeReducers ;
    @Column
long timeMaps ;
    @Column
long timeReducers ;
    @Column
long noOfMaps;
    @Column
long noOfReducers;
    @Column
double occupiedMemory;
    @Column
double allocatedMemory;
    @Column
double usedPerAllocatedMemory;
    @Column
    double usedPerAllocatedCPU;
    @Column
    long totalFileBytesRead;
    @Column
    long totalFileBytesWritten;
    @Column
    long totalFileReadOps;
    @Column
    long totalFileLargeReadOps;
    @Column
    long totalFileWriteOps ;
    @Column
    long totalHDFSBytesRead ;
    @Column
    long totalHDFSBytesWritten ;
    @Column
    long totalHDFSReadOps;
    @Column
    long totalHDFSLargeReadOps ;
    @Column
    long totalHDFSWriteOps ;
    @Id
    @Column
    String workflowId;
    @Column
    long noOfApplicationsInWorkflow;
    @Column
    long finishdate;









    public FinishedWorkflowInfo(long avgMapTime, long avgReduceTime, long avgShuffleTime, long avgMergeTime, long gcTime, long usedPhysicalMemory,
                                long cpuTimeSpentMaps, long cpuTimeSpentReducers, long cpuTimeSpentTotal, long vCoreSecondsMaps,
                                long vCoreSecondsReducers, long memorySecondsMaps, long memorySecondsReducers, long slotsTimeMaps,
                                long slotsTimeReducers, long timeMaps, long timeReducers, long noOfMaps, long noOfReducers,
                                double occupiedMemory, double allocatedMemory, double usedPerAllocatedMemory, double usedPerAllocatedCPU,
                                long totalFileBytesRead, long totalFileBytesWritten, long totalFileReadOps, long totalFileLargeReadOps,
                                long totalFileWriteOps, long totalHDFSBytesRead, long totalHDFSBytesWritten, long totalHDFSReadOps,
                                long totalHDFSLargeReadOps, long totalHDFSWriteOps, String workflowId, long noOfApplicationsInWorkflow,
                                long finishdate) {
        this.avgMapTime = avgMapTime;
        this.avgReduceTime = avgReduceTime;
        this.avgShuffleTime = avgShuffleTime;
        this.avgMergeTime = avgMergeTime;
        this.gcTime = gcTime;
        this.usedPhysicalMemory = usedPhysicalMemory;
        this.cpuTimeSpentMaps = cpuTimeSpentMaps;
        this.cpuTimeSpentReducers = cpuTimeSpentReducers;
        this.cpuTimeSpentTotal = cpuTimeSpentTotal;
        this.vCoreSecondsMaps = vCoreSecondsMaps;
        this.vCoreSecondsReducers = vCoreSecondsReducers;
        this.memorySecondsMaps = memorySecondsMaps;
        this.memorySecondsReducers = memorySecondsReducers;
        this.slotsTimeMaps = slotsTimeMaps;
        this.slotsTimeReducers = slotsTimeReducers;
        this.timeMaps = timeMaps;
        this.timeReducers = timeReducers;
        this.noOfMaps = noOfMaps;
        this.noOfReducers = noOfReducers;
        this.occupiedMemory = occupiedMemory;
        this.allocatedMemory = allocatedMemory;
        this.usedPerAllocatedMemory = usedPerAllocatedMemory;
        this.usedPerAllocatedCPU = usedPerAllocatedCPU;
        this.totalFileBytesRead = totalFileBytesRead;
        this.totalFileBytesWritten = totalFileBytesWritten;
        this.totalFileReadOps = totalFileReadOps;
        this.totalFileLargeReadOps = totalFileLargeReadOps;
        this.totalFileWriteOps = totalFileWriteOps;
        this.totalHDFSBytesRead = totalHDFSBytesRead;
        this.totalHDFSBytesWritten = totalHDFSBytesWritten;
        this.totalHDFSReadOps = totalHDFSReadOps;
        this.totalHDFSLargeReadOps = totalHDFSLargeReadOps;
        this.totalHDFSWriteOps = totalHDFSWriteOps;
        this.workflowId = workflowId;
        this.noOfApplicationsInWorkflow = noOfApplicationsInWorkflow;
        this.finishdate = finishdate;
    }











    public String getWorkflowId() {
        return workflowId;
    }

    public void setWorkflowId(String workflowId) {
        this.workflowId = workflowId;
    }

    public long getAvgMapTime() {
        return avgMapTime;
    }

    public void setAvgMapTime(long avgMapTime) {
        this.avgMapTime = avgMapTime;
    }

    public long getAvgReduceTime() {
        return avgReduceTime;
    }

    public void setAvgReduceTime(long avgReduceTime) {
        this.avgReduceTime = avgReduceTime;
    }

    public long getAvgShuffleTime() {
        return avgShuffleTime;
    }

    public void setAvgShuffleTime(long avgShuffleTime) {
        this.avgShuffleTime = avgShuffleTime;
    }

    public long getAvgMergeTime() {
        return avgMergeTime;
    }

    public void setAvgMergeTime(long avgMergeTime) {
        this.avgMergeTime = avgMergeTime;
    }

    public long getGcTime() {
        return gcTime;
    }

    public void setGcTime(long gcTime) {
        this.gcTime = gcTime;
    }

    public long getUsedPhysicalMemory() {
        return usedPhysicalMemory;
    }

    public void setUsedPhysicalMemory(long usedPhysicalMemory) {
        this.usedPhysicalMemory = usedPhysicalMemory;
    }

    public long getCpuTimeSpentMaps() {
        return cpuTimeSpentMaps;
    }

    public void setCpuTimeSpentMaps(long cpuTimeSpentMaps) {
        this.cpuTimeSpentMaps = cpuTimeSpentMaps;
    }

    public long getCpuTimeSpentReducers() {
        return cpuTimeSpentReducers;
    }

    public void setCpuTimeSpentReducers(long cpuTimeSpentReducers) {
        this.cpuTimeSpentReducers = cpuTimeSpentReducers;
    }

    public long getCpuTimeSpentTotal() {
        return cpuTimeSpentTotal;
    }

    public void setCpuTimeSpentTotal(long cpuTimeSpentTotal) {
        this.cpuTimeSpentTotal = cpuTimeSpentTotal;
    }

    public long getvCoreSecondsMaps() {
        return vCoreSecondsMaps;
    }

    public void setvCoreSecondsMaps(long vCoreSecondsMaps) {
        this.vCoreSecondsMaps = vCoreSecondsMaps;
    }

    public long getvCoreSecondsReducers() {
        return vCoreSecondsReducers;
    }

    public void setvCoreSecondsReducers(long vCoreSecondsReducers) {
        this.vCoreSecondsReducers = vCoreSecondsReducers;
    }

    public long getMemorySecondsMaps() {
        return memorySecondsMaps;
    }

    public void setMemorySecondsMaps(long memorySecondsMaps) {
        this.memorySecondsMaps = memorySecondsMaps;
    }

    public long getMemorySecondsReducers() {
        return memorySecondsReducers;
    }

    public void setMemorySecondsReducers(long memorySecondsReducers) {
        this.memorySecondsReducers = memorySecondsReducers;
    }

    public long getSlotsTimeMaps() {
        return slotsTimeMaps;
    }

    public void setSlotsTimeMaps(long slotsTimeMaps) {
        this.slotsTimeMaps = slotsTimeMaps;
    }

    public long getSlotsTimeReducers() {
        return slotsTimeReducers;
    }

    public void setSlotsTimeReducers(long slotsTimeReducers) {
        this.slotsTimeReducers = slotsTimeReducers;
    }

    public long getTimeMaps() {
        return timeMaps;
    }

    public void setTimeMaps(long timeMaps) {
        this.timeMaps = timeMaps;
    }

    public long getTimeReducers() {
        return timeReducers;
    }

    public void setTimeReducers(long timeReducers) {
        this.timeReducers = timeReducers;
    }

    public long getNoOfMaps() {
        return noOfMaps;
    }

    public void setNoOfMaps(long noOfMaps) {
        this.noOfMaps = noOfMaps;
    }

    public long getNoOfReducers() {
        return noOfReducers;
    }

    public void setNoOfReducers(long noOfReducers) {
        this.noOfReducers = noOfReducers;
    }

    public double getOccupiedMemory() {
        return occupiedMemory;
    }

    public void setOccupiedMemory(double occupiedMemory) {
        this.occupiedMemory = occupiedMemory;
    }

    public double getAllocatedMemory() {
        return allocatedMemory;
    }

    public void setAllocatedMemory(double allocatedMemory) {
        this.allocatedMemory = allocatedMemory;
    }

    public double getUsedPerAllocatedMemory() {
        return usedPerAllocatedMemory;
    }

    public void setUsedPerAllocatedMemory(double usedPerAllocatedMemory) {
        this.usedPerAllocatedMemory = usedPerAllocatedMemory;
    }

    public double getUsedPerAllocatedCPU() {
        return usedPerAllocatedCPU;
    }

    public void setUsedPerAllocatedCPU(double usedPerAllocatedCPU) {
        this.usedPerAllocatedCPU = usedPerAllocatedCPU;
    }

    public long getTotalFileBytesRead() {
        return totalFileBytesRead;
    }

    public void setTotalFileBytesRead(long totalFileBytesRead) {
        this.totalFileBytesRead = totalFileBytesRead;
    }

    public long getTotalFileBytesWritten() {
        return totalFileBytesWritten;
    }

    public void setTotalFileBytesWritten(long totalFileBytesWritten) {
        this.totalFileBytesWritten = totalFileBytesWritten;
    }

    public long getTotalFileReadOps() {
        return totalFileReadOps;
    }

    public void setTotalFileReadOps(long totalFileReadOps) {
        this.totalFileReadOps = totalFileReadOps;
    }

    public long getTotalFileLargeReadOps() {
        return totalFileLargeReadOps;
    }

    public void setTotalFileLargeReadOps(long totalFileLargeReadOps) {
        this.totalFileLargeReadOps = totalFileLargeReadOps;
    }

    public long getTotalFileWriteOps() {
        return totalFileWriteOps;
    }

    public void setTotalFileWriteOps(long totalFileWriteOps) {
        this.totalFileWriteOps = totalFileWriteOps;
    }

    public long getTotalHDFSBytesRead() {
        return totalHDFSBytesRead;
    }

    public void setTotalHDFSBytesRead(long totalHDFSBytesRead) {
        this.totalHDFSBytesRead = totalHDFSBytesRead;
    }

    public long getTotalHDFSBytesWritten() {
        return totalHDFSBytesWritten;
    }

    public void setTotalHDFSBytesWritten(long totalHDFSBytesWritten) {
        this.totalHDFSBytesWritten = totalHDFSBytesWritten;
    }

    public long getTotalHDFSReadOps() {
        return totalHDFSReadOps;
    }

    public void setTotalHDFSReadOps(long totalHDFSReadOps) {
        this.totalHDFSReadOps = totalHDFSReadOps;
    }

    public long getTotalHDFSLargeReadOps() {
        return totalHDFSLargeReadOps;
    }

    public void setTotalHDFSLargeReadOps(long totalHDFSLargeReadOps) {
        this.totalHDFSLargeReadOps = totalHDFSLargeReadOps;
    }

    public long getTotalHDFSWriteOps() {
        return totalHDFSWriteOps;
    }

    public void setTotalHDFSWriteOps(long totalHDFSWriteOps) {
        this.totalHDFSWriteOps = totalHDFSWriteOps;
    }

    public long getNoOfApplicationsInWorkflow() {
        return noOfApplicationsInWorkflow;
    }

    public void setNoOfApplicationsInWorkflow(long noOfApplicationsInWorkflow) {
        this.noOfApplicationsInWorkflow = noOfApplicationsInWorkflow;
    }

    public long getFinishdate() {
        return finishdate;
    }

    public void setFinishdate(long finishdate) {
        this.finishdate = finishdate;
    }






}