import java.util.*;
public class KthMaxandMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of elements");
        int n = sc.nextInt();
        System.out.println("Enter the kth element");
        int k= sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0;i< arr.length;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0;i< arr.length;i++){
            for(int j =i+1;j< arr.length;j++){
                if(arr[i]<arr[j]){
                    int temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
            if(i==k-1){
                System.out.println(k+" largest element is "+arr[i]);
                break;
            }
        }
        for(int i=0;i< arr.length;i++){
            for(int j =i+1;j< arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
            if(i==k-1){
                System.out.println(k+" smallest element is "+arr[i]);
                break;
            }
        }
    }
}
