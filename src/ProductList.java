import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ProductList {
    private final Set<Products> products = new HashSet<>();

    public void addProduct(Products product) {
        if (product == null) {
            return;
        }
        if (this.products.contains(product)) {
            throw new IllegalArgumentException("Продукт уже есть в списке");
        } else {
            this.products.add(product);
        }
    }

    public void checkProduct(String name) {
        for (Products product : this.products) {
            if (product.getName().equals(name)) {
                product.setChecked();
                break;
            }
        }
    }

    public void removeProduct(String name) {
        Iterator<Products> productsIterator = this.products.iterator();
        while (productsIterator.hasNext()) {
            if (productsIterator.next().getName().equals(name)) {
                productsIterator.remove();
                break;
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Список продуктов: ").append("\n");
        for (Products product : this.products) {
            stringBuilder.append(product).append("\n");
        }
        return stringBuilder.toString();
    }
}


