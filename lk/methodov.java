public class methodov {

    public static void meth(int a,int b){
        if(a>b){
            System.out.println("A is greater ");
        }
        else if(b>a){
            System.out.println("B is greater");
        }
        else if(b==a){
            System.out.println("Both are equal");
        }
        else{
            System.out.println("invalid ");
        }
    }
    public static void main(String[] arg){
            meth(44,1442);

    }
}
