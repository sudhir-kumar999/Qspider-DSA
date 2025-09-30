//package String Questions;

public class Check_str_contain_digit {

    public static void main(String[] args) {
        String str = "sdfghjkl";
        boolean found =false;
        
        
        
        for(int i=0;i<str.length();i++){
        //System.out.println(str.charAt(i));
        char ch = str.charAt(i);
        //System.out.println(ch);
        if(Character.isDigit(ch)){
            found=true;
            break;
        }
        
        
        }
        System.out.println(found);
        
        }
    
    
   
    
}
