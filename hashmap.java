import java.util.HashMap;
public class TestHashMap {

    public static void main(String[]args) {
        //Create an empty hash map
        HashMap<String,Integer> map = new HashMap<>();

        //Add elements to the map
        map.put("java", 1);
        map.put("test", 2);
        map.put("Tifani",3);
        System.out.println(map.size());


    }
}
