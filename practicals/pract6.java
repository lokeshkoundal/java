class Base{
    Base(int a,int b){
        System.out.println("This is base class constructor !!");
    }
}

class Derived extends Base{
    Derived(){
        super(1,5);
        System.out.println("This is Derived class constructor !!");
    }
}
class pract6{
    public static void main(String[] args) {
        Derived obj = new Derived();
    }
}