package project;

public class Cat implements Animal {

    private String name;

    @Override
    public String getName() {
        return name;
    }

    public String makeSound() {
        return name + "says meow!";
    }

}
