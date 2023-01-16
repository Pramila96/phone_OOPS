public class Main {
    public static void main(String[] args) {
       Landline l1=new Landline("123",true,true);
       Landline l2=new Landline("456",true,true);
       l1.callNumber("456");
       l2.receiveCall("456");
       l1.powerOn();
       l2.isRinging();

    }
}