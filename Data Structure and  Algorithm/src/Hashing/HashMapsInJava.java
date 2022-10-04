package Hashing;

import java.util.HashMap;
import java.util.Map;

public class HashMapsInJava {
    public static void main(String[] args) {
        //Here we will learn about hashMap
        //Declaration of HashMap
        HashMap<Integer , Integer> map= new HashMap<>();
        /*  here we will use key and value in the HashMap
        First Integer is a Key and another one is a value of the key
        keys are unique and values can be duplicates

         */
        //Insertion in the HashMap
        //put method we will use
        map.put(0,1);
        map.put(1,1);
        map.put(2,2);
        map.put(3,3);
        System.out.println(map);

        // contains methods in HashMap
        /* we can search via key and value
        containsKey()

        containsValue()


        */
        if(map.containsKey(1)){
            System.out.println("YEs available");
        }else{
            System.out.println("No");
        }
        if(map.containsValue(1)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }

        // if we want  to get the value we can get from the key also  we will use map.get(" Key") method
        System.out.println(map.get(5));
        //if key is not available then it will show null value

        /*  iteration in hashmap

        "" map.Entry<Integer,Integer> element:map.entrySet()  ""
         */
        for (var e: map.entrySet()){
            System.out.println("e.getKey() = " + e.getKey());

        }
        map.put(1,8);    // In   hashmap if we will use same key again and again to insert the elements to the map
                        // then the latest value will update in the map
        for(Map.Entry<Integer,Integer>e:map.entrySet()){
            System.out.println("e.getValue() = " + e.getValue());

        }
        for(var e: map.entrySet()){
            System.out.println(e.getKey());
        }
    }
}
