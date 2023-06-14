package observer.sample;

import java.util.Date;

public class LotteryResult {
    private String uId;
    private String lotteryResult;
    private Date currentDate;

    public LotteryResult(String uId, String lotteryResult, Date currentDate) {
        this.uId = uId;
        this.lotteryResult = lotteryResult;
        this.currentDate = currentDate;
    }

    @Override
    public String toString() {
        return "LotteryResult{" +
                "uId='" + uId + '\'' +
                ", lotteryResult='" + lotteryResult + '\'' +
                ", currentDate=" + currentDate +
                '}';
    }

    public String getLotteryResult() {
        return lotteryResult;
    }

    public void setLotteryResult(String lotteryResult) {
        this.lotteryResult = lotteryResult;
    }

    public Date getCurrentDate() {
        return currentDate;
    }

    public void setCurrentDate(Date currentDate) {
        this.currentDate = currentDate;
    }

    public String getuId() {
        return uId;
    }

    public void setuId(String uId) {
        this.uId = uId;
    }
}
