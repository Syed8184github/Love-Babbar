import java.util.Scanner;
public class MoveNegativeElementsOneSide {
    public static void move(int[] arr){
        int j=0,temp;
        for(int i=0;i< arr.length;i++){
            if(arr[i]<0){
                if(i!=j){
                    temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
                j++;
            }
        }
    }
    public static void printarr(int[] arr){
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of elements");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i< arr.length;i++){
            arr[i]= sc.nextInt();
        }
        move(arr);
        printarr(arr);
    }
}
