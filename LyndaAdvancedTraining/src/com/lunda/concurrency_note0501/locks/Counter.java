/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lunda.concurrency_note0501.locks;

/**
 *
 * @author root
 */
public class Counter {
    
    private int count ;
    
    public void increment(){
    
        count++;
    }

    public int getCount() {
        return count;
    }
    
}
