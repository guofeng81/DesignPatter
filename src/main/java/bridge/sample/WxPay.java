package bridge.sample;

import java.math.BigDecimal;

public class WxPay extends Pay{

    public WxPay(IPayMode payMode) {
        super(payMode);
    }

    @Override
    public String transfer(String uId, String tradeId, BigDecimal amount) {
        System.out.println("wechat pay transfer starts");
        boolean security = payMode.security(uId);
        System.out.println("wechat pay risk analysis: " + uId + ", " + tradeId + ", " + security);
        if(!security){
            System.out.println("wechat pay failure");
            return "500";
        }
        System.out.println("wechat pay succeed! Amount: " + amount);
        return "200";
    }
}
