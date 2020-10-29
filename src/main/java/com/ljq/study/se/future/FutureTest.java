package com.ljq.study.se.future;

import lombok.SneakyThrows;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/**
 * @author lijq
 * @date 2020/9/7 17:27
 * @desc 1
 **/
public class FutureTest {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

    /*    Integer integer =*/ CompletableFuture.supplyAsync(FutureTest::return1)
                .thenCombineAsync(CompletableFuture.supplyAsync(FutureTest::return2), Integer::sum)
                .thenAccept(System.out::println);


        TimeUnit.SECONDS.sleep(3);
    }
    @SneakyThrows
    public static int return1() {
      TimeUnit.SECONDS.sleep(2);
        return 1;
    }
    @SneakyThrows
    public static int return2() {
        TimeUnit.SECONDS.sleep(3);
        return 2;
    }
}
