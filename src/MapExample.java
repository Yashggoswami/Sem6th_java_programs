import java.util.*;

public class MapExample {
        public static void main(String[] args) {
                SortedMap<Integer, String> map = new TreeMap<>();
                map.put(12, "yash");
                map.put(11, "vinay");
                map.put(13, "rahul");
                System.out.println(map.entrySet());
                Set<Map.Entry<Integer, String>> set = map.entrySet();
                Iterator i = set.iterator();
                while (i.hasNext()) {
//            Map.Entry m= (Map.Entry) i.next();
                        System.out.println(i.next());
//            System.out.println(m.getKey()+" "+m.getValue());
                }

        }
//    public static void main(String[] args) {
//        Map<Integer, String> mapsort = new TreeMap();
//
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter Keys and Values");
//
//        for (int i = 0; i < 5; i++) {
//            int key = sc.nextInt();
//            String str = sc.next();
//            mapsort.put(key, str);
//
//        }
//        Map<Integer, String> maps = Collections.synchronizedMap(mapsort);
//        for (Map.Entry map : maps.entrySet()) {
//            System.out.println(map.getKey() + " " + map.getValue());
//        }
//        Iterator itr = mapsort.entrySet().iterator();
//
//    }
}
