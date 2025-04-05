import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        SortingStrategy bubbleSort = new BubbleSort();
        SortingStrategy insertionSort = new InsertionSort();
        SortingStrategy heapSort = new HeapSort();
        SortContext sortContext = new SortContext(new BubbleSort());

        System.out.println("Create a array with 30 elements");
        long startTime;
        long endTime;

        startTime = System.nanoTime();
        sortContext.setSortingStrategy(bubbleSort);
        sortContext.sortList(generateArray(30));
        endTime = System.nanoTime();
        System.out.println("Sorting time: " + (endTime - startTime) + "ns");

        startTime = System.nanoTime();
        sortContext.setSortingStrategy(insertionSort);
        sortContext.sortList(generateArray(30));
        endTime = System.nanoTime();
        System.out.println("Sorting time: " + (endTime - startTime) + "ns");

        startTime = System.nanoTime();
        sortContext.setSortingStrategy(heapSort);
        sortContext.sortList(generateArray(30));
        endTime = System.nanoTime();
        System.out.println("Sorting time: " + (endTime - startTime) + "ns");

        System.out.println("Create a array with 100000 elements");

        startTime = System.nanoTime();
        sortContext.setSortingStrategy(bubbleSort);
        sortContext.sortList(generateArray(100000));
        endTime = System.nanoTime();
        System.out.println("Sorting time: " + (endTime - startTime) + "ns");

        startTime = System.nanoTime();
        sortContext.setSortingStrategy(insertionSort);
        sortContext.sortList(generateArray(100000));
        endTime = System.nanoTime();
        System.out.println("Sorting time: " + (endTime - startTime) + "ns");

        startTime = System.nanoTime();
        sortContext.setSortingStrategy(heapSort);
        sortContext.sortList(generateArray(100000));
        endTime = System.nanoTime();
        System.out.println("Sorting time: " + (endTime - startTime) + "ns");

    }

    private static ArrayList<Integer> generateArray(int size) {
        Random random = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            list.add(random.nextInt(100));
        }
        return list;
    }
}