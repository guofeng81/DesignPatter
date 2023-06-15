package bridge.sample;

public class PayFaceMode implements IPayMode{
    @Override
    public boolean security(String uId) {
        System.out.println("face pay!!! ");
        return true;
    }
}
