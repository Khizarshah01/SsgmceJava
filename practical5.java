import java.util.*;
public class practical5{
    public static void main(String arg[])
    {
        int arr[] = {6,4,3,67,7};
        
        // bubble Sort 
         for(int i = 0; i<4; ++i){
             for(int j =0; j<4-i; ++j ){
                 if(arr[j]>arr[j+1]){
                      int temp= arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                 }
             }
         }
        
        for(int i = 0 ; i<5; i++)
        {
            System.out.println(arr[i]);
        }
        
        
    }
}
