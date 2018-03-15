import java.util.HashMap;
import java.util.Map;

public class MapExample {

    public static void main(String[] args) {

        Map<String, String> names = new HashMap<>();

        names.put("Pirmas", "Jonas");
        names.put("Antras", "Antanas");
        names.put("Trecias", "Zigmas");
        names.put("Ketvirtas", "Gintas");
        names.put("Penktas", "Bronius");

        for (String name : names.keySet()){
            System.out.println(name +" "+ names.get(name));
        }
    }
}
