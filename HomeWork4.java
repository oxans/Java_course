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

//Box and Key
    public static char boxViewer = '✪';
    public static int boxY;
    public static int boxX;
    public static char playerWithKey = 'ᛉ';
    public static char keyChar = 'K';
    public static int keyY;
    public static int keyX;
//Enemy
    public static char enemyViewer = '✠';
    public static int enemyHP = 100;
    public static int enemyHit;
    public static int enemyHitMin = 30;
    public static int enemyHitMax = 60;
// Map
    public static char map[][];
    public static char invmap[][];
    public static int mapY;
    public static int mapX;
    public static int mapSizeMin = 2;
    public static int mapSizeMax = 6;
    public static char emptySell = '_';




    public static void main(String[] args){
        createMap();
        createPlayer();
        createBox();
        createKey();
        createEnemy();
        showMap(mapY, mapX);
        moveHero();

    }

    public static void createMap(){
        mapY = randomRange(mapSizeMin,mapSizeMax);
        mapX = randomRange(mapSizeMin,mapSizeMax);
        map = new char [mapY][mapX];
        invmap = new char[mapY][mapX];
        for (int i = 0; i < mapY; i ++) {
            for (int j = 0; j < mapX; j++){
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
        playerY = randomRange(0,mapY-1);
        playerX = randomRange(0,mapX-1);
        map[playerY][playerX] = playerViewer;
    }

    public static void createBox(){
        do{
             boxY = random.nextInt(mapY-1);
             boxX = random.nextInt(mapX-1);
        }while  (boxX == playerX && boxY == playerY);
           map[boxY][boxX] = boxViewer;
    }

    public static void createKey(){

        do{
            keyY = random.nextInt(mapY-1);
            keyX = random.nextInt(mapX-1);
        }while  (keyX == playerX && keyY == playerY || keyX == boxX && keyY == boxY );
        invmap[keyY][keyX] = keyChar;
    }

    public static void createEnemy(){
        enemyHit = randomRange(enemyHitMin,enemyHitMax);
        int y;
        int x;
        do{
            y = random.nextInt(mapY-1);
            x = random.nextInt(mapX-1);
        }while  (x == playerX && y == playerY || x == boxX && y == boxY || x == keyX && y ==keyY );

        invmap[y][x] = enemyViewer;

    }

    public static void moveHero(){
        int placeY = playerY;
        int placeX = playerX;
        int moveTo;
        do {
            moveTo  = scanner.nextInt();
            switch (moveTo){
                case moveUp:
                    playerY -= 1;
                    break;
                case moveDown:
                    playerY += 1;
                    break;
                case moveLeft:
                    playerX -= 1;
                    break;
                case moveRight:
                    playerX += 1;
                    break;

            }
        } while (!checkNextStep(placeY, placeX, playerY, playerX));
        nextStep(placeY, placeX, playerY, playerX);

    }

    public static boolean checkNextStep (int cucentX, int currentY, int playerX, int playerY ){
        if (playerY >= 0 && playerY < mapY && playerX >=0 && playerX < mapX){
            return true;
        }else {
            playerX = cucentX;
            playerY = currentY;
            return false;
        }
    }



    public static int randomRange(int min, int max){
        return random.nextInt(max - min + 1)+min;
    }

}
