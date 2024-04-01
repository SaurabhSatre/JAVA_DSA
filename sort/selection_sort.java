public class selection_sort {

    public static void selection(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int minval = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[minval] > arr[j]){
                    minval = j;
                }
                
            }
            int temp = arr[minval];
                arr[minval] = arr[i];
                arr[i] = temp;
        }
    }
    public static void print(int arr[])
    {
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[]){
    int arr[] = {5,4,1,2,3};
    selection(arr);
    print(arr);
    }
}


