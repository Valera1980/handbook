/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.handbook.controllers;

import org.springframework.stereotype.Service;

/**
 *
 * @author valera
 */
@Service
public class SimpleServiceImpl implements SimpleService{

    private String name;
    private int id;

    public SimpleServiceImpl(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public SimpleServiceImpl() {
    }
    
    

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }
        
    
    
    @Override
    public void printNameId() {
        System.out.println("SimpleService : Method printNameId() : My name is " + 
                name +  " and my id is " + id);
    }

    @Override
    public void checkName() {
        if (name.length() < 20) {
            throw new IllegalArgumentException();
        }
    }

    @Override
    public String sayHello(String message) {
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("SimpleService : Method sayHello() : Hello! " + message);
        System.out.println("..........................................................");
        return message;
    }
    
}
