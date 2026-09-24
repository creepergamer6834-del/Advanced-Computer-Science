public class House {

    // instance variables
    private String address;

    // constructors
    public House() {
        address = "3700 Coldwater Canyon Ave.";
    }

    public House(String address) {
        this.address = address;
    }

    public String aboutHouse() {
        return this.toString() + "\nAddress: " + address;
    }
}
