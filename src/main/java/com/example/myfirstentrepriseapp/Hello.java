package com.example.myfirstentrepriseapp;

import javax.ejb.Local;

@Local
public interface Hello {
    String sayHello();
}