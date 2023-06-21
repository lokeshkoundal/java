public class Sort {
    public static void main(String[] args){
       int arr[] = {1,3,4,5,6,7,8,9,52,1,5,7,43,2,54};

    for(int j = 0 ; j<arr.length ; j++){

       for(int i = 0 ; i<arr.length-1 ; i++ ){

        if (arr[i]<arr[i+1]){
            int temp;
            temp = arr[i+1];
            arr[i+1]=arr[i];
            arr[i]=temp;

        } 
       }
    }
       for(int x : arr){
        System.out.print(x + " ");
       }
    }
}
