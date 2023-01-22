class Lesson2 {
    public static void main(String argString[]) {
        // Write your code below!
        Integer a = 5;
        Integer b = 1;
        Double c = 93.9;

        Integer a1 = a - 1 + b;
        Double a2 = (a * b * c) / 3;
        Double a3 = (a*a - b + c) % 9;

        Double a4 = a1 + a2 + a3;

        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        System.out.println(a4.intValue());
    }
}