import java.util.Random;

public class osiem {
    public static void main (String[]args){
        int tab[] = new int[5];
        int tab2[] = new int[tab.length];
        int tab3[] = new int [2 * tab.length];
        Random random = new Random();
        for (int i = 0; i < tab.length; i++) {
            tab[i] = random.nextInt(100);
            System.out.print(tab[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < tab.length; i++){
            tab2[i] = random.nextInt(100);
            System.out.print(tab2[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < tab.length; i++) {
            tab3[i] = tab[i];
            tab3[i + tab.length] = tab2[i];
        }
        for (int i = 0; i <tab3.length; i++) {
            System.out.print(tab3[i] + " ");
        }
    }
}
