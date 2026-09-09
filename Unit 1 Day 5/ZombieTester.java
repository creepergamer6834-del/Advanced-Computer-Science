public class ZombieTester {
    public static void main(String[] args) {
        Zombie z = new Zombie();
        z.eat();
        z.infect();
        System.out.println(z.getName() + " is " + z.getHeight() + "ft");

        System.out.println(z.getName() + " has " + z.getEndurance() + " endurance!");

        System.out.println(z.getName() + " has " + z.getHealth() + " health!");

        String test = null;
        System.out.println(test.length());

        z.setName("Joe");
        System.out.println(z.getName());

        Zombie x = new Zombie("Jill", 8.0);
    }

    


}
