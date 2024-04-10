package project;

public class Dog implements Animal {

    private String name;

    @Override
    public String getName() {
        return name;
    }

    public String makeSound() {
        return name + "says woof!";
    }

    //one calender year equals 7 dog years
    public int calculateAge(int humanAge) {
        if (humanAge < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        }
        int dogAge = humanAge * 7;
        return dogAge;
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        System.out.println(dog.calculateAge(5));
    }

}
