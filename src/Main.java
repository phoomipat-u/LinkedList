import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList<String> lls = new DoublyLinkedList<String>();
        lls.add("new");
        lls.add("lol");
        lls.add("hi");
        lls.add("ho");
        lls.add("a");
        System.out.println(lls.toString());

        lls.remove(1);
        System.out.println(lls.toString());

        lls.remove(2);
//        for(String a : lls){
//
//        }

        System.out.println(lls.toString());

    }
}
