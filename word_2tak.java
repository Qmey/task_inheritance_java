import java.util.Scanner;

public class word_2tak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Чтение параметров комнаты
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int h = scanner.nextInt();

        // Чтение параметров двери
        int w = scanner.nextInt();
        int q = scanner.nextInt();

        // Чтение параметров окна
        int s = scanner.nextInt();
        int p = scanner.nextInt();

        // Чтение количества квадратных метров, которые можно покрасить одной банкой краски
        int k = scanner.nextInt();

        // Вычисление площади стен
        int wallArea = 2 * h * (a + b) - (w * q) - (s * p);

        // Вычисление количества банок краски
        int cansNeeded = (int) Math.ceil((double) wallArea / k);

        // Вывод результата
        System.out.println(cansNeeded);

        scanner.close();
    }
}
