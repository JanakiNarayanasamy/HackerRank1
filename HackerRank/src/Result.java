import java.util.*;
import java.util.stream.Collectors;

public class Result {
    public static void main(String[] args) {
        List<Integer> ranked= Arrays.asList(100,90,90,40,80,75,60);
        List<Integer> player=Arrays.asList( 50,65,77,90,102);
        System.out.println(climbingLeaderboard(ranked,player));
    }
    private static List<Integer> climbingLeaderboard(List<Integer> leaderBoard, List<Integer> playerScores){
        /*Arrayist<Integer> leaderBoard = (ArrayList<Integer>)ranked;
        ArrayList<Integer> playerScores = (ArrayList<Integer>)player;*/
        ArrayList<Integer> ranks = new ArrayList<>();
        HashMap<Integer, Integer> rankings = new HashMap<>();
        int rank =1;
        for(int i=0; i<leaderBoard.size(); i++){
            if(!rankings.containsKey(leaderBoard.get(i))){
                rankings.put(leaderBoard.get(i),rank++);
            }
        }
        int initial = leaderBoard.size()-1;
        for(int score : playerScores){
            for(int i=initial; i>=0; i--){
                if(score >= leaderBoard.get(i)){
                    rank = rankings.get(leaderBoard.get(i));
                    initial = i-1;
                }
                else{
                    break;
                }
            }
            ranks.add(rank);
        }
        return ranks;
    }
}

