package strategy.social;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTestSuite {

    @Test
    void testDefaultSharingStrategies() {
        // Given
        User millenial = new Millenials("John");
        User yGeneration = new YGeneration("Jane");
        User zGeneration = new ZGeneration("Joe");

        // When
        String millenialShare = millenial.sharePost();
        String yGenerationShare = yGeneration.sharePost();
        String zGenerationShare = zGeneration.sharePost();

        // Then
        assertEquals("Using Facebook", millenialShare);
        assertEquals("Using Twitter", yGenerationShare);
        assertEquals("Using Snapchat", zGenerationShare);
    }

    @Test
    void testIndividualSharingStrategy() {
        // Given
        User millenial = new Millenials("John");

        // When
        String millenialShareBefore = millenial.sharePost();
        millenial.setSocialPublisher(new TwitterPublisher());
        String millenialShareAfter = millenial.sharePost();

        // Then
        assertEquals("Using Facebook", millenialShareBefore);
        assertEquals("Using Twitter", millenialShareAfter);
    }
}
