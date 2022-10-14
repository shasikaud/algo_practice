public class MaxStack {

    public MaxStack() {};
    private class Node{
        private int value;
        private Node nextNode;
        private Node prevMaxNode;
    }
    private Node maxNode;
    private Node stackHead;

    public void push(int x) throws Exception {
        Node newNode = new Node();
        newNode.value = x;
        if (stackHead == null){
            stackHead = newNode;
        } else {
            newNode.nextNode = stackHead;
            stackHead = newNode;
        }
        if (maxNode == null || newNode.value > maxNode.value){
            newNode.prevMaxNode = maxNode;
            maxNode = newNode;
        }
        this.printStack();
    }

    public int pop(){
        int popValue = stackHead.value;;
        if (stackHead == null){
            return -1;
        }
        if (stackHead.prevMaxNode != null){
            maxNode = stackHead.prevMaxNode;
        }
        stackHead = stackHead.nextNode;
        return popValue;
    }

    public int max(){
        return maxNode.value;
    }

    private void printStack(){
        System.out.println("----- STACK ----");
        Node temp = stackHead;
        while (temp != null){
            System.out.println(temp.value);
            temp = temp.nextNode;
        }
        System.out.printf("max value: %d\n", maxNode.value);
    }
}
