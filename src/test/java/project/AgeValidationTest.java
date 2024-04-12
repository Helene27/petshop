package project;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.io.File;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class AgeValidationTest {

    
    //Test 1
    @Test
    public void testMakeSound() {
        Animal dog = new Dog();
        String name = dog.getName();
        String sound = dog.makeSound(name);
        assertEquals(name + " says woof!", sound);
    }

    //Test 2
    //tester om metoden thrower exception om human age er < 0
    @Test
    public void calculateAgeWithNegativeAgeTest(){
        Dog dog = new Dog();
        assertThrows(IllegalArgumentException.class, () -> {
            dog.calculateAge(-20);
        });
    }



}
