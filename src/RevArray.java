public class RevArray {
    public static void main(String[] args) {
        int arr1[] = {22,4,5,8,98};
//        int arr2[] = {};

        int p1=0;
        int p2=arr1.length-1;
        int temp;

        for (int i=0; i<arr1.length;i++){
            while (p1<p2){
                temp=arr1[p1];
                arr1[p1]=arr1[p2];
                arr1[p2]=temp;
                p1++;
                p2--;
            }
        }

        for(int j=0;j<arr1.length;j++){
            System.out.print(arr1[j]+" ");
        }
    }
}
