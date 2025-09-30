//package String;

public class Compare_Str {
    public static void main(String[] args) {
        String str1 = "sudhir";
        String str2 = "sudhir";
        // take the first letter of both string and compare a/c to ascii value
        // compareTo check 3 cases
        // 1 s1>s2 = give +ve value
        // 2 s1==s2 = 0 gives 0 value
        // 3 s1<s2 = give -ve value

        // if(str1.compareTo(str2)==0){
        // System.out.println("string is matched");
        // } else{
        // System.out.println("string is not matched");
        // }

        // if (str1 == str2) {
        //     System.out.println("string is matched");
        // } else {
        //     System.out.println("string is not matched");
        // }

//         Java mein == operator reference comparison karta hai, not content comparison.
// new String("sudhir") har baar ek naya object banata hai heap memory mein.
// Toh new String("sudhir") == new String("sudhir") ka matlab hai:
// "Kya dono alag-alag String objects ka reference ek hi memory address ko point kar raha hai?"
// ❌ No! Dono alag-alag memory locations par banaye gaye hain → isliye comparison false hota hai.

        if(new String("sudhir") == new String("sudhir")){
            System.out.println("string is matched");
        } else{
            System.out.println("string is not matched");
        }
        

    }

}
