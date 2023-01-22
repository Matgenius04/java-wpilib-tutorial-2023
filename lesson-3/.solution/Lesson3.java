public class Lesson3 {
    public static void main(String[] args) {
        Integer a = 5;
        Integer out = 1;
        
        if (a % 2 == 0) {
            for (Integer i = a; i > 0; i -= 2) {
                out *= i;
            }
        } else {
            for (Integer i = a; i > 0; i--) {
                out *= i;
            }
        }
        System.out.println(out);
    }
}
