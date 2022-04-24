import java.util.HashMap;
import java.util.Scanner;

public class Disney {
   static int totalPoints=0;
    public static void disneyHash(int points){

        Scanner scan = new Scanner(System.in);
        HashMap<Integer, String> questions = new HashMap<>();
        HashMap<Integer, String> answers = new HashMap<>();

        questions.put(100,"What does Hakuna Matata mean" );
        questions.put(200,"What is the name of Andy’s neighbor in Toy Story");
        questions.put(300," How many fingers does Mickey Mouse have?" );
        questions.put(400," What year did Disneyland open?");
        questions.put(500,"How many brothers does Prince Hans of the Southern Isles have in Frozen?");

        answers.put(100,"no worries");
        answers.put(200, "sid");
        answers.put(300,"4" );
        answers.put(400,"1955");
        answers.put(500,"12");

        System.out.println(questions.get(points));
        String userAnswer = scan.nextLine();
        if(answers.get(points).equals(userAnswer)){
            totalPoints+=points;
            System.out.println("YOUR ANSWER IS CORRECT \n Total points: "+totalPoints);
        }
        else{
            System.out.println("Wrong answer \n"+ "Current points: "+totalPoints);
        }


    }

}
