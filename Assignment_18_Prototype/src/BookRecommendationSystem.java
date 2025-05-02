import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class BookRecommendationSystem {
    List<Recommendation> recommendations =  new ArrayList<Recommendation>();

    private void printRecommendations() {
        for (Recommendation r : recommendations) {
            System.out.println(r);
        }
    }

    private Recommendation printRecommendationInfo(String targetAudience) {
        for (Recommendation r : recommendations) {
            if (r.getTargetAudience().equals(targetAudience)) {
                System.out.println(r);
                return r;
            } else  {
                System.out.println("Not found");
            }
        }
        return null;
    }

    private void addRecommendation(Recommendation recommendation) {
        recommendations.add(recommendation);
    }

    private void  removeRecommendation(Recommendation recommendation) {
        recommendations.remove(recommendation);
    }

    private void cloneRecommendation(String targetAudience) {
        for (Recommendation recommendation : recommendations) {
            if (Objects.equals(targetAudience, recommendation.getTargetAudience())) {
                try {
                    Recommendation newR = recommendation.clone();
                    newR.setTargetAudience(recommendation.getTargetAudience() + "-copy");
                    recommendations.add(newR);
                    System.out.println("List cloned");
                } catch (CloneNotSupportedException e) {
                    e.printStackTrace();
                }
            } else  {
                System.out.println("List not found");
            }
        }
    }


    //
    public void start() {
        System.out.println("Welcome to the book recommendation system");
        System.out.println("Please enter your choice: ");

        System.out.println("1. View existing Recommendation");
        System.out.println("2. Clone Recommendation");
        System.out.println("3. modify Recommendation");

        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                printRecommendations();
                break;
            case 2:
                System.out.println("Please enter the name of list you want to clone: ");
                String targetAudience = sc.next();
                cloneRecommendation(targetAudience);
            case 3:
                System.out.println("Please enter the name of list you want to modify: ");
                String targetAudience1 = sc.next();
                Recommendation r =  printRecommendationInfo(targetAudience1);
                System.out.println("Please enter your choice:");
                int choice1 = sc.nextInt();
                System.out.println("1. Add book");
                System.out.println("2. Remove book");
                System.out.println("3. Modify the list name");
                switch(choice1) {
                    case 1:

                        r.addBook();
                }

        }

    }

}
