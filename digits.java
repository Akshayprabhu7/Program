public class digits {
public static void main(String[] args) {
    int n=12345,r=0,s=0;
    while(n>0){
        r=n%10;
        s=s+r;
        n/=10;

    }
    System.out.print(s);
}
}
