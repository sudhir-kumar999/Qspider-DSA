public class Frequency_of_char {

    public static void main(String[] args) {
        String str = "sudhir kumar hajipur vaishali bihar";

        char target = 'i';

        char[] arr = str.toCharArray();
        int count =0;
        for( char word : arr){
            if(target==word){
                count++;

            }
            
        }
        System.out.println(count);
    }
    
}
