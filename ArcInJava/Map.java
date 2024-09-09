package ArcInJava;

public class Map {

    int mapXSize, mapYSize;
    char[][] map;


    public Map(int mapXSize, int mapYSize) {
        this.mapXSize = mapXSize;
        this.mapYSize = mapYSize;
        this.map = new char[mapXSize][mapYSize];
        this.generateMap();
    }

    public void generateMap() {
        int i,j;
        for(i=0;i<mapXSize;i++) {
            for(j=0;j<mapYSize;j++) {
                map[i][j] = '*';
            }
        }
    }

    public void printMap(int[] playerLocation) {
        int i,j;
        placePlayer(playerLocation);
        for(i=0;i<mapXSize;i++) {
            for(j=0;j<mapYSize;j++) {
                System.out.print(map[i][j]);
            }
            System.out.print("\n");
        }
    }

    public void placePlayer(int[] playerLocation) {
        this.map[playerLocation[0]][playerLocation[1]] = 'P';
    }
}
