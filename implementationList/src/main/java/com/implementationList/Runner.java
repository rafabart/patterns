package com.implementationList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Runner implements CommandLineRunner {

    // O proprio spring injeta todas as classes que implementam a interface 'Animal' na lista anotada com @Autowired

    @Autowired
    private List<Animal> animalList;

    @Override
    public void run(String... args) throws Exception {

        animalList.forEach(
                Animal::speak
        );

        /*
            Será impresso no console a lista abaixo, passando por todas implementações:
            Miaaauu
            Muuuuuu
            Au au
            Qua qua
         */
    }
}
