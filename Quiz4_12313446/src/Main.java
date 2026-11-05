public class Main {
    public static void main(String[] args) {
        Player kaidatsuki = new Player(1, "Kaidatsuki", 100);
        Player kawakiwi = new Player(2, "Kawakiwi", 205);
        Player waffles = new Player(3, "W4FFLES", 34);
        Player jiyaballs = new Player(4, "jIyaballs", 95);
        Player joeyValorant = new Player(5, "JoeyValorant", 59);
        Player lumimine = new Player(6, "Lumimine", 72);   // collides with Kawakiwi

        SimpleHashTable hashTable = new SimpleHashTable();
        hashTable.put(kaidatsuki.getUserName(), kaidatsuki);
        hashTable.put(kawakiwi.getUserName(), kawakiwi);
        hashTable.put(waffles.getUserName(), waffles);
        hashTable.put(jiyaballs.getUserName(), jiyaballs);
        hashTable.put(joeyValorant.getUserName(), joeyValorant);
        hashTable.put(lumimine.getUserName(), lumimine);

        hashTable.printHashtable();

        System.out.println("\nRemoved: " + hashTable.remove("Lumimine"));
        hashTable.printHashtable();

        System.out.println("\nGet Lumimine: " + hashTable.get("Lumimine"));
        System.out.println("Remove Nobody: " + hashTable.remove("Nobody"));
    }
}