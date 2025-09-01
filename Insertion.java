import java.util.Arrays;

public class Insertion {
    public static void main(String[] args) {
        int [] arr={5,9,6,8,2,7};
        sortArray(arr);
        System.out.println(Arrays.toString(arr));

    }
    public static int[] sortArray(int[] arr){

        int temp;
        for(int i=1;i<arr.length;i++){
            temp=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>temp){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=temp;
        }

        return arr;
    }
}
