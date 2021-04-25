package com.implementationList.impl;

import com.implementationList.Animal;
import org.springframework.stereotype.Component;

@Component
public class Cat implements Animal {

    @Override
    public void speak() {
        System.out.println("Miaaauu");
    }
}
