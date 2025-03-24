import maps.CityMap;
import maps.Map;
import maps.WildernessMap;

import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Map map = createMap();
    }

    public static Map createMap() {
        Map map;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose which map you would like to create: ");
        System.out.println("1 for City map");
        System.out.println("2 for Wildness map");
        int choice = scanner.nextInt();
        return switch (choice) {
            case 1 -> {
                map = new CityMap(10, 10);
                map.display();
                yield map;
            }
            case 2 -> {
                map = new WildernessMap(10, 10);
                map.display();
                yield map;
            }
            default -> {
                System.out.println("Invalid choice, quitting.");
                yield null;
            }
        };
    }
}