package pl.gatomek.algo;

import java.util.Optional;

public class LeaderInSet {
    public static Optional<Integer> calculate(int[] vec) {
        int len = vec.length;
        if (len == 0)
            return Optional.empty();

        int leader = vec[0];
        int counter = 1;

        for (int i = 1; i < len; i++) {
            if (counter > 0) {
                if (leader == vec[i])
                    counter++;
                else
                    counter--;
            } else {
                leader = vec[i];
                counter = 1;
            }
        }

        if( counter == 0)
            return Optional.empty();

        int c = 0;
        for( int v : vec)
            if( v == leader)
                c++;

        if( c > len / 2)
            return Optional.of( Integer.valueOf( leader));

        return Optional.empty();
    }
}
