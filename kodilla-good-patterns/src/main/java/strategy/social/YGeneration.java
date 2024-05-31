package strategy.social;

public class YGeneration extends User {
    public YGeneration(String username) {
        super(username);
        this.socialPublisher = new TwitterPublisher();
    }
}