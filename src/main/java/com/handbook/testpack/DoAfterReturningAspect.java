/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.handbook.testpack;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;

/**
 *
 * @author valera
 */
@Aspect
public class DoAfterReturningAspect {

    @AfterReturning(pointcut = "execution(* com.handbook.controllers.SimpleService.sayHello(..))",
            returning = "result")
    public void afterReturning(JoinPoint joinPoint, Object result) {
        System.out.println("================ do after returning =======================");
        System.out.println("***AspectJ*** DoAfterReturning() is running!! intercepted : "
                + joinPoint.getSignature().getName());
        System.out.println("Method returned value is : " + result);
        System.out.println(".............................................................");
    }
}
