public class szesc {
    public static void main(String[] args) {
    int tab[] = new int[100];
        for (int i = 0; i < tab.length; i++) {
            tab[i] = i;
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(tab[i] + " Fizz Buzz");
            }
                else if (i % 5 == 0) {
                System.out.println(tab[i] + " Buzz");
                }
                else if (i % 3 == 0) {
                System.out.println(tab[i] + " Fizz");
            }
                else {
                System.out.println(tab[i]);
            }
        }
    }
}
