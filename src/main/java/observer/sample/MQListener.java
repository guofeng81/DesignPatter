package observer.sample;

public class MQListener implements EventListener{
    @Override
    public void doEvent(LotteryResult result) {
        System.out.println("MQ Listening!!!");
    }
}
