import java.util.Random;

public class czter {
    public static void main(String[] args) {
        int tab[] = new int[10];
        Random random = new Random();
        for(int i = 0, left = 0, upper = 9; i < tab.length; i++, left = tab[i - 1] + 1, upper++) {
            tab[i] = random.nextInt(left, upper);
            System.out.print(tab[i] + " ");
        }
        }

    }

