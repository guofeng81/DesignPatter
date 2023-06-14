package observer.sample;

public class MessageListener implements EventListener{
    @Override
    public void doEvent(LotteryResult result) {
        System.out.println("Message listening!!!");
    }
}
