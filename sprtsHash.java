import java.util.HashMap;

public class sprtsHash {
    public static void main(String[] args) {
        //System.out.println(sportHAA(400));
    }
    public static String sportH(int points){
        HashMap<Integer, String> hm1 = new HashMap<>();
        if (points == 100 || points == 200 || points == 300 || points == 400 || points == 500){
            hm1.put(100, "What company logo has a swoosh?");
            hm1.put(200, "Who has won the most rings in the NFL?");
            hm1.put(300, "Which state has the most number of NBA teams?");
            hm1.put(400, "What national team has won the most world cups?");
            hm1.put(500, "Who has won the most grand slams?");
            //System.out.println(hm1.get(points));
        }

        return hm1.get(points);
    }
    public static String sportHA(int points){
        HashMap<Integer, String> hm = new HashMap<>();
        if (points == 100 || points == 200 || points == 300 || points == 400 || points == 500){
            hm.put(100, "nike");
            hm.put(200, "tom brady");
            hm.put(300, "california");
            hm.put(400, "brazil");
            hm.put(500, "nadal");
        }
        return hm.get(points);
    }
}
