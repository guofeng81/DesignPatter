package bridge.sample;

import java.math.BigDecimal;

public class Client {
    public static void main(String[] args) {
        Pay wxPay = new WxPay(new PayFaceMode());
        wxPay.transfer("wx_100000", "0000000121", new BigDecimal(100));
        System.out.println();
    }
}
