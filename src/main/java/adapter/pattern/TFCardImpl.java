package adapter.pattern;

public class TFCardImpl implements TFCard{
    @Override
    public String readTF() {
        String msg = "tf card read";
        return msg;
    }

    @Override
    public void writeTF(String msg) {
        System.out.println("tf card write data" + msg);
    }
}
