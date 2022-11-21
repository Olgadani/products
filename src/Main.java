import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Products banan = new Products("Бананы", 58.2, 1.5);
        Products apple = new Products("Яблоки", 65.8, 2.3);
        Products fish = new Products("Рыба", 128.7, 1.4);
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


}
