// package Hashmap;
import java.util.*;

public class Hashing {
    public static void main(String[] args) {

        //syntax empty hashmap at starting 
        //      key👇   value👇 👇var_name can be use another name
        HashMap<String , Integer>map=new HashMap<>();
        //                           👆 use to create new object
        // we use .put to insert element variable_name.put()
//varname👇 👇insert 👇key    👇value
        map.put("India", 120);
        map.put("USA", 90);
        map.put("UK", 60);
        map.put("Japan", 40);
        map.put("Russia", 110);
        System.out.println(map);
// again insert to same key will update the old value and give new value
// if old keu is not exists then it create a new one
        map.put("Russia", 180);
        System.out.println(map);
        //Search
        if(map.containsKey("Russia")){
            System.out.println("Key is present in the map");
        } else{
            System.out.println("Key is not present in the map");
        }
        //get value of key use.get
        System.out.println(map.get(("china"))); //return null bcz it is not in hashmap
        System.out.println(map.get(("Russia"))); // return updated value

        //int[] arr={10,11,15,12,18,19,20};
        // 1st way to write or iterate
        // for(int i=0;i<arr.length;i++){
        //     System.out.print(arr[i]+" ");
        // }
        // System.out.println();
        // // 2nd way to write or iterate
        // for(int val : arr){
        //     System.out.print(val+" ");
        // }
        // System.out.println();

        //for(int val : arr);
        for( Map.Entry<String , Integer> e : map.entrySet())
        // <-------int type------------>   <---arr--------->
        {
            System.out.println(e.getKey());
            System.out.println(e.getValue());

        }

        map.remove("UK");
        System.out.println(map);

    }
    
}
