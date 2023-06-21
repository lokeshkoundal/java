
class AgeLimitException extends Exception{
    AgeLimitException(String s){
        super(s);
    }
}
public class userd2{
    public static void main(String[] args)throws Exception{


     //try{
            int age = -1;
            if(age<0){
                throw new AgeLimitException("Negative age not allowed");
            }
        System.out.println("hi");
      //}
//        catch(AgeLimitException e){
//            System.out.println(e.getMessage());
//          //e.fillInStackTrace();
//            e.printStackTrace();
//        }

    }
}