
public class Relational {
    public static void main(String[] args) {
        int x=64;
        int y=20;

        System.out.println(x+y>3*y);
        System.out.println((x+y)/12==0);
        System.out.println((x+y)/12!=0);
        System.out.println((x+y)/12==7);
        System.out.println((x+y)/12!=7);
        System.out.println((x+y)/12);

        int z=1900;
        System.out.println((x+y)%12==0);
        System.out.println((x+y)%12!=0);
        System.out.println(z%100!=0);

        double d=0.0/0.0;
        System.out.println(d==d);
        System.out.println(d!=d);
        System.out.println(d<d);
        System.out.println(d>d);
        System.out.println(d<=d);


        int o=5;
        // System.out.println((1<o)<10);

        char c1 = 'A';
        char c2=65;
        System.out.println(c1==c2);
        System.out.println(c1<'a');
        System.out.println('Z'<'a');



        boolean p = true;
        boolean q=false;
        System.out.println(p==q==false);

        int e=3;
        int f=5;
        System.out.println((e+=2)>(f-=2));
        System.out.println(e+" "+f);
    }
    
}
