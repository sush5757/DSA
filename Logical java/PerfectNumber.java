public class PerfectNumber {
    
    public static boolean isPerfect(int  n ){
        boolean flag = false;
        int sum=0;
        for(int i = n-1 ; i>0;i--){
            if(n%i == 0){
                System.out.println(n+" "+ i);
                sum+=i;
                System.out.println(sum);
            }
            
        }
        if(sum==n){
            flag = true;
        }
        return flag;
    }


    public static void main(String[] args) {
        System.out.println("result "+ isPerfect(6));
    }
    
}
