package com.sdcalmes.sleeper;

import org.junit.Test;

import java.io.IOException;
import java.util.Map;
import static org.junit.Assert.*;

public class StatTest
{
    private final Sleeper sleeper = new SleeperApi();

    @Test
    public void testGetWeeklyStats() throws SleeperError, IOException
    {
        Map<String, Stat> stats = sleeper.stats().getWeeklyStats("regular", "2018", "1");
        assertTrue("No stats returned!", stats.size() > 0);
    }

    @Test
    public void testGetSeasonStats() throws SleeperError, IOException
    {
        Map<String, Stat> stats = sleeper.stats().getSeasonStats("regular", "2018");
        assertTrue("No stats returned!", stats.size() > 0);
    }

    @Test
    public void testGetWeeklyProjections() throws SleeperError, IOException
    {
        Map<String, Stat> stats = sleeper.stats().getWeeklyProjections("regular", "2019", "1");
        assertTrue("No projections returned!", stats.size() > 0);
    }

    @Test
    public void testGetSeasonProjections() throws SleeperError, IOException
    {
        Map<String, Stat> stats = sleeper.stats().getSeasonProjections("regular", "2019");
        assertTrue("No projections returned!", stats.size() > 0);
    }
}
