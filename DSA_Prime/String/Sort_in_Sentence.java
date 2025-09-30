import java.util.Arrays;

public class Sort_in_Sentence {

    public static void main(String[] args) {
        String str = " i am a student and fresher";
        String[] split = str.split(" ");
        //System.out.println(split);
        String Sorted = "";
        for (String word : split) {
            char[] ch = word.toCharArray();
            Arrays.sort(ch);
            String sortt = new String(ch);
            Sorted += sortt+" ";
        }
        System.out.println(Sorted);
        //System.out.println(Sorted.getClass().getName());
        if (Sorted instanceof String) {
    System.out.println("It is a String");
} else {
    System.out.println("It is some other Object");
}
        
    }

}
