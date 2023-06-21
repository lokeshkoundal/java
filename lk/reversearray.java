public class reversearray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] reversedArr = new int[arr.length];


        int i = 0; 
        int j = arr.length-1;              
        for (int val : arr) {
            reversedArr[(arr.length - 1)-i] = val;   
            i++;
        
    }

        for(int a : reversedArr){
            System.out.println(a);
    }
    }
}

