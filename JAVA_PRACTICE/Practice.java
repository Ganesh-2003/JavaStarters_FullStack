import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Practice {
    public static void main(String[] args) {
        
        List<Integer> arr = new ArrayList<>();
        Map<String, Integer> mp = new HashMap<>();

        mp.put("Ganesh", 20);
        mp.put("Veera", 100);

        for(Map.Entry<String, Integer> entry: mp.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
    }
}
