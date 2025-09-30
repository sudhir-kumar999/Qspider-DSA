//package String Questions;

public class Rmv_Duplicate {

    public static void main(String[] args) {
        String str= "programming";
        String res="";
        char[] ch = str.toCharArray();
        for(int i=0;i<ch.length;i++){
            System.out.println(ch[i]);
            if(res.indexOf(ch[i])==-1){
                res+=ch[i];
            }
        }
        System.out.println(res);
       

    }
    
}
