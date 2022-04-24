import java.util.HashMap;

public class musicHash {
    public static void main(String[] args) {
        musicH(100);
    }
    public static String musicH(int points){
        HashMap<Integer, String> hm = new HashMap<>();
        HashMap<Integer, String> hm1 = new HashMap<>();
        if (points == 100 || points == 200 || points == 300 || points == 400 || points == 500){
            hm1.put(100, "Who is the singer that is known as the King of Pop");
            hm1.put(200, "What is the name of a british girl band whose name is related to a condiment?");
            hm1.put(300, "Who is the top selling artist?");
            hm1.put(400, "Where is house music originated from?");
            hm1.put(500, "In which country did Kanye West live when he was ten years old?");
            //System.out.println(hm1.get(points));
        }
        if (points == 100 || points == 200 || points == 300 || points == 400 || points == 500){
            hm.put(100, "Micheal Jackson");
            hm.put(200, "Spice Girls");
            hm.put(300, "The Beatles");
            hm.put(400, "Chicago");
            hm.put(500, "China");
            //System.out.println(hm.get(points));
        }
        return hm.get(points);

    }
}

