/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.handbook.testpack;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 *
 * @author valera
 */

@Aspect
public class BeforeAspect {
    
    @Before("execution(* com.handbook.controllers.SimpleService.sayHello(..))")
    public void doBefore(JoinPoint joinPoint){
        System.out.println("============== a s p e c t  b e f o r e ====================");
        System.out.println("***AspectJ*** DoBefore() is running!! intercepted : " + 
               joinPoint.getSignature().getName());
        System.out.println(".............................................................");
    }
}
