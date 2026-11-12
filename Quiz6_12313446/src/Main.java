public class Main {
    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.insert(25);
        tree.insert(17);
        tree.insert(29);
        tree.insert(10);
        tree.insert(16);
        tree.insert(-5);
        tree.insert(60);
        tree.insert(63);
        tree.insert(55);

        System.out.println("In order:");
        tree.traverseInOrder();

        System.out.println("\nGet 25: " + tree.get(25));
        System.out.println("Get 100: " + tree.get(100));

        System.out.println("\nMin: " + tree.getMin());
        System.out.println("Max: " + tree.getMax());

        System.out.println("\nIn order, descending:");
        tree.traverseInOrderDescending();
    }
}