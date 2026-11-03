public class PlayerLinkedList {
    private PlayerNode head;
    private int size;

    public void addToFront(Player player) {
        PlayerNode playerNode = new PlayerNode(player);
        playerNode.setNextPlayer(head);
        head = playerNode;
        size++;
    }

    public PlayerNode removeFromFront() {
        if (head == null) {
            return null;
        }

        PlayerNode removedNode = head;
        head = head.getNextPlayer();
        removedNode.setNextPlayer(null);
        size--;

        return removedNode;
    }

    public int getSize() {
        return size;
    }

    public int indexOf(Player player) {
        PlayerNode current = head;
        int index = 0;

        while (current != null) {
            if (current.getPlayer().equals(player)) {
                return index;
            }
            current = current.getNextPlayer();
            index++;
        }

        return -1;
    }

    public boolean contains(Player player) {
        return indexOf(player) != -1;
    }

    public void printList() {
        PlayerNode current = head;
        System.out.print("HEAD -> ");
        while (current != null) {
            System.out.print(current.getPlayer());
            System.out.print(" -> ");
            current = current.getNextPlayer();
        }
        System.out.println("null");
    }
}