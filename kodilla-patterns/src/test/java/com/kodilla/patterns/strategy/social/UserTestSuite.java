package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {

    @Test
    //Given
    public void testDefaultSharingStrategies() {
        User jacek = new YGeneration("jacekkrygier");
        User sylwia = new ZGeneration("sylwiarachanczyk");
        User adrian = new Millenials("adriankapnik");

        //When
        String jacekShare = jacek.sharePost();
        System.out.println("jacekkrygier share post on: " + jacekShare);
        String sylwiaShare = sylwia.sharePost();
        System.out.println("sylwiarachanczyk share post on: " + sylwiaShare);
        String adrianShare = adrian.sharePost();
        System.out.println("adriankapnik share post on: " + adrianShare);

        //Then
        Assert.assertEquals("Facebook", jacekShare);
        Assert.assertEquals("Twitter", sylwiaShare);
        Assert.assertEquals("Snapchat", adrianShare);
    }

    @Test
    public void testIndividualSharingStrategy() {

        //Given
        User jacek = new YGeneration("jacekkrygier");

        //When
        String jacekShare = jacek.sharePost();
        System.out.println("jacekkrygier share post on: " + jacekShare);
        jacek.setSocialPublisher(new TwitterPublisher());
        jacekShare = jacek.sharePost();
        System.out.println("jacekkrygier now share post on: " + jacekShare);

        //Then
        Assert.assertEquals("Twitter", jacekShare);
    }
}
