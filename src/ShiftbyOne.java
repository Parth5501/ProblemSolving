public class ShiftbyOne {
    public static void main(String[] args) {

        int arr1[] = {10,20,30,40};
        //output :   {40,10,20,30}
        int n = arr1.length-1;
        int temp = arr1[n];

        for(int i=n;i>0;i--){
            arr1[i] = arr1[i-1];
        }

        arr1[0] = temp;
        for(int j=0;j<arr1.length;j++){
            System.out.print(arr1[j]+" ");
        }
    }
}
