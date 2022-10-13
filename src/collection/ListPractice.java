package collection;

import java.util.*;

public class ListPractice {

    public static void practiceArrayList() {
        List<String> arrayList = new ArrayList<>();

        arrayList.add("Hello 1");
        arrayList.add("Hello 2");
        arrayList.add("Hello 3");
        arrayList.add("Hello 4");

        Iterator<String> iterator = arrayList.iterator();
        int count = 0;
        while(iterator.hasNext()) {
            ++count;
            System.out.println("String number " + count + ": " + iterator.next());
        }
    }

    public static void practiceLinkedList() {
        List<String> linkedList = new LinkedList<>();

        linkedList.add("Hello 1");
        linkedList.add("Hello 2");
        linkedList.add("Hello 3");
        linkedList.add("Hello 4");

        Iterator iterator = linkedList.iterator();

        while(iterator.hasNext())   {
            System.out.println("Linked list: " + iterator.next());
        }
    }

    public static void practiceVector() {
        List<String> vector = new Vector<>();

        vector.add("Hello 1");
        vector.add("Hello 2");
        vector.add("Hello 3");
        vector.add("Hello 4");

        Iterator iterator = vector.iterator();

        while(iterator.hasNext())    {
            System.out.println("Vector: " + iterator.next());
        }
    }

    public static void practiceStack () {
        Stack<String> stack = new Stack<>();

        stack.push("Hello 1");
        stack.push("Hello 2");
        stack.push("Hello 3");
        stack.push("Hello 4");

        Iterator iterator = stack.iterator();
        while( iterator.hasNext()) {
            System.out.println("Stack "+ iterator.next());
        }
    }

    public static void main(String[] args) {
        ListPractice.practiceStack();
    }
}
