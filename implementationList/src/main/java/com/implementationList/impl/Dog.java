package com.implementationList.impl;

import com.implementationList.Animal;
import org.springframework.stereotype.Component;

@Component
public class Dog implements Animal {

    @Override
    public void speak() {
        System.out.println("Au au");
    }
}
