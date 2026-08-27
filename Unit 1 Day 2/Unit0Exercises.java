public class Unit0Exercises {
    public static void main(String[] args) {
        System.out.println("--- Variable Snapshot ---");

        // TODO: Declare and initialize score, price, and isPassing.
        int score = 85;
        double price = 19.99;
        boolean isPassing = true;
        final double TAX_RATE = 0.0925;
        char letter = 'A';
        long population = 8000000000L;
        System.out.println("Name\tInitial Value\nScore:\t" + score + "\nDouble:\t" + price
                + "\nBoolean:" + isPassing + "\nTax Rate\t" + TAX_RATE + "\nLetter\t" + letter "\nPopulation\t" + population);

        // TODO: Print the original values using the required labels.

        System.out.println("--- After Updates ---");

        // TODO: Reassign score, price, and isPassing to their updated values.
        score += 5;
        price += 2.50;
        isPassing = false;
        TAX_RATE = 0.0926;
        letter = "A";
        population = 8000000000;
    
        // TODO: Print the updated values using the required labels.
        System.out.println("Name\tInitial Value\nScore:\t" + score + "\nDouble:\t" + price
                + "\nBoolean:" + isPassing + "\nTax Rate\t" + TAX_RATE + "\nLetter\t" + letter "\nPopulation\t" + population);
    }
}
