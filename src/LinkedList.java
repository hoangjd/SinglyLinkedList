public class LinkedList {
    private Node head = null;

    public LinkedList() {
        this.head = new Node(0);
    }

    public void addNode(Node node) {
        Node pointer = this.head;
        if(pointer == null)
            this.head = node;
        else {
            while (pointer.getNextNode() != null) {
                pointer = pointer.getNextNode();
            }
            pointer.setNextNode(node);
        }
    }

    public void deleteNode(int data) {
        Node currentPointer = this.head;
        Node nextPointer = this.head;
        if (currentPointer.getData() == data) {
            removeHeadNode(currentPointer);
            return;
        } else {
            while (nextPointer.getNextNode() != null) {
                if (nextPointer.getNextNode().getData() == data) {
                    nextPointer = nextPointer.getNextNode();
                    currentPointer.setNextNode(nextPointer.getNextNode());
                    return;
                }
                nextPointer = nextPointer.getNextNode();
                currentPointer = currentPointer.getNextNode();
            }
        }
        currentPointer.setNextNode(null);
    }

    private void removeHeadNode(Node head) {
        if (head.getNextNode() != null) {
            this.head = head.getNextNode();
        } else {
            this.head = null;
        }
    }

    public void printNodes() {
        Node pointer = this.head;
        String linkedList = "";
        while (pointer.getNextNode() != null){
            linkedList += (pointer.getData() + " -> ");
            pointer = pointer.getNextNode();
        }
        linkedList += pointer.getData();
        System.out.println(linkedList);

    }

}
