import java.util.Scanner;

public class word_3task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Чтение количества холодильников, микроволновок и телевизоров
        int L = scanner.nextInt();
        int M = scanner.nextInt();
        int N = scanner.nextInt();

        // Инициализация переменных для хранения наилучшей скидки и соответствующих товаров
        double bestDiscount = -1;
        int bestFridge = -1;
        int bestMicrowave = -1;
        int bestTV = -1;

        // Чтение данных о холодильниках
        for (int i = 0; i < L; i++) {
            int price = scanner.nextInt();
            int discount = scanner.nextInt();

            double discountedPrice = price * (1 - discount / 100.0);
            if (discountedPrice > bestDiscount) {
                bestDiscount = discountedPrice;
                bestFridge = i + 1;
            }
        }

        // Чтение данных о микроволновках
        for (int i = 0; i < M; i++) {
            int price = scanner.nextInt();
            int discount = scanner.nextInt();

            double discountedPrice = price * (1 - discount / 100.0);
            if (discountedPrice > bestDiscount) {
                bestDiscount = discountedPrice;
                bestMicrowave = i + 1;
            }
        }

        // Чтение данных о телевизорах
        for (int i = 0; i < N; i++) {
            int price = scanner.nextInt();
            int discount = scanner.nextInt();

            double discountedPrice = price * (1 - discount / 100.0);
            if (discountedPrice > bestDiscount) {
                bestDiscount = discountedPrice;
                bestTV = i + 1;
            }
        }

        // Вывод результатов
        System.out.println(bestFridge + " " + bestMicrowave + " " + bestTV);

        scanner.close();
    }
}
