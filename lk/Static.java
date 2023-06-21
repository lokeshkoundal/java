public class Static {

    static int x = 5;

    public void addLoop() {
        int i = 1;
       while(i <3){
         x++;
         i++;
       }
        System.out.println(x);
    }
    void show(){
                System.out.println(x);
    }

    public static void main(String[] args) {
        Static obj = new Static();
        obj.addLoop();

        Static obj2 = new Static();
        obj.addLoop();
        obj2.show();
        
        Static obj3 = new Static();
        
        obj3.addLoop();
       
       // System.out.println(x);

    }
}