class hod{
    int teaching_skills=0;
    void bharning(){
        System.out.println("Last bharning");
    }
    private void pet(){
        System.out.println("Mera pet mota hai");
    }
}
class HodKaBacha extends hod{
    int simpinglvl=100000;
    void a(){
        System.out.println("Vineet ka method");
    }
}
class Hodkabacha2 extends hod{
   
}

class Hodkabacha3 extends hod{

}

public class inhrit {
    public static void main(String[] args) {
     Hodkabacha2 taran = new Hodkabacha2();
     System.out.println(taran.teaching_skills);  // 0           // 0
    //  System.out.println(taran.simpinglvl);      //1000000       //10000
    //  taran.a();                                //vineet ka method  //x
    }
}
