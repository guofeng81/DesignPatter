package observer.sample;

import java.util.Date;

public class LotteryServiceImpl extends LotteryService{

    @Override
    public LotteryResult lottery(String uid) {
        DrawHouseService service = new DrawHouseService();
        String lots = service.lots(uid);
        return new LotteryResult(uid, lots, new Date());
    }
}
