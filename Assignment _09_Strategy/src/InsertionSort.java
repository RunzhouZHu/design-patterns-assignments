import java.util.ArrayList;

public class InsertionSort implements SortingStrategy {
    // Insertion sort divides the list into 2 parts
    // Sorted and unsorted part
    // Pick a new element from the unsorted list
    // And insert it into the right place of the sorted list

    @Override
    public ArrayList<Integer> sort(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            int key = list.get(i);
            int j = i - 1;

            while (j >= 0 && list.get(j) > key) {
                list.set(j + 1, list.get(j));
                j = j - 1;
            }
            list.set(j + 1, key);
        }

        return list;
    }
}
