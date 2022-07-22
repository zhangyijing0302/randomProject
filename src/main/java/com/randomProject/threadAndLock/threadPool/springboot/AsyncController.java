package com.randomProject.threadAndLock.threadPool.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

/**
 * @author ZhangYijing
 * @Description
 * @Date 2022/4/27
 */
@RestController
@RequestMapping("/async")
public class AsyncController {

    @Autowired
    TestCaseService testCaseService;

    @RequestMapping("/asyncCase")
    public String getSomeThing() {
        testCaseService.letNumAddOne();
        return "Hello";
    }
    
    @RequestMapping("/asyncTask")
    public String getTask() {
        try {
            String s = testCaseService.asyncManagerCase();
            return s;
        } catch (ExecutionException e) {
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (TimeoutException e) {
            e.printStackTrace();
        }
        return "a123";
    }

}