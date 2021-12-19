public class Main {
    public static void main(String[] args) {
        AbstractChairFactory factory=new ChairFactory();
        Chair chair1=factory.createFunctionalChair();
        Chair chair2=factory.createMagicChair();
        Chair chair3=factory.createVictorianChair();
        Client client=new Client();
        client.setChair(chair3);
        client.sit();
    }
}
