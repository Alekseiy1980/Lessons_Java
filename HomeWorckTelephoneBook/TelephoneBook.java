import java.util.HashMap;
import java.util.Map;

public class TelephoneBook {
    public static void main(String[] args) {
        /* name: "John" , telephone : [234. 546] */
        Map<String, String> mapName = new HashMap<String, String>();
        Map<String, String> mapPhone = new HashMap<String, String>();
        Map<String, String> mapBook = new HashMap<String, String>();
        String numbers = " 123  345  567";
        mapName.putIfAbsent("name", " John ");
        mapPhone.putIfAbsent("phone", numbers);

        mapBook.putIfAbsent(mapName.get("name"),mapPhone.get("phone"));

        System.out.println(mapBook.toString());

    }
}
