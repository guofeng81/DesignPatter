package bridge.sample;

public class PayCypher implements IPayMode{
    @Override
    public boolean security(String uId) {
        System.out.println("Pass code pay!!");
        return false;
    }
}
