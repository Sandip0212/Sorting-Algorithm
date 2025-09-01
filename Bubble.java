import java.util.Arrays;

public class Bubble {
    public static void main(String[] args) {
        int [] arr={5,9,6,8,2,7};
        sortArray(arr);
        System.out.println(Arrays.toString(arr));

    }
    public static int[] sortArray(int[] arr){

        int temp;
        for(int i=0;i<arr.length-1;i++){
            for(int j=1;j<arr.length-i;j++){
                if(arr[j-1]>arr[j]){
                    temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;

                }
            }
        }

        return arr;
    }
    
}
