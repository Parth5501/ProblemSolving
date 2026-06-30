import java.util.HashMap;

public class Mode {
    public static void main(String[] args) {
        int arr[] = {5,2,3,2,3,1,2,9};

        //Key,Value pair we want = hence hash map
        // If entry does not exists in HashMap [5,1] then create
        // If exists then value++

            HashMap<Integer,Integer> freq = new HashMap<>();

            for(int num:arr){
                freq.put(num,freq.getOrDefault(num,0)+1);
            }



            for(int i:freq.keySet()){
                System.out.println(i+" Comes->"+freq.get(i)+" Times");
            }

            System.out.println(freq.values());




    }
}
