/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.handbook.testpack;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

/**
 *
 * @author valera
 */
@Aspect
public class DoAroundAspect {
    @Around("execution(* com.handbook.controllers.SimpleService.sayHello(..))")
    public void doBefore(ProceedingJoinPoint joinPoint) throws Throwable{
        System.out.println("============== a s p e c t  around ====================");
        joinPoint.proceed();
        System.out.println("***AspectJ*** DoAround() is running!! intercepted : " + 
               joinPoint.getSignature().getName());
        System.out.println(".............................................................");
    }
}
