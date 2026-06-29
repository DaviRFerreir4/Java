public class Telegram extends MessageSystem {
    public void sendMessage() {
        if (this.validateInternetConnection()) {
            System.out.println("Sending message through Telegram...");
            this.saveMessageHistory();
        } else {
            System.out.println("Failed to connect to the internet");
        }
    }

    public void receiveMessage() {
        if (this.validateInternetConnection()) {
            System.out.println("Receiving message through Telegram...");
            this.saveMessageHistory();
        } else {
            System.out.println("Failed to connect to the internet");
        }
    }
}
