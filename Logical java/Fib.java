public class Fib{
    
    public static void fibSeries(int a, int b, int n ){
        if(n == 0){
            return;
        }
        if(a==0){
            System.out.print(a+" ");
        }
        int c = a + b;
        System.out.print( " " +c);
        fibSeries(b, c, n-1);
        
    } 


     public static void main(String[] args) {
        
        System.out.print(" Fib Series : ");
        fibSeries(0,1, 10);
    }
    


}   