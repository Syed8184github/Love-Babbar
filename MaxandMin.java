import java.util.*;
public class MaxandMin {
    public static void maxMin(int[] arr){
        int max=arr[0];
        int min = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];

            }
        }
        System.out.println("The max element is "+max);
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("The min element is "+min);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many elements:");
        int n  = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i< arr.length;i++){
            arr[i]= sc.nextInt();
        }
        maxMin(arr);

    }
}
