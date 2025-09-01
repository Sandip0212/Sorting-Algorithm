import java.util.Arrays;

public class Merge {
    public static void main(String[] args) {
        int[] arr={5,9,6,8,2,7};
        int end=arr.length-1;
        int start=0;
        mergesort(arr,start,end);
        System.out.println(Arrays.toString(arr));
        
    }
    public static void mergesort(int arr[], int start, int end){
        if(start<end){
            int mid=start+(end-start)/2;
            mergesort(arr, start, mid);  //Left side 
            mergesort(arr, mid+1, end);  //Rigth side
            merge(arr,start,mid,end);
        }
    }
    public static void merge(int arr[], int start,int mid,int end){
        int[] mergeArray=new int[end-start+1];
        int i=start;
        int j=mid+1;
        int count=0;
        while (i<=mid && j<=end) {
            if(arr[i]<arr[j]){
                mergeArray[count++]=arr[i];
                i++;
            }
            else{
                mergeArray[count++]=arr[j];
                j++;
            }
            
        }
        while(i<=mid){
            mergeArray[count++]=arr[i];
            i++;
        }
        while (j<=end) {
            mergeArray[count++]=arr[j];
            j++;
            
        }
        for(int k=0;k<mergeArray.length;k++){
            arr[start+k]=mergeArray[k];
        }
        
    }
}
