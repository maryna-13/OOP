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

        // виклик методів
        printAllNumbers(allMyNumbers);
        printIntegers(allMyNumbers);
        printDoubleFormat(allMyNumbers);
        separateNumbers(allMyNumbers);
        calculateSum(allMyNumbers);
        calculateProduct(allMyNumbers);
        multiplyByTwo(allMyNumbers);
    }

    // виведення всіх чисел
    public static void printAllNumbers(List<Number> numbers) {
        System.out.println("1. Всі числа: " + numbers);
    }

    // виведення у форматі цілих чисел
    public static void printIntegers(List<Number> numbers) {

        System.out.print("2. Цілі числа: ");

        for (Number number : numbers) {
            System.out.print(number.intValue() + " ");
        }

        System.out.println();
    }

    // виведення у форматі дробних чисел
    public static void printDoubleFormat(List<Number> numbers) {

        System.out.print("3. Формат дробних чисел (2 знаки): ");

        for (Number number : numbers) {
            System.out.print(String.format("%.2f", number.doubleValue()) + " ");
        }

        System.out.println();
    }

    // розділення чисел за типами
    public static void separateNumbers(List<Number> numbers) {

        List<Integer> intList = new ArrayList<>();
        List<Double> doubleList = new ArrayList<>();

        for (Number number : numbers) {

            if (number instanceof Integer) {
                intList.add((Integer) number);

            } else if (number instanceof Double) {
                doubleList.add((Double) number);
            }
        }

        System.out.println("4. Цілі окремо: " + intList);
        System.out.println("5. Дробні окремо: " + doubleList);
    }

    // сума всіх чисел
    public static void calculateSum(List<Number> numbers) {

        double sum = 0;

        for (Number number : numbers) {
            sum += number.doubleValue();
        }

        System.out.println("6. Сума всіх чисел: " + sum);
    }

    // добуток перших п'яти чисел
    public static void calculateProduct(List<Number> numbers) {

        double product = 1;

        for (int i = 0; i < 5; i++) {
            product *= numbers.get(i).doubleValue();
        }

        System.out.println("7. Добуток перших п’яти чисел: " + product);
    }

    // список чисел, помножених на 2
    public static void multiplyByTwo(List<Number> numbers) {

        List<Double> multipliedByTwo = new ArrayList<>();

        for (Number number : numbers) {
            multipliedByTwo.add(number.doubleValue() * 2);
        }

        System.out.println("8. Помножені на 2: " + multipliedByTwo);
    }
}