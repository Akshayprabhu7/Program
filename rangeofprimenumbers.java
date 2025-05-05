public class rangeofprimenumbers {
    public static void main(String[] args) {
        
        int k=10;
        for (int n = 2; n<=k; n++) {
            int count=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                count++;
            }
        }
        if(count==2){
    System.out.println(n);
    
    }
}
    }
}
