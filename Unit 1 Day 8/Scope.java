public class Scope {
    // instance variables -> global variables, any method can access these
    private String test;

    public static void main(String[] args) {
        int count = 0;
        if (true) {
            count++;
        }
        // if (true){
        // count --;
        // }

        // casting is the deliberate conversion of one data type to another
        double bignumber = 50;
        System.out.println(bignumber);
        // ny apartmet -> cali house
        // cali house -> ny apartment
        int smallNumber = (int) 26.7;
        System.out.println(smallNumber);

        double bigFraction = (double) smallNumber / 100;
        System.out.println(bigFraction);

        String demoString = "Hello";
        String demoString2 = "World";
        System.out.println(demoString.length());
        System.out.println(demoString.substring(2, 4));

        // indexOf finds first case of whatever string in parenthesis
        System.out.println(demoString.indexOf("l"));

        // returns a positive if object is after compared, negative if object is before compared
        // 0 if equal
        System.out.println(demoString.compareTo(demoString2));

    }



    public void setTest(String test2) {
        this.test = test2;
    }

    public String toString() {
        test = "testing";
        return test;
    }
}
