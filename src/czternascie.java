import java.util.Random;

public class czternascie {
    public static void main(String[] args) {
        int tab[] = new int[5];
        Random random = new Random();
        for (int i = 0; i < tab.length; i++) {
            tab[i] = random.nextInt(2);
            System.out.print(tab[i] + " ");
        }
        boolean isTrue = true;
        for (int i = 0; i < tab.length / 2; i++) {
            if (tab[i] == tab[tab.length - 1 - i]) {

            } else {
                isTrue = false;
            }
        }
        System.out.println(isTrue);
    }
}


