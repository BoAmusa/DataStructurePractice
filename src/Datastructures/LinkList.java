package Datastructures;

import sun.awt.image.ImageWatched.Link;

public class LinkList {
    public LinkNode head;

    public void insertNode(LinkNode node){
        //Checking if linked list object has a head node

        if(head == null){
            head = node;
        } else {

            LinkNode tempNode = head;

            while(tempNode.next != null){
                //Looping thru nodes and checking if tempNode is equal to null
                tempNode = tempNode.next;
            }

            //Once tempNode is equal to null adding new node from parameter to the end of linked list object
            tempNode.next = node;

        }
    }

    public void insertAtHead(LinkNode node){

        if(head == null){
            head = node;
        } else {
            //Setting old head to object
            LinkNode oldHead = head;

            //Adding new head from paramater to head object
            head = node;

            //Setting oldhead to new head next
            head.next = oldHead;

        }
    }

    public void insertAtIndex(int index, LinkNode node){
        int indexCounter = 0;
        if(head == null){
            head = node;
        } else if(index == 0){
            insertAtHead(node);

        } else {

            LinkNode currNode = head;

            while (currNode != null) {
                indexCounter++;
                if (indexCounter == index) {

                    LinkNode nextNode = currNode.next;


                    node.next = nextNode;
                    currNode.next = node;

                    break;
                } else if (currNode == null && index > indexCounter) {
                    throw new IndexOutOfBoundsException("Index out of Bounds");
                }

                currNode = currNode.next;

            }

        }

    }

    public LinkNode getIndex(int index){
        int indexCounter = 0;
        LinkNode node = head; ;

        if(head == null){
            throw new IndexOutOfBoundsException("Index not found");
        }

        while (node != null){

            if(indexCounter == index){
                return node;
            }

            node = node.next;
            indexCounter++;
        }

        if(node == null){
            throw new IndexOutOfBoundsException("Index not found");
        }

        return node;

    }

    public void removeIndex(int index){
        int indexCounter = 0;

        if(head == null || index < 0){
            throw new IndexOutOfBoundsException("No index found or Empty linked list");
        } else if (index == 0){
            //If index is head remove head and set to next node
            LinkNode newHead = head.next;
            head = newHead;

        } else {

            LinkNode currNode = head;
            //Looping thru nodes in linked list
            while (currNode != null){
                indexCounter++;

                if(index == indexCounter && currNode.next != null){
                    LinkNode nextNextNode = currNode.next;
                    currNode.next = nextNextNode.next;
                    break;
                }else if(currNode.next == null && index >= indexCounter){
                    throw new IndexOutOfBoundsException("Index not found");
                }

                currNode = currNode.next;
            }
        }
    }

}
