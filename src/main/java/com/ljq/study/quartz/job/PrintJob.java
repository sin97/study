package com.ljq.study.quartz.job;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author lijq
 * @date 2020/10/27 10:44
 * @desc
 **/
//@Component
public class PrintJob extends QuartzJobBean {

    @Override
    protected void executeInternal(JobExecutionContext jobExecutionContext) throws JobExecutionException {

        System.out.println(jobExecutionContext.getJobDetail());
        System.out.println(jobExecutionContext.getTrigger());
        System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ssS").format(new Date()));

    }
}
