import java.lang.Math;
public class LinearArray {
    int arr1[] = {2,5,3,1,7};
    int target = 1;

    static boolean findTarget(int arr[],int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i] == target){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(findTarget(new int[]{1,2,3,4,5}, 1));

    }

}
