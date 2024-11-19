import java.util.Arrays;

public class WaveArray {
    
    public static void swap(int arr[],int a,int b) {

        int temp = arr[a];
        arr[a]= arr[b];
        arr[b]= temp;

    }
    public static void sortawave(int []arr){
        Arrays.sort(arr);
        for(int i =0; i<arr.length-1;i+=2){

            swap(arr, i, i+1);
        }
    }

    public static void main(String[] args) {
        int[] arr = {2,4,5,20,1,32,12,6}; 
        
        sortawave(arr);
        for(int i=0; i<= arr.length-1;i++){
            System.out.print(arr[i]+" ");
        }
        

    }
}
