package project;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.IOException;

public class CalculateAgeAnimalTest {

    @Test
    public void testCalculateAgeBunny() throws IOException{
        int humanAge = 7;
        Bunny bunny = new Bunny();

        int result = bunny.calculateAge(humanAge);

        assertEquals(57, result);
    }

    @Test
    public void testCalculateAgeCat() throws IOException{
        int humanAge = 7;
        Cat cat = new Cat();

        int result = cat.calculateAge(humanAge);

        assertEquals(44, result);
    }

}

