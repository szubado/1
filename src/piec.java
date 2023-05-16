import java.util.Random;

public class piec {
    public static void main(String[] args) {
        int tab[] = new int[10];
        Random random = new Random();
        for(int i = 0; i < tab.length; i++) {
            tab[i] = random.nextInt(6);
            System.out.print(tab[i] + " ");
        }
        int piatka = 0;
        for(int element : tab) {
            if(element == 5) {
                piatka++;
            }
        }
        System.out.println();
        System.out.println("Ilosc powtorzen liczby 5 to: " + piatka);

    }
}
