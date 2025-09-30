//package HashSet;

import java.util.HashSet;
import java.util.Scanner;

public class Input_hash {
    public static void main(String[] args) {
        System.out.println("ENter elements to add in hashSet");
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<n;i++){
            int num = sc.nextInt();
            set.add(num);

        }
        System.out.println(set);
    }
    
}
