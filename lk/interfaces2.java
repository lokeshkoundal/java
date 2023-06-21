interface cycle{
    int maxspeed=50;
    void speedup(int i);
    void brake(int d);
}
interface horn {             // interface horn extends cycle --allowed
    void laktunutunu();
    void yamete();
}
class hero implements cycle,horn{
    int speed;
    
    public void speedup(int i){
        speed=i;
        System.out.println("Speeding up , now speed is: " + i + " km/h");
 
    }
    public void brake(int d){

       System.out.println("applying Brakes  , now speed is : " + (speed-d) + "km/h");

    }
    public void laktunutunu(){
        System.out.println("~~ O lakk tunu tunu lakk tunu tunu - tera jhoote khanda lakk neee ~~");
    }

    public void yamete(){
        System.out.println("Yamete kudasaiii !! uuhhnnn");
    }
   

}

public class interfaces2 {
    public static void main(String[] args) {
        hero obj = new hero();
        obj.speedup(25);
        obj.yamete();
        obj.brake(10);
   //     System.out.println(System.getProperty("os.name"));

    }

}
