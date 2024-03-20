class habr_2task {
    private int[] extended_values; // значения

    public habr_2task(int[] values, int[] weights) {
        // Сумма длин всех отрезков
        int sum = 0;
        for (int weight : weights) {
            sum += weight;
        }

        extended_values = new int[sum];
        int cursor = 0;

        for(int i = 0; i < weights.length; i++){
            for(int j = 0; j < weights[i]; j++){
                extended_values[cursor++] = values[i];
            }
        }
    }

    /*
        Массив extended_values уже заполнен,
        так что остаётся сгенерировать значение в промежутке
        [0; extended_values.length)
     */
    public int getRandom() {
        int random = (int) (Math.random() * ( extended_values.length - 1));
        return extended_values[random];
    }

    public static void main(String[] args) {
        // Пример использования класса habr_2task
        int[] values = {1, 2, 3}; // Пример значений
        int[] weights = {2, 3, 1}; // Пример весов

        habr_2task task = new habr_2task(values, weights);

        // Генерация случайного значения и его вывод
        int randomValue = task.getRandom();
        System.out.println("Random value: " + randomValue);
    }
}
