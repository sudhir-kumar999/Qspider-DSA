//package HashSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Add_collection {

    public static void main(String[] args) {
        System.out.println("Enter no of elements");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<n;i++){
            int num = sc.nextInt();
            set.add(num);
        }
        System.out.println(set);
        HashSet<Integer> set2 = new HashSet<>();
        set2.add(5);
        set2.add(6);
        set2.add(7);
        System.out.println(set2);

        if(set.contains(1)){
            System.out.println("element exist");

        } else{
            System.out.println("Not present");
        }

        // addAll() allow to add all element of set2 into set1

        set.addAll(set2);
        System.out.println(set);

        set.remove(1);
        System.out.println(set);

        Iterator <Integer> itr = set.iterator();
        while(itr.hasNext()){
            Integer element = itr.next();
            System.out.println(element);
        }
    }
    
}
