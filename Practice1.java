import java.util.Arrays;

public class Practice1 {
    public static void main(String[] args) {
        int arrary[]={0,1,1,0,2,2};
        int n =arrary.length;
        for(int i = 0;i<n;i++){
            for(int j = i+1;j<n;j++){
                if(arrary[i]>arrary[j]){
                    int temp = arrary[i];
                    arrary[i]=arrary[j];
                    arrary[j]= temp;
                }
            }
        }
        System.err.println(Arrays.toString(arrary));
    }
}
