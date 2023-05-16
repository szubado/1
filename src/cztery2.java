import java.util.Random;

public class cztery2 {
    public static void main(String[] args) {
        int tab[] = new int[10];
        Random random = new Random();
        for(int i = 0; i < tab.length; i++) {
            tab[i] = random.nextInt(21);
            for (int j = 0; j < i; j++) {
                if(tab[j] == tab[i]) {
                    i--;
                }
            }
        }

        while(true) {
        boolean flag = false;
        for(int i = 0; i < tab.length-1; i++) {
            if(tab[i + 1] < tab[i]) {
                int temp = tab[i];
                tab[i] = tab[i + 1];
                if (i != 0 && temp < i - 1) {
                    tab[i - 1] = tab[i];
                }
                tab[i + 1] = temp;
                flag = true;
            }
        }
        if(!flag) {
            break;
        }
    }
        System.out.println();
        for(int i = 0; i < tab.length; i++) {
        System.out.print(tab[i] + " ");
    }
}
}
