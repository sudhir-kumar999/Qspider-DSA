public class Compare_2_String {
    public static void main(String[] args) {
        String str1= "Apple";
        String str2="apple";

        if(str1.equalsIgnoreCase(str2)){ // ignore case sensitive
            System.out.println("String is matched");
        } else{
            System.out.println("not matched");
        }


        if(str1==str2){
            System.out.println("String is matched");
        } else{
            System.out.println("not matched");
        }

        String s1= new String("Sudhir");
        String s2= new String("Sudhir");

        if(s1==s2){  // == compare memory address
            System.out.println("String is matched");
        } else{
            System.out.println("not matched");
        }

        if(s1.equals(s2)){
            System.out.println("String is matched");
        } else{
            System.out.println("not matched");
        }
    }

}
