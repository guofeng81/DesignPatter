package adapter.pattern;

public class TFAdapterSD implements TFCard{
    private SDCard sdCard;

    public TFAdapterSD(SDCard sdCard) {
        this.sdCard = sdCard;
    }

    @Override
    public String readTF() {
        System.out.println("sd adapter tf read");
        return sdCard.readSD();
    }

    @Override
    public void writeTF(String msg) {
        System.out.println("sd adapter tf write");
        sdCard.writeSD(msg);
    }
}
