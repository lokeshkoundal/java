class Ternory {
    public static void main(String[] args){
        int a=20, b=10, c=30;

        int res = ((a>b)?(a>c)?a:c:(b>c)?b:c); 
        
    //            (a>b)?    a:b

        System.out.println(res);

    }
} 