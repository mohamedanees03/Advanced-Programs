// Java Collections Example - Study Notes

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Collections {
    public static void main(String[] args) {

        // ----------------------------------
        // 1. Stack - LIFO (Last In First Out)
        // ----------------------------------
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Top of stack: " + stack.peek()); // 30
        stack.pop(); // removes 30
        System.out.println("Stack after pop: " + stack); // [10, 20]

        // ----------------------------------
        // 2. LinkedList as Stack (optional)
        // ----------------------------------
        LinkedList<Integer> stack2 = new LinkedList<>();
        stack2.push(100); // works like stack
        stack2.push(200);
        System.out.println("LinkedList Stack: " + stack2); // [200, 100]

        // ----------------------------------
        // 3. Set - No duplicates
        // ----------------------------------
        HashSet<Integer> set = new HashSet<>();
        set.add(5);
        set.add(2);
        set.add(3);
        set.add(2); // duplicate ignored

        System.out.println("HashSet: " + set); // [2, 3, 5] (order not guaranteed)

        // ----------------------------------
        // 4. Queue - FIFO (First In First Out)
        // ----------------------------------
        Queue<Integer> queue = new LinkedList<>();
        queue.add(5);
        queue.add(2);
        queue.add(1);

        System.out.println("Queue: " + queue); // [5, 2, 1]
        queue.remove(); // removes 5
        System.out.println("Queue after remove: " + queue); // [2, 1]

        // ----------------------------------
        // 5. HashMap - Key-Value Pairs
        // ----------------------------------
        HashMap<Integer, Character> hashMap = new HashMap<>();
        hashMap.put(1, 'A');
        hashMap.put(2, 'B');
        hashMap.put(3, 'C');

        System.out.println("HashMap: " + hashMap); // {1=A, 2=B, 3=C}

        // ----------------------------------
        // 6. ArrayList with Iterator
        // ----------------------------------
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Hi");
        arrayList.add("Subscribe to Poona Memez");

        Iterator<String> iterator = arrayList.iterator();

        System.out.println("ArrayList using Iterator:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
