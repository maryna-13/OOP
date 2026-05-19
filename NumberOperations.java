import java.util.ArrayList;
import java.util.List;

public class NumberOperations {
    public static void main(String[] args) {
        // числа різних типів
        int intNum1 = 10;
        int intNum2 = 30;
        int intNum3 = 50;
        int intNum4 = 70;
        int intNum5 = 90;

        double doubleNum1 = 20.5;
        double doubleNum2 = 40.7;
        double doubleNum3 = 60.3;
        double doubleNum4 = 80.1;
        double doubleNum5 = 100.9;


        // додавання до списку
        List<Number> allMyNumbers = new ArrayList<>();
        allMyNumbers.add(intNum1);
        allMyNumbers.add(doubleNum1);
        allMyNumbers.add(intNum2);
        allMyNumbers.add(doubleNum2);
        allMyNumbers.add(intNum3);
        allMyNumbers.add(doubleNum3);
        allMyNumbers.add(intNum4);
        allMyNumbers.add(doubleNum4);
        allMyNumbers.add(intNum5);
        allMyNumbers.add(doubleNum5);

        // виводимо числа на екран
        System.out.println("1. Всі числа: " + allMyNumbers);

        // виводимо числа у форматі цілих чисел
        System.out.print("2. Цілі числа: ");
        for (Number number : allMyNumbers) {
            System.out.print(number.intValue() + " ");
        }
        System.out.println();


        // виводимо числа у форматі дробних чисел з 2ма знаками після коми
        System.out.print("3. Формат дробних чисел (2 знаки): ");
        for (Number number : allMyNumbers) {
            System.out.print(String.format("%.2f", number.doubleValue()) + " ");
        }
        System.out.println();

        // збереження чисел в різних списках в залежності від їх типу 
        List<Integer> intList = new ArrayList<>();
        List<Double> doubleList = new ArrayList<>();
        for (Number number : allMyNumbers) {
            if (number instanceof Integer) {
                intList.add((Integer) number);
            } else if (number instanceof Double) {
                doubleList.add((Double) number);
            }
        }
        System.out.println("4. Цілі окремо: " + intList);
        System.out.println("5. Дробні окремо: " + doubleList);




        // сума всіх чисел
        double sum = 0;
        for (Number number : allMyNumbers) {
            sum += number.doubleValue();
        }
        System.out.println("6. Сума всіх чисел: " + sum);

        // добуток перших п'яти чисел
        double product = 1;
        for (int i = 0; i < 5; i++) {
            product *= allMyNumbers.get(i).doubleValue();
        }
        System.out.println("7. Добуток перших п’яти чисел: " + product);

        // новий список, де кожне число початкового списку помножене на 2
        List<Double> multipliedByTwo = new ArrayList<>();
        for (Number number : allMyNumbers) {
            multipliedByTwo.add(number.doubleValue() * 2);
        }
        System.out.println("8. Помножені на 2: " + multipliedByTwo);
    }
}

