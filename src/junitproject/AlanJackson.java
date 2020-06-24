/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package junitproject;

/**
 *
 * @author Owner2
 */
public class AlanJackson {
    private String alan;
    private String jackson;
    
AlanJackson() {
    alan = "Alan";
    jackson = "Jackson";
}

public String formMessage() {
    String message;
    message = alan + " " + jackson;
    return message;
}

public static void main(String[] args) {
    AlanJackson alanJackson = new AlanJackson();
    System.out.println(alanJackson.formMessage());
}
    
}

