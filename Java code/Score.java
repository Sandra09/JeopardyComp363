import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Score {

    public static void rank() {

        ArrayList<Integer> celebrityCheck = new ArrayList<>();
        ArrayList<Integer> musicCheck = new ArrayList<>();
        ArrayList<Integer> sportsCheck = new ArrayList<>();
        ArrayList<Integer> disneyCheck = new ArrayList<>();

        int x = 0;
        int y = 0;
        int point=0;
        String type;
        Scanner scan = new Scanner(System.in);
        do {
            y++;
            if(y>1){
                System.out.println("Invalid input, please enter a valid category");
                type = scan.nextLine();
            }
            else{
            System.out.println("Please enter the category: ");
            type = scan.nextLine();
        }}
        while (!(type.equals("sports") || type.equals("music") || type.equals("celebs") || type.equals("disney")));
        do {
            x++;
            if (x > 1) {
                System.out.println("Invalid input,please enter a valid number :");
                try {
                    point = scan.nextInt();
                }catch (InputMismatchException e){
                    System.out.println("Wrong input: Restarting");
                  x=0;
                  y=0;
                  rank();
                }
            } else {
                System.out.println("Please enter what level you want: ");
                try {
                    point = scan.nextInt();
                }catch (InputMismatchException e){
                    System.out.println("Wrong input: Restarting");
                    x=0;
                    y=0;
                rank();
                }
            }
        } while (!(point == 100 || point == 200 || point == 300 || point == 400 || point == 500));
        if (type.equals("celebs")) {
            celebrityCheck.add(point);
            Celebrity.celebrityHash(point);
        }
        if (type.equals("music")) {
            musicCheck.add(point);
        }
        if (type.equals("disney")) {
            disneyCheck.add(point);
            Disney.disneyHash(point);
        }
        if (type.equals("sports")) {
            sportsCheck.add(point);
            System.out.println("doness");
        }

    }



    public static void main(String[] args) {
rank();

    }
}
