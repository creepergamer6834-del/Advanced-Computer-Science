public class References {
    // class -> blueprint for a new data type
    // refrence -> objects address
    // objects -> instantiated class types
    public static void main(String[] args) {
        House joyfulEstate = new House();
        House excellentEstate = new House();
        House julianTheBooleanHouse = excellentEstate;

        System.out.println("Equal?" + joyfulEstate.equals(excellentEstate));
        System.out.println("Equal 2?" + julianTheBooleanHouse.equals(excellentEstate));

        System.out.println(joyfulEstate.aboutHouse());
        System.out.println(julianTheBooleanHouse.aboutHouse());
        System.out.println(excellentEstate.aboutHouse());
    }
}
