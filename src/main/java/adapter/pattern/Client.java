package adapter.pattern;



public class Client {
    public static void main(String[] args) {
        Computer computer = new Computer();
        SDCard sdCard = new SDCardImpl();
        System.out.println(computer.readSD(sdCard));;

        System.out.println("=======");
        TFCard tfCard = new TFCardImpl();
        SDAdapterTF sdAdapterTF = new SDAdapterTF(tfCard);
        System.out.println(computer.readSD(sdAdapterTF));
    }
}
