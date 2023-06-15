package bridge.sample;

public class PayFingerprintMode implements IPayMode{
    @Override
    public boolean security(String uId) {
        System.out.println("finger print pay");
        return true;
    }
}
