package collection;

import java.util.*;

public class QueuePractice {
    public static void practicePriorityQueue() {
        PriorityQueue<String> priorityQueue = new PriorityQueue<>();

        priorityQueue.add("String 1");
        priorityQueue.add("String 2");
        priorityQueue.add("atring 3");
        priorityQueue.add("btring 6");
        priorityQueue.add("String 5");

        System.out.println("Priority queue: " + priorityQueue);

        // poll similar pop in C++
        System.out.println("Priority.poll " + priorityQueue.poll());

        Iterator<String> iterator = priorityQueue.iterator();

        // get an element in head use peek() or element()
        System.out.println("Priority.peek is heading " + priorityQueue.peek());
        System.out.println("Priority.element is heading: " + priorityQueue.element());

        while(iterator.hasNext()) {
            System.out.println("Priority queue: " + iterator.next());
        }

        while (!priorityQueue.isEmpty()) {
            System.out.println(priorityQueue.remove());
        }

        Iterator<String> iterator1 = priorityQueue.iterator();
        while(iterator1.hasNext()) {
            System.out.println("Priority remove " + iterator1.next());
        }

        PriorityQueue<Integer> priorityQueue1 = new PriorityQueue<Integer>();
        priorityQueue1.add(1);
        priorityQueue1.add(5);
        priorityQueue1.add(4);

        System.out.println(priorityQueue1);

        Iterator<Integer> iterator2 = priorityQueue1.iterator();
        while(iterator2.hasNext()) {
            System.out.println("Priority remove " + iterator2.next());
        }

        PriorityQueue<String> pq = new PriorityQueue<>();
        pq.add("Geeks");
        pq.add("For");
        pq.add("Geeks");
        System.out.println("PriorityQueue: " + pq);
    }

    public static void practiceArrayDeque() {
        Deque<String> deque = new ArrayDeque<>();
        deque.add("Hello 1");
        deque.add("Hello 2");
        deque.add("Hello 3");

        for(String d:deque) {
            System.out.println("Deque: "+ d);
        }
    }

    public static void main(String[] args) {
        practicePriorityQueue();
    }
}
