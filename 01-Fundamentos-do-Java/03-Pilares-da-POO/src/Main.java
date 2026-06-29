public class Main {
    public static void main(String[] args) {
        MessageSystem msg = null;

        String chosenApp = "msn";

        if (chosenApp.equals("msn")) {
            msg = new MSNMessager();
        } else if (chosenApp.equals("facebook")) {
            msg = new FacebookMessager();
        } else if (chosenApp.equals("telegram")) {
            msg = new Telegram();
        }

        msg.sendMessage();
        System.out.println("-----------------");
        msg.receiveMessage();
    }
}
