import java.util.Random;

public class jedenWstawianie {
    public static void main(String[] args) {
        int[] tab = new int[10];
        Random random = new Random();
        for(int i = 0; i < tab.length; i++) {
            tab[i] = random.nextInt(21);
            System.out.print(tab[i] + " ");
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
        System.out.println("Po sortowaniu:");
        for(int element : tab) {
            System.out.print(element + " ");
        }
    }
}
