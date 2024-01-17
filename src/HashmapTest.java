import java.security.KeyStore;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashmapTest {
    public static void main(String[] args) {

        HashMap <Integer , String > map = new HashMap<Integer , String>();

        map.put(1, "England");
        map.put(2, "India");
        map.put(4, "Australia");
        map.putIfAbsent(3, "Canada");
        map.putIfAbsent(2, "singapore");
        System.out.println(map.keySet());

        Set<Map.Entry<Integer , String>> abc = map.entrySet();

        for (Map.Entry<Integer , String> element : abc){

            System.out.println("NEW SET VALUE:"+ element.getKey() +" VALUES : "+element.getValue());
        }

        HashMap <Integer ,String> numbers = new HashMap<Integer, String>();
        numbers.putAll(map);
        numbers.putIfAbsent(3, "Canada");
        numbers.putIfAbsent(2, "singapore");
        //System.out.println(numbers.values());

        numbers.replace(2,"Norway");

        //numbers.replaceAll((key, value) -> value.toUpperCase());
        numbers.replaceAll((key, value)-> value.toLowerCase());
        System.out.println(numbers.entrySet());

        HashMap<String, String> sqare = new HashMap<String, String>();
        sqare.put("Arjun","Neloore");
        sqare.put("Ravi", "kavali");

        sqare.remove("Arjun");
        System.out.println(sqare);

        int num = sqare.size();
        System.out.println(num);

        boolean s = sqare.isEmpty();
        System.out.println(s);

        sqare.clear();
        System.out.println(sqare.size());

        if(sqare.containsKey("Ravi")){
            System.out.println("Hashmap contains value");
        }else {
            System.out.println("Hashmap is not having key");
        }

        if(!sqare.containsKey("malli")){
            sqare.put("malli","secabd");
        }
        System.out.println("Assewds:"+ sqare);

        //sqare.replaceAll((key,value)-> value.key * key);

        HashMap < Integer, String > emp = new HashMap < > ();

        emp.put(101, "Amit");
        emp.put(102, "Arun");
        emp.put(103, "Akas");
        emp.put(104, "Ram");
        emp.put(105, "Mohan");

        Set < Integer > keys = emp.keySet();


    }

}
