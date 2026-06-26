import java.util.Scanner;

public class ZeroOne {
    public static void main(String[] args) {
        int arr2[] = {0,1,0,1,0,1,0,1,0,1,1,1,1,0,1,0,1};
        int z =0;
        int o =0;

        for(int i=0;i<arr2.length;i++){
            if (arr2[i]==0){
                z++;
            } else if (arr2[i]==1) {
                o++;
            }
        }
        System.out.println("Zeros:"+z +" Ones:"+o);
    }
}
