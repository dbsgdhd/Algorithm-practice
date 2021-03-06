package sort;

public class BubbleSort {
    public static void bubbleSort(int[] arr){
        if (arr==null||arr.length<2){
            return;
        }
        for (int i=arr.length;i>0;i--){
            for (int j=0;j<i;j++){
                if (arr[j]>arr[j+1]){
                    swap(arr,i,j);
                }
            }
        }
    }

    private static void swap(int[] arr, int i, int j) {
        arr[i] = arr[i]^arr[j];
        arr[j] = arr[i]^arr[j];
        arr[i] = arr[j]^arr[i];
    }
}
