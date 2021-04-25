package com.implementationList.impl;

import com.implementationList.Animal;
import org.springframework.stereotype.Component;

@Component
public class Cow implements Animal {

    @Override
    public void speak() {
        System.out.println("Muuuuuu");
    }
}
