import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1(){
        int[] scores = {5, 2, 9, 8, 4};
        int[][] edges = {
                {0, 1},
                {1, 2},
                {2, 3},
                {0, 2},
                {1, 3},
                {2, 4}
        };
        int expected = 24;
        int actual = new Solution().maximumScore(scores, edges);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void test2(){
        int[] scores = {9, 20, 6, 4, 11, 12};


        int[][] edges = {
                {0, 3},
                {5, 3},
                {2, 4},
                {1, 3}
        };
        int expected = -1;
        int actual = new Solution().maximumScore(scores, edges);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void test3(){
        int[] scores = {
                9519, 38310, 58921, 79040, 9653, 36577, 12589, 57738, 33199, 85296,
                88292, 73676, 86273, 81785, 3556, 84763, 83568, 43233, 66737, 41491,
                56572, 204, 52267, 32437, 17656, 45068, 7796, 46060, 86235, 25266,
                75882, 35707, 50542, 9771, 61327, 15134, 49941, 1521, 49844, 61142,
                5692, 94147, 61617, 6243, 78922, 51763, 72262, 12725, 60813
        };
        int[][] edges = {{22,10},{10,27},{27,37},{14,21},{21,30},{30,11},{15,38},{38,1},{1,11},{17,46},{46,21},{21,48},{28,0},{0,40},{40,16},{0,22},{22,3},{3,41},{9,34},{34,40},{40,43},{45,43},{43,44},{44,7},{17,13},{13,45},{45,23},{38,12},{12,36},{36,30},{29,20},{20,9},{9,24},{47,21},{21,37},{37,45},{37,18},{18,0},{0,19},{5,39},{39,27},{27,29},{31,25},{25,13},{13,38},{20,7},{7,22},{22,8},{29,47},{47,1},{1,43},{46,26},{26,8},{8,42},{4,32},{32,26},{26,15},{31,43},{43,46},{46,44},{34,25},{25,18},{18,26},{33,6},{6,1},{1,41},{29,31},{31,38},{38,5},{6,5},{48,19},{19,21},{21,45},{17,30},{30,34},{34,44},{8,23},{23,28},{28,10},{3,30},{30,31},{31,35},{10,12},{12,9},{9,33},{15,1},{1,35},{35,39},{21,10},{10,36},{36,48},{28,44},{44,36},{36,24},{43,0},{0,25},{25,32},{40,31},{31,32},{32,7},{26,29},{29,3},{3,48},{27,25},{18,30},{16,24},{24,15},{15,9},{24,28},{28,14},{14,30},{47,5},{5,19},{12,24},{28,5},{17,7},{7,25},{25,14},{45,25},{18,48},{33,38},{38,27},{12,47},{47,8},{8,25},{16,34},{34,19},{19,4},{12,48},{48,13},{13,47},{22,45},{13,16},{5,32},{32,42},{42,27},{34,36},{36,25},{25,41},{39,21},{30,1},{39,44},{44,19},{19,20},{34,43},{43,35},{35,32},{11,12},{12,5},{5,33},{12,32},{32,30},{44,18},{18,8},{5,29},{29,12},{45,16},{16,46},{46,32},{40,33},{33,34},{45,26},{26,44},{27,47},{47,34},{34,3},{43,33},{33,30},{30,2},{14,18},{18,10},{10,19},{38,37},{18,21},{42,14},{39,28},{28,38},{40,3},{3,24},{2,11},{11,31},{31,48},{6,13},{38,29},{43,18},{26,35},{31,6},{1,42},{10,5},{5,36},{36,43},{47,30},{44,33},{33,17},{17,18},{37,22},{22,40},{40,19},{15,8},{8,35},{35,46},{6,11},{11,23},{18,27},{27,4},{4,15},{34,21},{21,3},{3,23},{43,8},{8,20},{20,26},{45,40},{40,8},{8,37},{40,35},{35,11},{17,34},{9,44},{44,3},{3,0},{27,0},{0,44},{17,15},{15,39},{39,13},{13,9},{9,42},{42,11},{25,43},{43,48},{48,8},{20,15},{15,28},{28,33},{24,5},{29,37},{26,47},{47,36},{40,12},{28,7},{7,30},{30,41},{10,13},{13,3},{3,20},{21,26},{26,23},{8,41},{24,39},{39,14},{38,2},{2,14},{14,36},{4,18},{18,38},{10,33},{18,29},{29,15},{6,38},{38,45},{35,38},{38,17},{17,44},{7,13},{13,41},{41,38},{30,27},{27,5},{5,13},{5,4},{4,44},{44,27},{19,6},{6,41},{41,21},{25,17},{17,10},{10,40},{6,26},{47,17},{47,22},{22,44},{6,20},{20,46},{46,37},{30,28},{28,46},{46,40},{41,48},{30,39},{39,23},{23,31},{33,48},{48,22},{22,19},{11,33},{33,46},{46,38},{46,9},{9,19},{19,16},{29,1},{1,34},{5,44},{9,36},{21,13},{3,6},{6,42},{42,7},{14,38},{38,40},{40,6},{22,13},{13,34},{34,35},{20,33},{30,44},{22,16},{16,47},{39,17},{17,3},{6,35},{35,4},{4,38},{29,39},{15,18},{3,18},{31,10},{48,37},{37,20},{8,39},{39,6},{41,26},{44,8},{7,6},{6,16},{8,33},{33,39},{39,7},{6,36},{36,7},{7,9},{11,45},{45,14},{14,24},{41,40},{14,33},{33,27},{27,24},{5,43},{43,21},{21,38},{18,41},{41,5},{5,48},{48,1},{2,28},{28,35},{35,18},{21,15},{15,34},{34,18},{13,19},{19,45},{43,39},{39,4},{4,47},{20,1},{1,28},{40,13},{21,23},{38,23},{29,16},{16,48},{48,35},{30,16},{16,1},{37,43},{44,41},{31,44},{46,13},{2,48},{48,30},{30,0},{44,40},{15,3},{3,8},{20,34},{34,10},{10,26},{41,17},{13,42},{30,23},{23,41},{10,43},{43,27},{48,47},{47,7},{7,29},{48,40},{45,47},{47,10},{46,23},{23,4},{4,42},{41,15},{15,48},{19,8},{3,7},{8,32},{32,20},{20,22},{31,24},{46,18},{21,4},{13,35},{6,0},{3,37},{21,44},{15,2},{2,47},{44,10},{19,2},{11,46},{0,33},{33,31},{44,1},{47,31},{20,47},{31,17},{17,45},{8,27},{27,11},{28,20},{20,35},{13,0},{0,12},{12,30},{6,27},{27,41},{41,42},{48,42},{10,20},{20,36},{47,3},{3,10},{37,6},{6,46},{9,27},{27,26},{42,37},{37,7},{36,16},{13,4},{38,43},{43,3},{3,45},{9,48},{48,14},{42,2},{2,29},{29,25},{33,35},{48,28},{24,41},{41,0},{19,30},{30,13},{13,2},{47,41},{28,18},{45,35},{4,46},{15,5},{5,7},{24,47},{31,1},{22,17},{17,32},{8,0},{11,8},{8,5},{5,17},{17,9},{9,28},{45,7},{47,18},{18,16},{16,12},{20,40},{40,39},{40,7},{29,4},{4,33},{16,11},{11,19},{21,8},{8,14},{14,23},{41,28},{28,29},{29,23},{31,28},{28,37},{36,38},{38,32},{32,48},{0,24},{24,25},{14,26},{26,13},{22,5},{23,18},{47,37},{18,45},{45,15},{26,28},{9,41},{41,22},{22,33},{45,42},{42,38},{47,43},{43,41},{25,21},{21,17},{17,4},{33,26},{26,43},{3,32},{32,28},{46,12},{30,4},{4,20},{20,39},{2,25},{20,12},{12,3},{2,0},{30,25},{11,38},{45,30},{3,9},{41,34},{5,45},{47,38},{42,46},{9,8},{8,1},{41,4},{13,14},{14,15},{15,10},{25,1},{1,9},{46,19},{46,27},{31,27},{45,39},{21,24},{27,14},{14,22},{28,45},{13,27}};
        int expected = 354947;
        int actual = new Solution().maximumScore(scores, edges);
        Assert.assertEquals(expected, actual);
    }
}
