public class Node {
    private int data;
    private Node leftChild;
    private Node rightChild;

    public Node(int data) {
        this.data = data;
    }

    public void insert(int value) {
        if (value == data) {
            return;   // duplicates are not accepted
        }

        if (value < data) {
            if (leftChild == null) {
                leftChild = new Node(value);
            } else {
                leftChild.insert(value);
            }
        } else {
            if (rightChild == null) {
                rightChild = new Node(value);
            } else {
                rightChild.insert(value);
            }
        }
    }

    public void traverseInOrder() {
        if (leftChild != null) {
            leftChild.traverseInOrder();
        }

        System.out.println("Data: " + data);

        if (rightChild != null) {
            rightChild.traverseInOrder();
        }
    }

    public Node get(int value) {
        if (value == data) {
            return this;
        }

        if (value < data) {
            if (leftChild != null) {
                return leftChild.get(value);
            }
        } else {
            if (rightChild != null) {
                return rightChild.get(value);
            }
        }

        return null;
    }

    // ---- Quiz 6 methods ----

    public Node getMin() {
        if (leftChild == null) {
            return this;               // nothing smaller on the left, so this is the minimum
        }
        return leftChild.getMin();     // otherwise the minimum is further down the left side
    }

    public Node getMax() {
        if (rightChild == null) {
            return this;               // nothing larger on the right, so this is the maximum
        }
        return rightChild.getMax();    // otherwise the maximum is further down the right side
    }

    public void traverseInOrderDescending() {
        if (rightChild != null) {
            rightChild.traverseInOrderDescending();   // larger values first
        }

        System.out.println("Data: " + data);

        if (leftChild != null) {
            leftChild.traverseInOrderDescending();    // then the smaller values
        }
    }

    public int getData() { return data; }
    public Node getLeftChild() { return leftChild; }
    public Node getRightChild() { return rightChild; }

    @Override
    public String toString() {
        return "Node{data=" + data + "}";
    }
}