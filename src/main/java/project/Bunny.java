package project;

public class Bunny implements Animal {

    private String name;

    @Override
    public String getName() {
        return name;
    }

    public String makeSound() {
        return name + "says tnatna!";
    }

}
