package observer.sample;

public class Client {
    public static void main(String[] args) {
        LotteryService service = new LotteryServiceImpl();
        LotteryResult result = service.lotteryAndMessage("12345");
        System.out.println(result);
    }
}
