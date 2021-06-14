import Datastructures.LinkList;
import Datastructures.LinkNode;

public class PrintOut {

    public static void main(String [] args){

        LinkList linkedList = new LinkList();

        LinkNode node1 = new LinkNode(1);
        LinkNode node2 = new LinkNode(2);
        LinkNode node3 = new LinkNode(3);
        LinkNode node4 = new LinkNode(4);
        LinkNode node5 = new LinkNode(-5);
        LinkNode node6 = new LinkNode(6);

        linkedList.insertNode(node1);
        linkedList.insertNode(node2);
        linkedList.insertNode(node3);
        linkedList.insertAtHead(node4);
        linkedList.insertAtHead(node6);

        printLinkedList(linkedList.head);
        System.out.println();
        System.out.println("------------------");
        System.out.println();
        try{
            linkedList.insertAtIndex(1,node5);
        } catch (Exception e){
            System.out.println("EXCEPTION:: " + e.getMessage());
        }

        printLinkedList(linkedList.head);
        System.out.println();
        System.out.println("------------------");
        System.out.println();

        int index = 5;
        linkedList.removeIndex(index);
        System.out.println("Removing index:: " + index );

        printLinkedList(linkedList.head);


    }

    public static void printLinkedList(LinkNode head){
        int counter = 0;
        while(head != null){

            System.out.println("Index:: " + counter + " value :: " + head.value);
            head = head.next;
            counter++;
        }
    }
}
