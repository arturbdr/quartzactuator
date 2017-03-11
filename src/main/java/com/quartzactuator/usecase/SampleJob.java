package com.quartzactuator.usecase;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

public class SampleJob implements Job {

    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        System.out.println("Job being executed!");
        System.out.println("jobExecutionContext = " + jobExecutionContext);
    }
}
