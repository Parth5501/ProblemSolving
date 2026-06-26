import java.util.ArrayList;
import java.util.List;

public class FirstUnsorted {

    public static void main(String[] args) {

        List<Integer> arr1 = new ArrayList<>();
        arr1.add(1);
        arr1.add(2);
        arr1.add(3);

        System.out.println(arr1.reversed());

        int temp=0;
        int ar[] = {1,2,33,414,5,6};
        for (int i=0;i<ar.length;i++){
            if(ar[i]>temp){
                temp=ar[i];
            }
            else {
                System.out.println("Element at position: "+i +" which is :"+ar[i]);
                break;
            }
        }
    }


}
