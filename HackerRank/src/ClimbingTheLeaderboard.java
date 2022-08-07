import java.util.*;
import java.util.stream.Collectors;

public class ClimbingTheLeaderboard {
    public static void main(String[] args) {
        List<Integer> ranked= Arrays.asList(100,90,90,40,80,75,60);
        List<Integer> player=Arrays.asList( 50,65,77,90,102);
        //System.out.println(climbingLeaderboard(ranked,player));
        System.out.println(climbingLeaderboard1(ranked,player));
    }
    private static List<Integer> climbingLeaderboard(List<Integer> ranked, List<Integer> player){
        List<Integer> a= ranked.stream().distinct().collect(Collectors.toList());
        Collections.sort(a,Collections.reverseOrder());
        List<Integer> result= new ArrayList<>();
        int psize= player.size();
        int asize=a.size();
        for (int i=0;i< psize;i++){
            for (int j=0;j< asize;j++){
                if(player.get(i)>Collections.max(a)){
                    result.add(1);
                    break;
                }
                if(player.get(i)<Collections.min(a)){
                    result.add(a.size()+1);
                    break;
                }
                if(player.get(i) >= a.get(j)){
                    result.add(j+1);
                    break;
                }
            }
        }

     return result;
    }
    private static List<Integer> climbingLeaderboard1(List<Integer> ranked, List<Integer> player){
        List<Integer> a= ranked.stream().distinct().collect(Collectors.toList());
        Collections.sort(a,Collections.reverseOrder());
        int rank=1;
        HashMap<Integer, Integer> rankings = new HashMap<>();
        ArrayList<Integer> result = new ArrayList<>();
        for (int i=0;i<a.size();i++){
                rankings.put(a.get(i),rank++);
        }
        int k = a.size()-1;
        for (int i=0;i<player.size(); i++){
            for (int j=k; j>=0; j--){
                if(player.get(i)>= a.get(j)){
                    rank = rankings.get(a.get(j));
                    k= j-1;
                }
                else {
                    break;
                }
            }
            result.add(rank);
        }
        return result;
    }
}


