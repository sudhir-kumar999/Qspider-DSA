//package HashSet;

import java.util.HashSet;
import java.util.Scanner;

public class Input_String_hash {
    public static void main(String[] args) {
        
        System.out.println("enter no of elements to add");
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        sc.nextLine();
        HashSet<String> set = new HashSet<>();
        for(int i=0;i<n;i++){
            System.out.print("Enter string " + (i + 1) + ": ");
            String str = sc.nextLine();
            set.add(str);

        }
        System.out.println(set);
    }
    
}
