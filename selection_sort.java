class selection_sort
{
    public static void main(String[] args) {
        int arr[] = {234,53,5,25,7,24};
        int len = arr.length;
        for(int i = 0; i< len; i++){
            int mid_idx = i;

            for(int j = i+1;j<len;j++){
                if(arr[j]<arr[mid_idx]){
                    mid_idx = j;
                }
            }

            int temp = arr[mid_idx];
            arr[mid_idx] = arr[i];
            arr[i] = temp;
        }

        for(int i =0;i<len;i++){
            System.out.print(arr[i]+' ');
        }
    }
}