/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.handbook.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author valera
 */
@Controller
public class AspectPage {
    
    @Autowired
    private SimpleService service;
   
   @RequestMapping(value = "/aspect",method = RequestMethod.GET)
   public ModelAndView getAspectPage(@RequestParam("par") String param){
       ModelAndView view = new ModelAndView("aspect");
       
       //String name = service.getName();
        //String name = "kkkkkkkkkkkkkkkkkk";
        //service.setName(name);
       
       view.addObject("name", "param = " + param);
       service.sayHello("hello from controller");
       return view;
   }
}
