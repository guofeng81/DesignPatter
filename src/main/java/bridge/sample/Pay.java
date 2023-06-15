package bridge.sample;

import java.math.BigDecimal;

public abstract class Pay {
   // bridge object
    protected IPayMode payMode;

    public Pay(IPayMode payMode) {
        this.payMode = payMode;
    }


    public abstract String transfer(String uId, String tradeId, BigDecimal amount);
}
