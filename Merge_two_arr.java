import java.util.Arrays;

public class Merge_two_arr {
    public static void merge_arr(int arr1[],int arr2[],int arr3[])
    {
        int len1= arr1.length;
        int len2 = arr2.length;
        int i=0,j=0,k=0;


        while (i<len1) {
            arr3[k++] = arr1 [i++];
        }

        while (j<len2) {
            arr3[k++] = arr2 [j++];
        }

        Arrays.sort(arr3);
    }
    public static void main(String[] args) {        
        
        int arr1[]={2,5,6,8,89,};
        int arr2[]={4,7,99,345};
        int arr3[]= new int[arr1.length+arr2.length];

        merge_arr(arr1,arr2,arr3);

        for(int i=0;i<arr3.length;i++){
            System.out.println(arr3[i]+ " ");
        }
    }
}
