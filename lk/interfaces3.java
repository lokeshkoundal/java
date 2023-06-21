interface camera{
    void snap();
    void video();
}
interface wifi{
      String[] getnetwork();
      void connectToNetwork(String network);
}
class cellphone{
     void call(int num){
        System.out.println("Calling this number: "+num+"....");
     }
     void pickCall(){
        System.out.println("Connecting...");
     }
}
class smartphone extends cellphone implements wifi,camera{
        public void snap(){
            System.out.println("Clicckkked");
        }
    
}
public class interfaces3 {
    
}
//security
//polymorp
//class 
