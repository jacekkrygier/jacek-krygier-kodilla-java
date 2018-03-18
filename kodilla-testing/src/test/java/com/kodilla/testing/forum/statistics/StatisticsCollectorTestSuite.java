package com.kodilla.testing.forum.statistics;

import org.junit.*;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StatisticsCollectorTestSuite {
    private static int testcounter = 0;

    @Before
    public void before(){
        testcounter++;
        System.out.println("Test Case " + testcounter + " : begin");
    }
    @After
    public void after(){
        System.out.println("Test Case " + testcounter + " : end");
    }
    @BeforeClass
    public static void beforeClass() {
        System.out.println("Test Suite: begin");
    }
    @AfterClass
    public static void afterClass() {
        System.out.println("Test Suite: end. Everything works correctly");
    }

    @Test
    public void testStatistics0Post() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.postsCount()).thenReturn(0);
        StatisticsCollector statisticsCollector = new StatisticsCollector();

        //When
        statisticsCollector.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(0, statisticsCollector.getPostCounter());

    }

    @Test
    public void testStatistics1000Post() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(10000);
        StatisticsCollector statisticsCollector = new StatisticsCollector();

        //When
        statisticsCollector.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(10, statisticsCollector.getAverageCommentsPerPost(), 0);

    }

    @Test
    public void testStatistics0Comments() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.commentsCount()).thenReturn(0);
        StatisticsCollector statisticsCollector = new StatisticsCollector();

        //When
        statisticsCollector.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(0, statisticsCollector.getCommentCounter());


    }

    @Test
    public void testStatisticsLessCommentsThanPosts() {
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.commentsCount()).thenReturn(1);
        when(statisticsMock.postsCount()).thenReturn(2);
        StatisticsCollector statisticsCollector = new StatisticsCollector();

        //When
        statisticsCollector.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertTrue(statisticsCollector.getCommentCounter() < statisticsCollector.getPostCounter());
    }

    @Test
    public void testStatisticsMoreCommentsThanPosts() {
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.commentsCount()).thenReturn(2);
        when(statisticsMock.postsCount()).thenReturn(1);
        StatisticsCollector statisticsCollector = new StatisticsCollector();

        //When
        statisticsCollector.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertTrue(statisticsCollector.getCommentCounter() > statisticsCollector.getPostCounter());
    }

    @Test
    public void testStatistics0Users() {
        Statistics statisticsMock = mock(Statistics.class);
        List<String> users = new ArrayList<String>();
        when(statisticsMock.usersNames()).thenReturn(users);
        StatisticsCollector statisticsCollector = new StatisticsCollector();

        //When
        statisticsCollector.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(0, statisticsCollector.getUserCounter());
    }

    @Test
    public void testStatistics100Users() {
        Statistics statisticsMock = mock(Statistics.class);
        List<String> users = new ArrayList<String>();
        for(int i=0; i<100; i++) {
            users.add("User nr: " + i);
        }
        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.postsCount()).thenReturn(100);
        when(statisticsMock.commentsCount()).thenReturn(200);
        StatisticsCollector statisticsCollector = new StatisticsCollector();

        //When
        statisticsCollector.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(1, statisticsCollector.getAveragePostsPerUser(),0);
        Assert.assertEquals(2, statisticsCollector.getAverageCommentsPerUser(),0);

    }

}
