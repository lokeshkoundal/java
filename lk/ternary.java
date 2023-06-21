 class Ternary {
    public static void main(String[] args){
        int a=20, b=10, c=30;

        int res = ((a>b)?(a>c)?a:c  :   (b>c)?b:c);

        System.out.println(res);

        int x = (a>b)?a:b;

        System.out.println(x);
    }
}