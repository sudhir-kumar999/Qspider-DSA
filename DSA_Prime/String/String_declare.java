//package String;

import java.util.Scanner;

public class String_declare {
    public static void main(String[] args) {
        
        // String name="Sudhir";
        // String Fullname="Sudhir kumar";
        // String sentence = "My name is sudhir kumar";

        //System.out.println(name);
        System.out.println("Enter your name");
        Scanner sc =new Scanner(System.in);
        // for taking single word without space
        //String names = sc.next();

        //for taking multiple word with spaces
       // String fullname = sc.nextLine();
        //System.out.println("your name is "+names);
       // System.out.println("your full name is "+fullname);

        String fname = "sudhir";
        String lname = "kumar";
        String fullname = fname+" "+lname;
        System.out.println(fullname);

    }
    
}
