package collection;

import java.util.*;

public class SetPractice {

    // classes extend set interface
    public static void practiceSet() {
        Set<String> hashSet = new HashSet<>();
        Set<String> linkedHashSet = new LinkedHashSet<>();
        Set<String> treeSet = new TreeSet<>();
    }

    public static void practiceHashSet() {
        Set<String> hashSet = new HashSet<>();

        hashSet.add("Hash set 1");
        hashSet.add("Hash set 2");
        hashSet.add("Hash set 3");
        hashSet.add("Hash set 4");
        hashSet.add("Hash set 4");
        hashSet.add(null);

        Iterator<String> iterator = hashSet.iterator();

        while(iterator.hasNext()) {
            System.out.println("Hash set Example: "  + iterator.next());
        }
    }

    public static void practiceLinkedHashSet() {
        Set<String> linkedHashSet = new LinkedHashSet<>();

        linkedHashSet.add("String 1");
        linkedHashSet.add("String 1");
        linkedHashSet.add("String 2");
        linkedHashSet.add("String 3");
        linkedHashSet.add("String 4");
        linkedHashSet.add("String 7");
        linkedHashSet.add("String 5");

        Iterator<String> iterator = linkedHashSet.iterator();
        while(iterator.hasNext()){
            System.out.println("Link hash set: " + iterator.next());
        }
    }

    public static void practiceTreeSet() {
        SortedSet<String> s = new TreeSet<>();

        s.add("Hello");
        s.add("An");
        s.add("Dat");
        s.add("Tri Minh");

        Iterator<String> iterator = s.iterator();

        while(iterator.hasNext())   {
            System.out.println("Tree set:  " + iterator.next());
        }
    }


    public static void main(String[] args) {
        practiceHashSet();
    }
}
