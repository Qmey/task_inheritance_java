import java.io.*;

public class word_1task {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
        PrintWriter writer = new PrintWriter(new FileWriter("output.txt"));

        // Чтение количества задач
        int N = Integer.parseInt(reader.readLine());

        // Чтение времени решения каждой задачи
        String[] timeStrings = reader.readLine().split(" ");
        int[] times = new int[N];
        for (int i = 0; i < N; i++) {
            times[i] = Integer.parseInt(timeStrings[i]);
        }

        // Подсчет штрафного времени для каждого студента
        int[] penalties = new int[3];
        for (int i = 0; i < N; i++) {
            penalties[0] += times[i] * (i + 1); // Пятикурсник
            penalties[1] += times[N - i - 1] * (i + 1); // Третьекурсник
            penalties[2] += times[getMinIndex(times)] * (i + 1); // Первокурсник
            times[getMinIndex(times)] = Integer.MAX_VALUE; // Удаление уже учтенной задачи
        }

        // Определение победителя
        int winner = getWinner(penalties);

        // Вывод результата
        writer.println(winner);
        writer.close();
    }

    // Метод для определения индекса самой быстрорешаемой задачи
    private static int getMinIndex(int[] arr) {
        int min = Integer.MAX_VALUE;
        int minIndex = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                minIndex = i;
            }
        }
        return minIndex;
    }

    // Метод для определения победителя
    private static int getWinner(int[] penalties) {
        if (penalties[0] < penalties[1] && penalties[0] < penalties[2]) {
            return 1; // Победил пятикурсник
        } else if (penalties[1] < penalties[0] && penalties[1] < penalties[2]) {
            return 2; // Победил третьекурсник
        } else {
            return 3; // Победил первокурсник
        }
    }
}
