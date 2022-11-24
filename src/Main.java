import java.util.*;

public class Main {
    public static void main(String[] args) {
        Products banan = new Products("Бананы", 58.2);
        Products apple = new Products("Яблоки", 65.8);
        Products fish = new Products("Рыба", 128.7);
        ProductList productList = new ProductList();
        productList.addProduct(banan);
        productList.addProduct(apple);
        productList.addProduct(fish);
        System.out.println(productList);
        numbersRemove();
        MultiplicationTable multiplicationTable = new MultiplicationTable();
        System.out.println(multiplicationTable);
        Tasks task1 = new Tasks(3, 5);
        Tasks task2 = new Tasks(4, 5);
        Set<Tasks> set = new HashSet<>();
        set.add(task1);
        set.add(task2);
        System.out.println(set);
        System.out.println("Телефонная книга");
        PhoneGuide phoneGuide = new PhoneGuide();
        while (phoneGuide.getEntries().size() < 20) {
            phoneGuide.addPhone(getRandomName(), getPhoneNumber());
        }
        for (Map.Entry<FullName, String> entry : phoneGuide.getEntries()) {
            System.out.printf("%s - %s%n", entry.getKey(), entry.getValue());
        }
        System.out.println("Task 2.2");
        Map<Integer, String> orderedMap = new LinkedHashMap<>();
        orderedMap.put(1, "test1");
        orderedMap.put(2, "test2");
        orderedMap.put(3, "test3");
        orderedMap.put(4, "test4");
        orderedMap.put(5, "test5");
        orderedMap.put(6, "test6");
        orderedMap.put(7, "test7");
        orderedMap.put(8, "test8");
        orderedMap.put(9, "test9");
        orderedMap.put(10, "test10");
        for (Map.Entry<Integer, String> entry : orderedMap.entrySet()) {
            System.out.printf("%d : %s%n", entry.getKey(), entry.getValue());
        }
    }

    private static void numbersRemove() {
        Set<Integer> numbers = new HashSet<>(20);
        Random random = new Random();
        while (numbers.size() < 20) {
            numbers.add(random.nextInt(1000));
        }
        System.out.println(numbers);
        Iterator<Integer> numberIterator = numbers.iterator();
        while (numberIterator.hasNext()) {
            int number = numberIterator.next();
            if (number % 2 != 0) {
                numberIterator.remove();
            }
        }
        System.out.println(numbers);
    }

    private final static Random RANDOM = new Random();
    public static FullName getRandomName() {
        String name = "Test" + RANDOM.nextInt(1000000);
        String surname = "TestLast" + RANDOM.nextInt(1000000);
        return new FullName(name, surname);
    }

    public static String getPhoneNumber() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 11; i++) {
            stringBuilder.append(RANDOM.nextInt(10));
        }
        return stringBuilder.toString();
    }



}
