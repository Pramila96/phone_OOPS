public class Landline implements Phone{
    private String myPhoneno;

    public String getMyPhoneno() {
        return myPhoneno;
    }

    public void setMyPhoneno(String myPhoneno) {
        this.myPhoneno = myPhoneno;
    }

    public void setRinging(boolean ringing) {
        isRinging = ringing;
    }

    public boolean isPowerOn() {
        return isPowerOn;
    }

    public void setPowerOn(boolean powerOn) {
        isPowerOn = powerOn;
    }

    public Landline(String myPhoneno, boolean isRinging, boolean isPowerOn) {
        this.myPhoneno = myPhoneno;
        this.isRinging = false;
        this.isPowerOn = true;
    }


    private boolean isRinging;
    private boolean isPowerOn;


    @Override
    public void powerOn() {
        this.isPowerOn=true;
    }

    @Override
    public void callNumber(String phoneNo) {
        if(isPowerOn==true)
        {
            System.out.println("You are dialing a number"+phoneNo);
        }
        else {
            System.out.println("Your Landline is off");
        }
return;
    }

    @Override
    public void receiveCall(String phoneNo) {
if(isPowerOn&&(myPhoneno.equals(phoneNo)))
{
    this.isRinging=true;
    System.out.println("hey "+phoneNo+"you are receiving a call");

}
else {
    System.out.println("call not receive");
}
    }

    @Override
    public boolean answerCall() {
        if(isRinging==true)
        {
            System.out.println("call answer");
            this.isRinging=false;
            return true;
        }
        return false;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
