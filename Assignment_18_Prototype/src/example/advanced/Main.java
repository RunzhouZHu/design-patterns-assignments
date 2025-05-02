package example.advanced;

public class Main {
    public static void main(String[] args) {

        final int GROUP_SIZE = 8;

        // Create a solider using the builder pattern
        Director director = new Director();
        SoldierBuilder builder = new SoldierBuilder();
        director.constructInfantrySoldier(builder);
        Soldier soldier = builder.getResult();

        System.out.println(soldier);

        // Create a group of soldier by clone the original soldier
        for (int i = 0; i < GROUP_SIZE; i++) {
            Soldier clonedSoldier = soldier.clone();
            System.out.println(clonedSoldier);
        }
    }
}
