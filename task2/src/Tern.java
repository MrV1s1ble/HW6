import java.util.Scanner;

public class Tern {
    public static void main(String[] args) {
        System.out.println("\t\t\t***Программа определения весов товаров***\n\n\n");

        System.out.println("Введите первый вес: ");
        double first = new Scanner(System.in).nextDouble();

        System.out.println("Введите второй вес: ");
        double second = new Scanner(System.in).nextDouble();

        System.out.println("Введите третий вес: ");
        double third = new Scanner(System.in).nextDouble();

        double greatest = 0;
        double average = 0;
        double smallest = 0;

        greatest = (first > second) ? (first > third ? first : third) : (second > third ? first : third);

        average = (first + second + third) / 3;

        smallest = (first < second) ? (first < third ? first : third) : (second < third ? first : third);

        System.out.println("Наименьший вес: " + smallest);
        System.out.println("Наибольший вес: " + greatest);
        System.out.println("Средний вес: " + average);
    }
}
