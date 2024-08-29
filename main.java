import ArcInJava.*;

public class main {

    
    public static void main(String []args) {
        Map map = new Map(20,40);
        Player player = new Player("Test", 100, 0);
        System.out.println("Hello");
        map.printMap(player.getPlayerLocation());
    }
}