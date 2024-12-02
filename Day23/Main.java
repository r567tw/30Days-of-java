import java.util.ArrayList;
import java.util.LinkedList;
import java.util.HashMap;
import java.util.Stack;
import java.util.Queue;
import java.util.Iterator;

class Main {

    public static void main(String[] args){
        // ArrayList
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        System.out.println("ArrayList: " + list);
        
        // 取得元素
        System.out.println("Element at index 1: " + list.get(1));
        
        // 移除元素
        list.remove("Banana");
        System.out.println("After removal: " + list);

        // LinkedList
        LinkedList<String> list2 = new LinkedList<>();
        list2.add("Dog");
        list2.add("Cat");
        list2.add("Bird");

        System.out.println("LinkedList: " + list2);
        
        // 添加元素到頭部和尾部
        list2.addFirst("Elephant");
        list2.addLast("Fish");
        System.out.println("After adding at head and tail: " + list2);
        
        // 移除頭部元素
        list2.removeFirst();
        System.out.println("After removing first element: " + list2);


        // HashMap
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Alice", 25);
        map.put("Bob", 30);
        map.put("Charlie", 35);

        System.out.println("HashMap: " + map);
        
        // 取得值
        System.out.println("Alice's age: " + map.get("Alice"));
        
        // 刪除鍵值對
        map.remove("Bob");
        System.out.println("After removal: " + map);

        // Stack
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Stack: " + stack);
        
        // 查看頂部元素
        System.out.println("Top element: " + stack.peek());
        
        // 彈出頂部元素
        stack.pop();
        System.out.println("After pop: " + stack);

        //Queue
        Queue<String> queue = new LinkedList<>();
        queue.add("John");
        queue.add("Jane");
        queue.add("Doe");

        System.out.println("Queue: " + queue);
        
        // 查看隊首元素
        System.out.println("Head element: " + queue.peek());
        
        // 移除隊首元素
        queue.poll();
        System.out.println("After poll: " + queue);

        ArrayList<String> lista = new ArrayList<>();
        lista.add("Apple");
        lista.add("Banana");
        lista.add("Cherry");

        Iterator<String> iterator = lista.iterator();
        System.out.println("Iterating through ArrayList:");
        
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
        }
    }

}