package expl;

class hell{
    static boolean foo(char c){
        System.out.print(c);
        return true;
    }
    public static void main(String[] args) {
        int i = 0;
        for(foo('A'); foo('B') && (i < 2) ; foo('C')){
            i++;
            foo('D');
        }
        // for(System.out.println(5);i<5;System.out.println(80)){
        //     i++;
        // }
    }
}