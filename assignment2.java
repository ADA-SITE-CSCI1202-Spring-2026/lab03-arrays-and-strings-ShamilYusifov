import java.util.Scanner;
import java.util.Arrays;

public static void main(args[] Strings){
        Scanner sc = new Scanner();
        Integer[] arr= new Integer[100];
        int max,min;
        int i = 0;
        while(sc.nextInt()){
            arr[i]= sc.nextInt();
        }
        for(int j=0; j<arr.length;j++){
            if(arr[j-1] < arr[j]){
                max = arr[j];
            }
        }
        for(int j=0; j<arr.length;j++){
            if(arr[j] < arr[j-1]){
                min = arr[j];
            }
        }

}