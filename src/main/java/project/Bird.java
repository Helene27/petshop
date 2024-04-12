package project;

public class Bird implements Animal {

    private String name;

    @Override
    public String getName() {
        return name;
    }

    public String makeSound(String name) {
        return name + " says pip!";
    }

    //one calender year equals 9 bird (of type parakeet) years
    public int calculateAge(int humanAge) {
        if (humanAge < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        }
        int birdAge = humanAge * 9;
        return birdAge;
    }

    public static void main(String[] args) {
        Bird bird = new Bird();
        System.out.println(bird.calculateAge(5));
    }

}
