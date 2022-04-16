package callback;

public class Botiga {

	Botiga(){
        Callback call = new Callback(this, new Paypal());
        call.run();
    }
   
    public static void main(String args[]){
        new Botiga();
    }
   
    public void callback(String string){
        System.out.println(string);
    }

}