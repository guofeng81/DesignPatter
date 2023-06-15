package adapter.pattern;

public class SDCardImpl implements SDCard{
    @Override
    public String readSD() {
        String msg = "sd card reading data";
        return msg;
    }

    @Override
    public void writeSD(String msg) {
        System.out.println("sd card write data" + msg);
    }
}
