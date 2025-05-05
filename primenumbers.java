public class primenumbers {
    public static void main(String[] args) {
        int n=10;
        for (int i = 0; i < n; i++) {
            System.out.println(i+" "+p(i));   
        }
        
    }
    static boolean p(int n){
        if(n<=1){
            return false;
        }
        int i=2;
        while(i*i<=n){
            if(n%i==0){
                return false ;
            }
            i++;
        }
        return true;
    }
}
