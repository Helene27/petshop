package project;

public class Cat implements Animal {

    private String name;

    @Override
    public String getName() {
        return name;
    }

    public String makeSound(String name) {
        return name + " says meow!";
    }

    //first calender year equals 15 cat years, second year equals 9 cat years, following years equals 4 cat years each
    public int calculateAge(int humanAge) {
        int catAge;
        if (humanAge < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        }
        else if (humanAge == 0) {
            catAge = 0;
        }
        else if (humanAge == 1) {
            catAge = 15;
        }
        else if (humanAge == 2) {
            catAge = 15 + 9;
        }
        else {
            catAge = 15 + 9 + (humanAge-2) * 4;
        }

        return catAge;

    }

    public static void main(String[] args) {
        Cat cat = new Cat();
        System.out.println(cat.calculateAge(5));
    }

}
