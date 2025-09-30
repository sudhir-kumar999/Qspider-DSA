import java.util.Arrays;

public class Sort_string {

    public static void main(String[] args) {
        String str = "sudhir";

        char[] arr=str.toCharArray();
        Arrays.sort(arr);
        String sorted = new String(arr);
        System.out.println(sorted);
    }
    
}
