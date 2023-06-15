package adapter.pattern;

public class Computer {
    public String readSD(SDCard sdCard){
        return sdCard.readSD();
    }
    public String readTF(TFCard tfCard){
        return tfCard.readTF();
    }
}
