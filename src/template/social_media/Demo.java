package template.social_media;

public class Demo {

    public static void main(String[] args) {
        Network network = null;
        System.out.println("[Below is input simulation]");
        System.out.println("Input username: adam");
        System.out.println("Input password: ****");
        System.out.println("Message to post: Today my cat had a can of tuna. Deal with it!");

        String userName = "adam";
        String password = "password";
        String message = "Today my cat had a can of tuna. Deal with it!";

        network = new Facebook(userName, password);
        network.post(message);

        network = new Twitter(userName, password);
        network.post(message);

    }

}
