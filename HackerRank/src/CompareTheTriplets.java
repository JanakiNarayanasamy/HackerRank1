import java.util.ArrayList;
import java.util.List;

public class CompareTheTriplets {
    public static void main(String[] args) {
        List<Integer> Alice = new ArrayList<>();
        Alice.add(17);
        Alice.add(28);
        Alice.add(30);
        List<Integer> Bob = new ArrayList<>();
        Bob.add(99);
        Bob.add(16);
        Bob.add(8);

        int aliceResult = 0;
        int bobResult = 0;

        if (Alice.get(0) < Bob.get(0)){
            bobResult = bobResult+1;
        }else if (Alice.get(0) > Bob.get(0)){
            aliceResult = aliceResult +1;
        }
        if (Alice.get(1) < Bob.get(1)){
            bobResult = bobResult+1;
        }else if (Alice.get(1) > Bob.get(1)){
            aliceResult = aliceResult +1;
        }
        if (Alice.get(2) < Bob.get(2)){
            bobResult = bobResult+1;
        }else if (Alice.get(2) > Bob.get(2)){
            aliceResult = aliceResult +1;
        }

        List<Integer> result = new ArrayList();
        result.add(0,aliceResult);
        result.add(1,bobResult);

        System.out.println(result.toString());
    }
}
