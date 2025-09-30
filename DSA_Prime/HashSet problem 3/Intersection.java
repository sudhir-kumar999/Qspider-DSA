//package HashSet problem 3;

import java.util.HashSet;

public class Intersection {
    public static void main(String[] args) {
        HashSet<String> str1= new HashSet<>();
        HashSet<String> str2 = new HashSet<>();
        str1.add("my");
        str1.add("name");
        str1.add("is");
        str1.add("sudhir");

        str2.add("my");
        str2.add("full");
        str2.add("name");
        str2.add("is");
        str2.add("sudhir");

        str1.retainAll(str2);
        System.out.println(str1);
    }
    
}
