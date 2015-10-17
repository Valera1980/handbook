/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.handbook.testpack;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;

/**
 *
 * @author valera
 */
@Aspect
public class AfterAspect {

    @After("execution(* com.handbook.controllers.SimpleService.sayHello(..))")
    public void doAfter(JoinPoint joinPoint) {
        System.out.println("============== a s p e c t  a f t e r ======================");
        System.out.println("***AspectJ*** doAfter() is running!! intercepted : "
                + joinPoint.getSignature().getName());
        System.out.println(".............................................................");
    }

}
