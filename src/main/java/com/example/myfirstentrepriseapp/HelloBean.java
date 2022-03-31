package com.example.myfirstentrepriseapp;
import javax.ejb.*;

@Stateless
public class HelloBean implements Hello {

    @Override
    public String sayHello() {
        return "Hello World!";
    }
}
