package week06;

public class MathDemo {

    public static int min(int a, int b) {
        if (a < b) {
            return a;
        } else {
            return b;
        }
    }

    public static int max(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static int sum(int[] args) {
        int total = 0;
        for (int i = 0; i < args.length; i++) {
            total += args[i];
        }
        return total;
    }

    public static void main(String[] args) {
        
        
        int minimum = MathDemo.min(15, 7);
        System.out.println(minimum);

        int maximum = MathDemo.max(15, 7);
        System.out.println(maximum);

        int[] myNumbers = {2, 4, 6, 8, 10};
        int arraySum = MathDemo.sum(myNumbers);
        System.out.println(arraySum);
    }
}