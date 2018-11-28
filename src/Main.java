import sun.awt.image.ImageWatched;

public class Main {

    public static void main(String[] args) {
        System.out.print("Constructed Linked List: ");
        shouldPrintOneNode();

        System.out.print("Added 3 Nodes: ");
        shouldPrintThreeNodes();

        System.out.print("10 Node Linked List: ");
        LinkedList tenNodes = tenNodeLinkedList();
        tenNodes.printNodes();

        System.out.print("Delete Node 5: ");
        tenNodes.deleteNode(5);
        tenNodes.printNodes();

        System.out.print("Delete Node 0: ");
        tenNodes.deleteNode(0);
        tenNodes.printNodes();

        System.out.print("Delete Node 9: ");
        tenNodes.deleteNode(9);
        tenNodes.printNodes();


    }

    private static void shouldPrintOneNode() {
        LinkedList linkedList = new LinkedList();
        linkedList.printNodes();
    }

    private static void shouldPrintThreeNodes() {
        LinkedList linkedList = new LinkedList();
        for(int i = 1; i < 3; i++){
            Node node = new Node(i);
            linkedList.addNode(node);
        }
        linkedList.printNodes();
    }

    private static LinkedList tenNodeLinkedList() {
        LinkedList linkedList = new LinkedList();
        for(int i = 1; i < 10; i++){
            Node node = new Node(i);
            linkedList.addNode(node);
        }
        return linkedList;
    }
}
