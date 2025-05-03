import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.Objects;

public class BookRecommendationSystem {
    ObservableList<Recommendation> recommendations = FXCollections.observableArrayList();

    public BookRecommendationSystem() {
        Recommendation initial = new Recommendation("All Books");
        Book book1 = new Book("author1", "Book1", "Artbook", 2000);
        initial.addBook(book1);
        recommendations.add(initial);
    }


    public ObservableList<Recommendation> getRecommendations() {
        return recommendations;
    }

    private Recommendation printRecommendationInfo(String targetAudience) {
        for (Recommendation r : recommendations) {
            if (r.getTargetAudience().equals(targetAudience)) {
                System.out.println(r);
                return r;
            } else {
                System.out.println("Not found");
            }
        }
        return null;
    }

    private void addRecommendation(Recommendation recommendation) {
        recommendations.add(recommendation);
    }

    private void removeRecommendation(Recommendation recommendation) {
        recommendations.remove(recommendation);
    }

    public void cloneRecommendation(Recommendation recommendation) {
        if (recommendations.contains(recommendation)) {
            try {
                Recommendation newR = recommendation.clone();
                newR.setTargetAudience(recommendation.getTargetAudience() + "-copy");
                recommendations.add(newR);
                System.out.println("List cloned");
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("List not found");
        }
    }
}
