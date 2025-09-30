public class No_of_vowel {
    public static void main(String[] args) {
        String name = "Sudhir KumAr";
        String str = name.toLowerCase();
        int count=0;

       
        for(int i=0;i<str.length();i++){
             char ch= str.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                System.out.println(ch);
                count++;
            }
        }
        System.out.println(count);

    }
    
}
