public class Example {
    public static void main(String[] args) {
        // primitives
        int wholeNumber = 100;
        float decimalNumber = 20.42f;
        double moreAccurateDecimalNumber = 100.12349761234;
        long biggerWholeNumber = -8589934592l;

        double sum = wholeNumber + moreAccurateDecimalNumber + decimalNumber + biggerWholeNumber;
        // System.out.println(sum);

        // class versions of primitives
        Integer betterWholeNumber = wholeNumber;
        Double betterMoreAccurateDecimalNumber = moreAccurateDecimalNumber;
        
        Integer betterSum = betterWholeNumber + betterMoreAccurateDecimalNumber.intValue();

        // System.out.println(betterSum);

        Integer n = 2;
        n = 3;
        // n = n + 5;
        n += 5;
        n *= n;

        // n = 64;

        n %= 3;

        n = ((2 + 4) * 3) - n;

        // Double t = n.doubleValue() / 3.0; // n = n / 3;

        Boolean c1 = n < 80;
        Boolean c2 = n > -3;
        Boolean c3 = n == n;

        
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
    }
}
