import java.util.Random;
import java.util.Scanner;

public class HomeWork4 {

    public static Random random = new Random();
    public static Scanner scanner = new Scanner(System.in);

    public static char playerViewer = 'ℒ';
    public static int playerHP = 100;
    public static int playerAttack = 50;

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
    public static int mapSizeMin = 3;
    public static int mapSizeMax = 6;
    public static char emptySell = '_';




    public static void main(String[] args){
        createMap();
        showMap(mapHight, mapWight);

    }

    public static void createMap(){
        mapHight = randomRange(mapSizeMin,mapSizeMax);
        mapWight = randomRange(mapSizeMin,mapSizeMax);
        map = new char [mapHight][mapWight];
    }

    public static void showMap (int hight, int wight){
        for (int i = 0; i < hight; i++){
            System.out.print("|");
            for (int j = 0; j < wight; j++){
                map[i][j] = emptySell;
                System.out.print(map[i][j] + "|");
            }
            System.out.println();
        }

    }

    public static int randomRange(int min, int max){
        return random.nextInt(max - min + 1)+min;
    }

}
