package pl.gatomek.algo;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

import java.util.Optional;

public class LeaderInSetTest
{
    @Test
    public void noLeaderInEmptySetTest()
    {
        int[] vec = {};
        Optional<Integer> leader = LeaderInSet.calculate( vec);
        assertThat( leader.isPresent()).isFalse();
    }

    @Test
    public void leaderInEmptySetTest()
    {
        int[] vec = {1};
        Optional<Integer> leader = LeaderInSet.calculate( vec);
        assertThat( leader.get()).isEqualTo( 1);
    }

    @Test
    public void noLeaderInEmptySetTest1()
    {
        int[] vec = {1,2};
        Optional<Integer> leader = LeaderInSet.calculate( vec);
        assertThat( leader.isPresent()).isFalse();
    }

    @Test
    public void noLeaderTest2()
    {
        int[] vec = {1,3,4,3,2,1,1};
        Optional<Integer> leader = LeaderInSet.calculate( vec);
        assertThat( leader.isPresent()).isFalse();
    }

    @Test
    public void noLeaderTest3()
    {
        int[] vec = {1,2,2,3,3,3,3,2};
        Optional<Integer> leader = LeaderInSet.calculate( vec);
        assertThat( leader.isPresent()).isFalse();
    }

    @Test
    public void leaderTest()
    {
        int[] vec = {1,2,2,3,3,3,3,2,3};
        Optional<Integer> leader = LeaderInSet.calculate( vec);
        assertThat( leader.get()).isEqualTo( 3);
    }
}
