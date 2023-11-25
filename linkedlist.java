import java.util.*;

public class linkedlist {
    public static void main(String[] args) {

        LinkedList<String> linkedList = new LinkedList<String>();

        linkedList.push("B");
        linkedList.offer("C");
        linkedList.offer("D");


        linkedList.add(0,"X");

        System.out.println(linkedList);

        System.out.println(linkedList.peekFirst());

        System.out.println(linkedList.peekLast());

        linkedList.addFirst("0");

        linkedList.addLast("1");


        System.out.println(linkedList);
    }
}
