import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String str1="eat";
        String str2="tea";

        if(str1.length()!=str2.length()){
            System.out.println("not anagram");
            return;
        }

        char[] arr1=str1.toCharArray();
        char[] arr2=str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        boolean result=Arrays.equals(arr1, arr1);
        System.out.println(result);
    }
}
