public class Zombie {

    /*
     * class is a new data type attributes -> instance variables attributes to a zombie height -
     * double hunger - boolean health - int color - string endurance - int name - string
     * 
     * behaviors -> method behaviors relate to zombie eating infect
     */

    private double height;
    private boolean isHungry;
    private int health;
    private String color;
    private int endurance;
    private String name;

    // constructor
    public Zombie() {
        height = 6.5;
        isHungry = true;
        health = 0;
        color = "Green";
        endurance = 23;
        name = "Bob";

    }

    public Zombie(String newName, double newHeight) {
        height = newHeight;
        isHungry = true;
        health = 0;
        color = "Green";
        endurance = 23;
        name = newName;
    }

    // getters -> get/return a private instance value
    public double getHeight() {
        return height;
    }

    public String getName() {
        return name;
    }

    public int getEndurance() {
        return endurance;
    }

    public int getHealth() {
        return health;
    }
    // setters

    public void setName(String newName) {
        name = newName;
    }

    public void setHeight(double newHeight) {
        height = newHeight;
    }

    public void eat() {
        System.out.println(name + " ate a brain!");
        System.out.println("MMMMMM!");
    }

    public void infect() {
        System.out.println(name + " bit another human!");
        System.out.println("The end it near! RUN!");
    }

    public String toString() {
        String initialSentance = "This zombie is called" + name + ".";
        String data = "Height: " + height + "\nisHungry: " + isHungry + "\nHealth: " + health
                + "\nColor: " + color + "\nEndurance: " + endurance;
        return initialSentance + data;
    }

    public boolean equals(Zombie other) {
        return other.name.equals(name) && isHungry == other.isHungry;
    }
}
