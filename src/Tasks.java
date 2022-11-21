import java.util.Objects;

public class Tasks {
    private final int value1;
    private final int value2;
    public Tasks(int value1, int value2) {

        this.value1 = value1;
        this.value2 = value2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tasks tasks = (Tasks) o;
        return (value1 == tasks.value1 && value2 == tasks.value2) || (value1 == tasks.value2 && value2 == tasks.value1);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value1 * value2, value1 + value2);
    }

    @Override
    public String toString() {
        return "value1=" + value1 +
                ", value2=" + value2;
    }
}
