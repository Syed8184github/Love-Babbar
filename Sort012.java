import java.util.*;
public class Sort012 {
    public static void sort012(int[] arr){

        int zero = 0;
        int one = 0;
        int two =  0;
        for(int i=0;i< arr.length;i++){
            if(arr[i]==0){
                zero++;
            }else if(arr[i]==1){
                one++;
            }else{
                two++;
            }
        }
        int index = 0;
        for(int i=1;i<=zero;i++)
            arr[index++]=0;
        for(int i=1;i<=one;i++)
            arr[index++]=1;
        for(int i=1;i<=two;i++)
            arr[index++]=2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of elements:");
        int n = sc.nextInt();
        int[] arr =new int[n];
        for(int i =0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        sort012(arr);
        for(int i =0;i< arr.length;i++)
            System.out.print(arr[i]+" ");
    }
}
