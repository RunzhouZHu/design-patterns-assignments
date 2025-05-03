package example;

import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        SimpleCollection ring = new Ring();
        ring.add(17);
        ring.add(3);
        ring.add(-2);
        ring.add(0);

        Iterator<Integer> iterator = ring.iterator();

        while(iterator.hasNext()){
            System.out.println("In turn: " + iterator.next());

            String s = sc.nextLine();
            if(s.equals("q")){
                break;
            }
        }

    }
}
