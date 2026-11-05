public class Player {
    private int id;
    private String userName;
    private int level;

    public Player(int id, String userName, int level) {
        this.id = id;
        this.userName = userName;
        this.level = level;
    }

    public int getId() { return id; }
    public String getUserName() { return userName; }
    public int getLevel() { return level; }

    @Override
    public String toString() {
        return "Player{id=" + id + ", userName='" + userName + "', level=" + level + "}";
    }
}