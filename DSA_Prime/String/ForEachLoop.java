public class ForEachLoop {
    public static void main(String[] args) {
        String str="Sudhir kumar";
        char[] arr=str.toCharArray();

        for( char ch : arr){   // for each loop
        System.out.println(ch);

        }

         for(char ch=0;ch<arr.length;ch++){
            
            System.out.println(arr[ch]);
        }
    }
    
}
