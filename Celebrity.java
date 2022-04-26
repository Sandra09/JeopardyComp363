import java.util.HashMap;
import java.util.Scanner;

public class Celebrity {

    static int totalPoints=0;
    public static void celebrityHash(int points) {
        Scanner scan = new Scanner(System.in);
        HashMap<Integer, String> questions = new HashMap<>();
        HashMap<Integer, String> answers = new HashMap<>();

        questions.put(100, "Who got slapped by Will Smith at the 2022 Oscars?");
        questions.put(200, "Who acted the harry potter movie?");
        questions.put(300, "What was the first name of Donald Trump's first wife?");
        questions.put(400, "In the VMA awards show held every fall, what does \"VMA\" stand for?");
        questions.put(500, " In what year was Tom Hanks born?");

        answers.put(100, "chris rock");
        answers.put(200, "daniel radcliffe");
        answers.put(300, "ivanna");
        answers.put(400, "video music award");
        answers.put(500, "1956");

        System.out.println(questions.get(points));
        String userAnswer = scan.nextLine();
        if (answers.get(points).equals(userAnswer)) {
            totalPoints += points;
            System.out.println("YOUR ANSWER IS CORRECT \n Total points: " + totalPoints);
        } else {
            System.out.println("Wrong answer \n" + "Current points: " + totalPoints);
        }
    }



}
