public class Main {

    public static void main(String[] args) {
        boolean x = SumOddRange.isOdd(5);
        System.out.println(x);
        int a = SumOddRange.sumOdd(1, 100);
        int b = SumOddRange.sumOdd(-1, 100);
        int c = SumOddRange.sumOdd(13, 13);
        int d = SumOddRange.sumOdd(100, -100);
        int e = SumOddRange.sumOdd(100, 1000);
        int f = SumOddRange.sumOdd(1000, 100);
        System.out.println("SumOdd A = " + a);
        System.out.println("SumOdd B = " + b);
        System.out.println("SumOdd C = " + c);
        System.out.println("SumOdd D = " + d);
        System.out.println("SumOdd E = " + e);
        System.out.println("SumOdd F = " + f);
    }
}
