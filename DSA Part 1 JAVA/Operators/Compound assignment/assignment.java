public class assignment {
    public static void main(String[] args) {
        int a,b,c;
        a=b=c=5;
        a+=b-=c*=2;
        System.out.println(a);

        int n=14;
        n=n%5*2;
        System.out.println(n);


        int m=27;
        m%=5+4;
        System.out.println(m);

        int x=5;
        x+=x*=2;
        System.out.println(x);

        int p=17;
        p+=p%3*2;
        System.out.println(p);

        int num = 29;
        num %=5+3;
        System.out.println(num);

        int s=5;
        int t=3;
        s+=t*=2;
        System.out.println(s+" "+t);
    }
    
}
