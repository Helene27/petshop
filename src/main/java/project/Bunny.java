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

    //first calender year equals 21 bunny years, following years equals 6 bunny years each
    public int calculateAge(int humanAge) {
        int bunnyAge;
        if (humanAge < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        }
        else if (humanAge == 1) {
            bunnyAge = 21;
        }
        else {
            bunnyAge = 21 + (humanAge-1) * 6;
        }

        return bunnyAge;

    }

    public static void main(String[] args) {
        Bunny bunny = new Bunny();
        System.out.println(bunny.calculateAge(5));
    }
}
