public class Node {

    private int data;
    private Node nextNode = null;

    public Node(int data){
        this.data = data;
    }

    public Node getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node node) {
        this.nextNode = node;
    }

    public int getData(){
        return this.data;
    }

}
