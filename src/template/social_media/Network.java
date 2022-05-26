package template.social_media;

import java.nio.charset.StandardCharsets;

public abstract class Network {
    String userName;
    String password;

    public Network() {

    }

    public boolean post(String message) {
        // logIn is abstract (below) as each social media has different way of auth.
        if(logIn(this.userName, this.password)) {
            // Send post data
            boolean result = sendData(message.getBytes(StandardCharsets.UTF_8));
            logOut();
            return result;
        }
        return false;
    }

    abstract boolean logIn(String userName, String password);
    abstract boolean sendData(byte[] data);
    abstract void logOut();

}
