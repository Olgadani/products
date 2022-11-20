import java.util.Objects;

public class Products {
    private String name;
    private double price;
    private double quantity;
    private boolean checked;

    public Products(String name, double price, double quantity) {
        if (name == null || name.isEmpty() || price < 0 || quantity < 0) {
            throw new IllegalArgumentException("Заполните карточку товара полностью");
        }
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.checked = false;
    }

    public boolean isChecked() {
        return checked;
    }

    public void setChecked() {
        this.checked = true;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public double getQuantity() {
        return quantity;
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
        String checkString = this.isChecked() ? "Да" : "Нет";
        return String.format("%s, Цена: %s, Количество: %s, Куплен: %s",
                this.name, this.price, this.quantity, checkString);
    }
}
