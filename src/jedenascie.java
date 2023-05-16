public class jedenascie {
    public static void main(String[] args) {
        int a = 1;
        int b = 1;
        int c = 1;
        if (a <= b + c && b <= a + c && c <= a + b && a > 0 && b > 0 && c > 0) {
            System.out.println("True");
            int sum = a + b + c;
            System.out.println("Obwod: " + sum);
        }
        else {
            System.out.println("False");
        }
    }
}
