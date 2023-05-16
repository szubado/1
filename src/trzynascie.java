import java.util.Random;

public class trzynascie {
    public static void main(String[] args) {
        int liczniki[] = new int[11];
        Random random = new Random();
        for ( int i = 0; i <10000; i++) {
            //wynik ma wartosci od 2 do 12
            int wynik = random.nextInt(1, 7) + random.nextInt(1, 7);
            // wnik 12 wpadnie do indeksu 10 jak +1
            liczniki[wynik - 2]++;
        }
        int max = liczniki[0];
        int pozycja = 0;
        for (int i = 0; i < 11; i++) {
            System.out.print(liczniki[i] + " ");
            // sprawdzenie ktory wynik jest najwiekszy
            if (liczniki[i] > max) {
                max = liczniki[i];
                pozycja = i;
            }
        }
        System.out.println();
        System.out.println("Najwiecej bylo: " + (pozycja + 2) + "-" + max);
    }
}
