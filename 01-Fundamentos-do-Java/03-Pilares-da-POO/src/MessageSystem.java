public abstract class MessageSystem {
    public abstract void sendMessage();

    public abstract void receiveMessage();

    protected boolean validateInternetConnection() {
        System.out.println("Validating internet connection...");
        return true;
    }

    protected void saveMessageHistory() {
        System.out.println("Saving message history...");
    }
}
