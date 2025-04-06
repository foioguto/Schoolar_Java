public class Main {

    public static void main(String[] args) {

        Person fish = new Person();

        fish.setAge(54);
        fish.setFirstName("Moby");
        fish.setLastName("Dick");

        System.out.print("Is teen? " + fish.isTeen());
        System.out.println(" ");
        System.out.println("Her full name is " + fish.getFullName());
    }
}
