package hackerrank.easy;

import java.util.*;

public class QHeap1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       int Q = scanner.nextInt();


        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        Set<Integer> validElements = new HashSet<>();

        for (int i = 0; i < Q; i++) {
            int queryType = scanner.nextInt();

            if (queryType == 1) {
                int value = scanner.nextInt();
                minHeap.add(value);
                validElements.add(value);
            } else if (queryType == 2) {
                int value = scanner.nextInt();
                validElements.remove(value);
            } else if (queryType == 3) {
                while (!validElements.contains(minHeap.peek())) {
                    minHeap.poll();
                }
                System.out.println(minHeap.peek());
            }
        }

        scanner.close();
    }
}

