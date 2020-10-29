package com.ljq.study.quartz.job;

import org.quartz.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @author lijq
 * @date 2020/10/27 11:45
 * @desc
 **/
@Component
public class PrintJobInit {

    @Autowired
    private Scheduler scheduler;

    @PostConstruct
    public void init() throws SchedulerException {

        JobDetail jobDetail = JobBuilder.newJob(PrintJob.class).build();

        Trigger trigger = TriggerBuilder.newTrigger()
                .withSchedule(CronScheduleBuilder
                .cronSchedule("0 0/10 * * * ? "))
                .startNow().build();

        scheduler.scheduleJob(jobDetail, trigger);
    }


}
