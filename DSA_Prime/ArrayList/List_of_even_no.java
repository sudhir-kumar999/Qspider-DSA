//package ArrayList;

import java.util.ArrayList;

public class List_of_even_no {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();


        for(int i=1;i<=20;i++){
            if(i%2==0){
                list.add(i);
            }
        }
        System.out.println(list);
    }
    
}
