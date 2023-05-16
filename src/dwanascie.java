public class dwanascie {
    public static void main(String[] args) {
        double w = 85;
        double h = 180;
        double BMI = w / ( h * h ) * 10000;
        System.out.println(BMI);
        if (BMI < 18.5) {
            System.out.println("Niedowaga");
        }
        else if (BMI < 24.9) {
            System.out.println("Waga prawidlowa");
        }
            else if (BMI < 29.9) {
            System.out.println("Nadwaga");
        }
            else {
            System.out.println("Otylosc");
        }
    }
}
