import java.util.Scanner;

class MilesTokm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double miles, km;

        System.out.println(;"Enter miles: ");

        miles = scanner.nextDouble();

        km = miles * 1.609;

        System.out.println(miles + " miles = " + km + " km");
    }
}