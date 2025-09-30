//package String Questions;

public class Capitalize_1st_letter {

    public static void main(String[] args) {
        String str = "my name is sudhir kumar";
        String result="";

        String[] res = str.split(" ");
        for (int i = 0; i < res.length; i++) {
            String capitalized = res[i].substring(0,1).toUpperCase()+res[i].substring(1);
            result+=capitalized+" ";
            
        }
        System.out.println(result);
    }

}
