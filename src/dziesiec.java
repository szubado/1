public class dziesiec {
    public static void main(String[] args) {
        int s = 3;
        int k = 5;
        int n = 4;
        int tab[] = new int[n];
        for (int i = 0; i < tab.length; i++) {
            tab[i] = i *k + s;
            System.out.print(tab[i] + " ");
        }
        int sum = 0;
        for (int i = 0; i < tab.length; i++) {
            sum = tab[i] + sum;
        }
        System.out.println();
        System.out.print("Wynik " + sum);
    }
}
