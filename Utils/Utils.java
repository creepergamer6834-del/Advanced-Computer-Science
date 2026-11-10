public class Utils {
    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.println(i + " ");
        }
    }

    public static int randomNumber(int low, int high) {
        return (int) (Math.random() * (high - low) + low);
    }

    public static double toDouble(String text) {
        double a = Double.parseDouble(text);
        return a;
    }

    public static String describeChar(char value) {
        if (Character.isDigit(value)) {
            return "digit";
        } else if (Character.isLetter(value)) {
            return "letter";
        } else {
            return "other";
        }
    }

    public static boolean isInteger(String text) {
        if (text == null || text.isEmpty()) {
            return false;
        }
        int start = 0;
        if (text.charAt(0) == '-') {
            if (text.length() == 1) {
                return false;
            }
            start = 1;
        }
        for (int i = start; i < text.length(); i++) {
            if (!Character.isDigit(text.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static Integer parseOrNull(String text) {
        if (isInteger(text)) {
            return Integer.parseInt(text);
        } else {
            return null;
        }
    }

    public static int locate(String text, char target) {
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == target) {
                return i;
            }
        }
        return -1;
    }

    public static boolean isDecimal(String text) {
        if (text == null || text.isEmpty()) {
            return false;
        }

        int i = 0;
        if (text.charAt(0) == '-') {
            i++;
        }

        if (i >= text.length() || !Character.isDigit(text.charAt(i))) {
            return false;
        }

        int dotCount = 0;
        for (; i < text.length(); i++) {
            char current = text.charAt(i);
            if (Character.isDigit(current)) {
                continue;
            } else if (current == '.') {
                dotCount++;
                if (dotCount > 1) {
                    return false;
                }
            } else {
                return false;
            }
        }

        return true;
    }

    public static boolean onlyNumAndLet(String text) {
        if (text == null || text.isEmpty()) {
            return false;
        }
        for (int i = 0; i < text.length(); i++) {
            char current = text.charAt(i);
            if (!Character.isLetterOrDigit(current)) {
                return false;
            }
        }
        return true;
    }

    public static int countOccurrences(String text, char target) {
        if (text == null) {
            return 0;
        }
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == target) {
                count++;
            }
        }
        return count;
    }

    public static String reverse(String text) {
        if (text == null) {
            return null;
        }
        String result = "";
        for (int i = text.length() - 1; i >= 0; i--) {
            result += text.charAt(i);
        }
        return result;
    }

    public static int arrayMax(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            return 0;
        }
        int highest = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > highest) {
                highest = numbers[i];
            }
        }
        return highest;
    }

    public static int arrayMin(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            return 0;
        }
        int lowest = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < lowest) {
                lowest = numbers[i];
            }
        }
        return lowest;
    }

    public static double average(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            return 0.0;
        }
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return (double) sum / numbers.length;
    }

    public static boolean contains(int[] numbers, int target) {
        if (numbers == null) {
            return false;
        }
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                return true;
            }
        }
        return false;
    }
}