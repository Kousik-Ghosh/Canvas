import java.util.HashSet;
import java.util.List;

class Solution {
    public String destCity(List<List<String>> paths) {
        HashSet<String> from_city_set = new HashSet<>();
        for (List<String> from_to_city_pair : paths) {
            String from_city = from_to_city_pair.get(0);
            from_city_set.add(from_city);
        }
        for (List<String> from_to_city_pair : paths) {
            String to_city = from_to_city_pair.get(1);
            if (!from_city_set.contains(to_city)) {
                return to_city;
            }
        }
        return "";
    }
}