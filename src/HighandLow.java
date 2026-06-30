import java.util.HashMap;

public class HighandLow {
    public static void main(String[] args) {
        int arr[] = {1,1,1,1,1,2,3,3,5,5,5,5,5,5,5,5,5};

        // Highest frequency - 1
        // Lowest frequency - 2

        HashMap<Integer,Integer> hmap = new HashMap<>();
//        hmap.put(1,11);
//        hmap.put(2,22);
//        hmap.put(3,33);
//        hmap.put(4,44);

        System.out.println(hmap.getOrDefault(4,404));

        for(int key:arr){
            hmap.put(key,hmap.getOrDefault(key,0)+1);
        }

        int highFreq = Integer.MIN_VALUE;
        int highFreqNum = -1;
        System.out.println("Keys of hashmap are:"+hmap.keySet());
        System.out.println("Values of hashmap are:"+hmap.values());

        for(int key:arr){
            int currentKey = key;
            int currentFreq = hmap.get(key);

            if (currentFreq > highFreq){
                highFreq = currentFreq;
            }
            highFreqNum = currentKey;
        }
        System.out.println("Highest Freq is "+highFreq +"which is of:"+highFreqNum);

    }
}
