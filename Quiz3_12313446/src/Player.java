public class Player {
    private int id;
    private String name;
    private int level;

    public Player(int id, String name, int level) {
        this.id = id;
        this.name = name;
        this.level = level;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public int getLevel() { return level; }

    @Override
    public String toString() {
        return "Player{id=" + id + ", name='" + name + "', level=" + level + "}";
    }
}