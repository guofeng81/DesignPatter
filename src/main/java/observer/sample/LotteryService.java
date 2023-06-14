package observer.sample;

public abstract class LotteryService {
    private EventManager eventManager;

    public LotteryService() {
        eventManager = new EventManager(EventManager.EventType.Message, EventManager.EventType.MQ);
        eventManager.subscribe(EventManager.EventType.MQ, new MQListener());
        eventManager.subscribe(EventManager.EventType.Message, new MessageListener());
    }

    public LotteryResult lotteryAndMessage(String uId){
        LotteryResult result = lottery(uId);
        eventManager.notify(EventManager.EventType.Message, result);
        eventManager.notify(EventManager.EventType.MQ, result);
        return result;
    }
    public abstract LotteryResult lottery(String uid);
}
