package Chapter8;

public class QuickSort {

    static  void quickSort(int[] arr, int left, int right){
        int index = partition(arr, left, right);
        if(left < index - 1){
            quickSort(arr, left, index-1);
        }
        if(index < right) {
            quickSort(arr, index, right);
        }
    }

    static int partition(int[] arr, int left, int right){
        int pivot = arr[(left+right) / 2];
        System.out.println("before sort: ");
        printArr(arr);
        System.out.println("left:" + left +  ", right:" + right + ", pivot: " + (left+right) / 2  + ", value:" + pivot);
        while(left <= right){
            while(arr[left] < pivot) left++;
            while(arr[right] > pivot) right--;

            if(left <=right){
                swap(arr, left, right);
                left++;
                right--;
            }
        }
        System.out.println("after sort: ");

        printArr(arr);
        System.out.println("----return left idx:" + left);
        return left;
    }

    static void swap(int[] arr, int left, int right){
        int x = arr[left];
        arr[left] = arr[right];
        arr[right] = x;
    }

    public static void main(String[] args) {
        int[] arr = {10, 9, 8, 1, 6, 5, 4};
        int left = 0;
        int right = arr.length - 1;


        quickSort(arr, left, right);
        System.out.println("restult:");
        printArr(arr);

    }

    static void printArr(int[] arr){
        for(int x: arr){
            System.out.print(x + "," );
        }
        System.out.println("");
    }
}
