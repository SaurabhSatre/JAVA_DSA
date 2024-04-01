public class QuickSort {

    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void quicksort1(int arr[],int si,int ei){
        if(si >= ei){
            return;
        }
        int pidx = partition(arr,si,ei);
        quicksort1(arr, si, pidx-1);
        quicksort1(arr, pidx+1, ei);
    }
    public static int partition(int arr[],int si,int ei){
        int pivot = arr[ei];
        int i= si-1;

        for(int j=0;j<ei;j++){
            if(arr[j] <= pivot){
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;
    }
    public static void main(String[] args) {
        int arr[] = {6,3,9,5,2,8,10};
        quicksort1(arr, 0, arr.length-1);
        printArr(arr);
    }
}
