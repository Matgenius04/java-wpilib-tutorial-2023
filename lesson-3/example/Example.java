public class Example {
    public static void main(String argString[]) {
        // Write your code below!
        Integer a = 5;
        Boolean conditional = a < 5; // this statement is true!
        // try to change the above conditional and see how it affects
        // the code below
        if (conditional) {
            System.out.println("I'm running");
        } else if (a == 5) {
            System.out.println("a is equal to 5");
        } else {
            System.out.println("It's now me that's running");
        }

        // What is the remainder of a / 2? 
        // What does it mean if it's equal to 0?
        if (a % 2 == 0) {
            System.out.println("a is even");
        }
        if (a % 2 == 1) {
            System.out.println("a is odd");
        }

        // 1+2+3+4+5+6+7+8+...+n
        Integer n = 10;
        Integer out = 0;

        for (Integer i = 1; i <= n; i++) {
            out += i;
        }
        System.out.println(out);
    }
}
