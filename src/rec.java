import java.util.*;
import java.util.stream.Collectors;

public class rec {

    public static void main(String[] args) {

//        String str = "java forever";
//
//        System.out.println(recur(str));
//
//        HashMap<Integer,Integer> map = new HashMap<>();
//        map.put(1,11);
//        map.put(2,22);
//        map.put(3,33);
//
//        for(Integer i : map.keySet()){
//            System.out.println(map.get(i));
//        }
//
//        map.forEach((k,v) -> System.out.println(k + "key " + v + "value"));

        set();

    }

    static public String recur(String str){

        if(str.length() < 2){
            return str;
        }
        return recur(str.substring(1)) + str.charAt(0);
    }

    public static void set(){

        List<Integer> set = new ArrayList<>();
        set.add(1);
        set.add(25);
        set.add(645);
        set.add(80);

        int[] arr = {123,52,2563,2};
        TreeSet<Integer> set2 = new TreeSet<>();


        set2.add(1);
        set2.add(25);
        set2.add(645);
        set2.add(80);

        set.stream().forEach((v -> System.out.println(v)));
        set.stream().sorted().collect(Collectors.toSet());
        set.stream().forEach((v -> System.out.println(v)));


    }


}
