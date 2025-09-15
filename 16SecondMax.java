public class SecondMax {
    public static void main(String[] args) {
        int a = 10, b = 25, c = 15;
        int secondMax;

        if ((a > b && a < c) || (a > c && a < b)) {
            secondMax = a;
        } else if ((b > a && b < c) || (b > c && b < a)) {
            secondMax = b;
        } else {
            secondMax = c;
        }

        System.out.println("Second maximum is: " + secondMax);
    }
}



or
int[] n={a,b,c};
Arrays.sort(n);
System.out.println(
