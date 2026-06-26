class Main{

    public static void main(String[] args) {
        int arr[] = {2,4,3,3};
        int sum=0;
        int total= arr.length;
        float avg;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        System.out.println("The average of the array is : "+sum/total);



    }
}