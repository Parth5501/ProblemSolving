public class Mul {

    public static void main() {
        int arr1[] = {1,2,3,4};
        int arr2[] = new int[4];
        for(int i=0;i<arr1.length;i++) {
            int element = arr1[i];
            int newelement = element*10;
            arr2[i] = newelement;

        }
        for(int i=0;i<arr2.length;i++) {
            System.out.println(arr2[i]);
        }
    }
}
