package ArcInJava;

public class Player {

    // Player Variables
    String playerName;
    int playerHealth;
    int selectedClass;
    int[] playerLocation;

    public Player(String playerName, int playerHealth, int selectedClass) {
        this.playerName = playerName;
        this.playerHealth = playerHealth;
        this.selectedClass = selectedClass;
        this.playerLocation = new int[]{10,0};
    }
    
    public String getPlayerName() {
        return playerName;
    }
    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }



    public int getPlayerHealth() {
        return playerHealth;
    }
    public void setPlayerHealth(int playerHealth) {
        this.playerHealth = playerHealth;
    }



    public int getSelectedClass() {
        return selectedClass;
    }
    public void setSelectedClass(int selectedClass) {
        this.selectedClass = selectedClass;
    }




    public int[] getPlayerLocation() {
        return playerLocation;
    }
    public void setPlayerLocation(int[] playerLocation) {
        this.playerLocation = playerLocation;
    }
}
