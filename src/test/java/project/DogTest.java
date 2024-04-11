package project;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class DogTest {
    private Dog dog;
    
    
    @BeforeEach
    public void setup() {
        dog = new Dog();
    }
    
    //Test 1
    //sjekker om den kalkulerer riktig
    @Test
    public void testCalculateAge() {
        int humanAge = 8;
        int expectedDogAge = humanAge * 7;
        assertEquals(expectedDogAge, dog.calculateAge(humanAge));
    }

    //Test 2
    //tester om metoden thrower exception om human age er < 0
    @Test
    public void testCalculateAgeWithNegativeAge(){
        assertThrows(IllegalArgumentException.class, () -> {
            dog.calculateAge(-20);
        });
    }



}
