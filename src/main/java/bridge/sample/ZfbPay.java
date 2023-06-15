package bridge.sample;

import java.math.BigDecimal;

public class ZfbPay extends Pay{
    public ZfbPay(IPayMode payMode) {
        super(payMode);
    }

    @Override
    public String transfer(String uId, String tradeId, BigDecimal amount) {
        System.out.println("ZFB pay transfer starts");
        boolean security = payMode.security(uId);
        System.out.println("ZFB pay risk analysis: " + uId + ", " + tradeId + ", " + security);
        if(!security){
            System.out.println("wechat pay failure");
            return "500";
        }
        System.out.println("wechat pay succeed! Amount: " + amount);
        return "200";
    }
}
