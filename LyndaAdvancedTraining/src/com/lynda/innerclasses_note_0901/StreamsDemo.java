/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lynda.innerclasses_note_0901;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import sun.security.util.Length;

/**
 *
 * @author root
 */
public class StreamsDemo {
    
            List<String> strings = Arrays.asList("this", " is" , "a" , "list" ,"of" , "strings");

    public static void main(String[] args) {
        
        
    }
        public String joinStreams(){
        
            return Stream.of("this", " is" , "a" , "list" ,"of" , "strings")
                    .collect(Collectors.joining(" "));
        }
        
        public String joinUperCase(){
        
            return strings.stream()
                    .map(String::toUpperCase)
                    .collect(Collectors.joining(" "));
        }
        
        public int getTotalLength(){
        
            return strings.stream()
                    .collect(Collectors.summingInt(String::length));
        }
        
        
        public double sumFirstNBigDecimal(int num){
        
            return Stream.iterate(BigDecimal.ONE,val->val.add(BigDecimal.ONE))
                    .limit(num)
                    .mapToDouble(BigDecimal::doubleValue)
                    .sum();
        }
        
        public Double sumRandoms1(int num){
        
            return Stream.generate(Math::random)
                    .limit(num)
                    .reduce(Double::sum)
                    .orElse(0.0);
        }
        
        public Double sumRandoms2(int num){
        
            return Stream.generate(Math::random)
                    .limit(num)
                    .reduce((acc,n) -> {
                    
                        System.out.printf("Acc = %s , n = %s%n",acc,n);
                        
                        return acc+n ;
                    })
                    .orElse(0.0);
        }
        
        
          public Double sumRandoms3(int num){
        
              Random r = new Random();
              
              return r.doubles()
                      .limit(num)
                      .sum();
        }
    }

