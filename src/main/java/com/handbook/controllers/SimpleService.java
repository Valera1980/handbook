/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.handbook.controllers;

/**
 *
 * @author valera
 */

public interface SimpleService {
    public void printNameId();
    public void checkName();
    public String sayHello(String message);
    public void setName(String name);
    public String getName();
    public int getId();
    public void setId(int id);
}
