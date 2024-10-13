import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt(); // количество тестов
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < N; i++) {
            int K = scanner.nextInt(); // количество контейнеров
            double[] priorities = new double[K];
            for (int j = 0; j < K; j++) {
                String myDouble = scanner.next(); 
                priorities[j] = Double.parseDouble(myDouble);
                // priorities[j] = scanner.nextInt();
            }

            if (canSortContainers(priorities)) {
                result.append("1\n");
            } else {
                result.append("0\n");
            }
        }

        System.out.print(result.toString());
    }

    private static boolean canSortContainers(double[] priorities) {
        Stack<Double> stack = new Stack<>();
        int expected = 1; // предполагаемая степень срочности
        int n = priorities.length;

        // Преобразуем степени срочности в массив с порядком
        double[] sortedPriorities = Arrays.copyOf(priorities, n);
        Arrays.sort(sortedPriorities);
        
        // Индекс для отслеживания позиции в отсортированном массиве
        int sortedIndex = 0;

        for (double priority : priorities) {
            // Перемещаем контейнеры в накопитель (стек)
            stack.push(priority);
            
            // Пока верхний элемент стека соответствует ожидаемому, перемещаем его в цех В
            while (!stack.isEmpty() && stack.peek() == sortedPriorities[sortedIndex]) {
                stack.pop();
                sortedIndex++;
            }
        }

        // Проверяем, остались ли элементы в стеке, которые не соответствуют порядку
        return stack.isEmpty();
    }
}
