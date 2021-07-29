import java.util.Random;
import java.util.Scanner;

public class HomeWork4 {

    public static Random random = new Random();
    public static Scanner scanner = new Scanner(System.in);
//Player
    public static char playerViewer = 'ℒ';
    public static int playerHP = 100;
    public static int playerAttack = 50;
    public static int playerY;
    public static int playerX;

    public static int moveUp = 8;
    public static int moveDown = 2;
    public static int moveLeft = 4;
    public static int moveRight = 6;


    public static char boxViewer = '✪';
    public static char playerWithKey = 'ᛉ';

    public static char enemyViewer = '✠';
    public static int enemyHP = 100;
    public static int enemyHit;
    public static int enemyHitMin = 30;
    public static int enemyHitMax = 60;
// Map
    public static char map[][];
    public static int mapWight;
    public static int mapHight;
    public static int mapSizeMin = 2;
    public static int mapSizeMax = 6;
    public static char emptySell = '_';




    public static void main(String[] args){
        createMap();
        createPlayer();
        createBox();
        showMap(mapHight, mapWight);

    }

    public static void createMap(){
        mapHight = randomRange(mapSizeMin,mapSizeMax);
        mapWight = randomRange(mapSizeMin,mapSizeMax);
        map = new char [mapHight][mapWight];
        for (int i = 0; i < mapHight; i ++) {
            for (int j = 0; j < mapWight; j++){
                map[i][j] = emptySell;
            }
        }
    }

    public static void showMap (int hight, int wight){
        for (int i = 0; i < hight; i++){
            System.out.print("|");
            for (int j = 0; j < wight; j++){
                System.out.print(map[i][j] + "|");
            }
            System.out.println();
        }

    }

    public static void createPlayer(){
        playerY = randomRange(0,mapHight-1);
        playerX = randomRange(0,mapWight-1);
        map[playerY][playerX] = playerViewer;
    }

    public static void createBox(){
        int x = random.nextInt(mapHight);
        int y = random.nextInt(mapWight);
        if (map[y][x] != map[playerY][playerX]){
            map[y][x] = boxViewer;
        }else {
            map[0][0] = boxViewer;
        }



    }

    public static int randomRange(int min, int max){
        return random.nextInt(max - min + 1)+min;
    }

}
