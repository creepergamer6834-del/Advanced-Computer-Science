public class ControlFlow {
    public static void main(String[] args) {
        int score = 85;
        if(score >= 63){
            System.out.println("Passed");
        } else {
            System.out.println("Failed");
        }
        //an if statement checks the BOOLEAN condition inside the parenthesis, and it triggers the first instance in which the BOOLEAN condition is true
        if(score >= 63) {
            System.out.println("Passed 1");
        } else if(score==63){System.out.println("Passed 2");
        }
        
        int temperature = 30;
        if (temperature > 90){
            System.out.println("Holy smokes it's hot");
        } else if (temperature >= 60){
            System.out.println("This is nice.");
        } else {
            System.out.println("I need hot chocolate");
        }

    }
}    
