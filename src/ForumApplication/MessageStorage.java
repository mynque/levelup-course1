package ForumApplication;

public class MessageStorage {

    private static Message[] messages = new Message[0];

    public static void add(Message message) {
        // Keep the current state in prevMessages
        Message[] prevMessages = messages;

        // Initialize a new array having one more element
        Message[] newMessages = new Message[prevMessages.length + 1];

        // Copy previous messages into the newly defined array
        for (int i = 0; i < prevMessages.length; i++) {
            newMessages[i] = prevMessages[i];
        }

        // Set the method parameter as a value for the last element
        newMessages[newMessages.length - 1] = message;

        messages = newMessages;
    }

    public Message[] getMessages() {
        return messages;
    }
}
