import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PhoneGuide {
    private final Map<FullName, String> guide = new HashMap<>();

    public void addPhone(FullName fullName, String phone) {
        guide.put(fullName, phone);
    }

    public Set<Map.Entry<FullName, String>> getEntries() {
        return guide.entrySet();
    }
}
