public class Main {
    public static void main(String[] args) {
        MSNMessager msg = new MSNMessager();
        msg.sendMessage();
        System.out.println("--------------------");

        FacebookMessager fbMsg = new FacebookMessager();
        fbMsg.receiveMessage();
        System.out.println("--------------------");

        Telegram telMsg = new Telegram();
        telMsg.sendMessage();
    }
}
