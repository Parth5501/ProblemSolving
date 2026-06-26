import java.lang.Math;

public class MaxEle {
    public static void main(String[] args) {
        int max =0;
        int arr1[] = {10,5,4,7,99,66,23};
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]>max){
                max=arr1[i];
            }
        }
        System.out.println("max ele:"+max);
    }

}

