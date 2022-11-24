import java.util.Objects;

public class Products {
    private String name;
    private double price;



    public Products(String name, double price) {
        if (name == null || name.isEmpty() || price < 0) {
            throw new IllegalArgumentException("Заполните карточку товара полностью");
        }
        this.name = name;
        this.price = price;


    }





    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Products products = (Products) o;
        return Objects.equals(name, products.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {

        return String.format("%s, Цена: %s",
                this.name, this.price);
    }
}
