public class Main {
    public static void main(String[] args) {
        Player asuna = new Player(1, "Asuna", 100);
        Player lethalBacon = new Player(2, "LethalBacon", 205);
        Player hpDeskjet = new Player(3, "HPDeskjet", 34);

        PlayerLinkedList list = new PlayerLinkedList();
        list.addToFront(asuna);
        list.addToFront(lethalBacon);
        list.addToFront(hpDeskjet);

        list.printList();
        System.out.println("Size: " + list.getSize());

        list.removeFromFront();

        list.printList();
        System.out.println("Size: " + list.getSize());

        System.out.println(list.contains(new Player(1, "Asuna", 100)));
        System.out.println(list.indexOf(new Player(1, "Asuna", 100)));
        System.out.println(list.contains(new Player(3, "HPDeskjet", 34)));
        System.out.println(list.indexOf(new Player(3, "HPDeskjet", 34)));
    }
}