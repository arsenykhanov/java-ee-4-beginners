/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.acme.edu;

/**
 *
 * @author eugene
 */

public class Main {
    public static void main(String[] args) { 
        Emplyee j = new Emplyee();
        m(j); //factual
        System.out.println(j.age);
    }
    
    static void m(Emplyee arg) {
        arg.age = 1;
    }
}

class Emplyee {
     public int age = 0;    
}


