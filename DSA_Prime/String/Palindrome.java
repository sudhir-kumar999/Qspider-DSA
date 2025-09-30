public class Palindrome {

    public static void main(String[] args) {
        String str = "sudus";
        String rev="";

        for(int i=str.length()-1;i>=0;i--){
            rev+=str.charAt(i);
        }
        System.out.println(rev);

        //== compare reference
        // .equals() compare content

        if(rev.equals(str)){
            System.out.println("string is palindrome");
        } else{
            System.out.println("string is not palindrome");
        }
    }
    
}
