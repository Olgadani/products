import java.time.LocalDate;
import java.util.Objects;

public class Passport {
    private final int number;
    private final String name;
    private final String middleName;
    private final String surname;
    private final LocalDate localDate;

    public Passport(int number, String name, String middleName, String surname, LocalDate localDate) {
        this.number = number;
        this.name = name;
        this.middleName = middleName;
        this.surname = surname;
        this.localDate = localDate;
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getSurname() {
        return surname;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Passport passport = (Passport) o;
        return number == passport.number;
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }
}
