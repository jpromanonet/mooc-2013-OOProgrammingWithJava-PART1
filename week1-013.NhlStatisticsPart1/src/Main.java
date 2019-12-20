
import nhlstats.NHLStatistics;

public class Main {

    public static void main(String[] args) {
        // Top ten players by Goals
        System.out.println("Top ten by goals");
        NHLStatistics.sortByGoals();
        NHLStatistics.top(10);
        // Top twenty-five playes by penalties
        System.out.println("Top 25 players by penalties");
        NHLStatistics.sortByPenalties();
        NHLStatistics.top(25);
        // Stats for Sidney Crosby
        System.out.println("Statistics for Sidney Crosby");
        NHLStatistics.searchByPlayer("Sidney Crosby");
        // Stats for Philadelphia Flyers
        System.out.println("Statistics for Philadelphia Flyers");
        NHLStatistics.teamStatistics("PHI");
        // Players for Anaheim Ducks
        System.out.println("Statistics fro Anaheim Ducks");
        NHLStatistics.sortByPoints();
        NHLStatistics.teamStatistics("ANA");
    }
}
