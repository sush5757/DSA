public class ArmstrongNumber {

    public static boolean isArmStrong(int num) {
        boolean flag = false;
        int temp = num, a , sumofDigits=0 ;
        while(temp > 0  ){
            a = temp % 10;
            temp = temp/10;
            sumofDigits+=(a*a*a);
        }
        if(num == sumofDigits){
            flag = true;
        }

        return  flag;
        
    }

    public static void main(String[] args) {
        System.out.println(" result : "+ isArmStrong(150) );
    }
}
