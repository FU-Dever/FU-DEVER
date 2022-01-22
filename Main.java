import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Candidate> candidates = new ArrayList<>();
        while (true) {
            int choice = Funtion.menu();
            switch (choice) {
                case 1:
                    Funtion.createCandidate(candidates, 0);
                    break;

                case 2:
                    Funtion.createCandidate(candidates, 1);
                    break;

                case 3:
                    Funtion.createCandidate(candidates, 2);
                    break;

                case 4:
                    Funtion.searchCandidate(candidates);
                    break;

                case 5:
                    return;
                default:
                    System.out.println("Choose again from 0 - 2");
            }
        }
    }
}
