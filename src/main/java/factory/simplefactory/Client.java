package factory.simplefactory;

public class Client {
    public static void main(String[] args) {
        IFreeGood iFreeGood = FreeGoodsFactory.getInstance(1);

    }
}
