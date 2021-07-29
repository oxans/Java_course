import java.util.Random;
import java.util.Scanner;

public class HomeWork4 {

    public static Random random = new Random();
    public static Scanner scanner = new Scanner(System.in);

//Player
    public static char playerViewer = 'ℒ';
    public static int countGameLevel = 1;
    public static int playerHP = 100;
    public static int playerAttack = 50;
    public static int playerY;
    public static int playerX;
    public static int scorePlayerSteps = 0;
    public static boolean configurationRandomFirstPos = false;

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

//Map
    public static char map[][];
    public static char invmap[][];
    public static int mapY;
    public static int mapX;
    public static int mapSizeMin = 2;
    public static int mapSizeMax = 6;
    public static char emptySell = '_';
    public static char readyCell = '*';




    public static void main(String[] args){
        while (isAlivePlayer()) {
            System.out.println(">>> Console Game === Start! Level " + countGameLevel + " === <<<");
            gameCycle();
            countGameLevel++;
        }
        scanner.close();
        System.out.println("Console Game === Game over! Count Level: " + countGameLevel + ". Count steps: " + scorePlayerSteps + " ===");

    }

    public static void gameCycle() {
        createMap();
        createPlayer(configurationRandomFirstPos);
        createEnemy();
        while(true) {
            createMap();
            System.out.println("[Player info] > Step: " + scorePlayerSteps + ". Health: " + playerHP);
            moveHero();

            if (isFullMap()) {
                System.out.println("Map is Full. Welcome to next level");
                break;
            }

            if (!isAlivePlayer()) {
                System.out.println("Player is dead");
                showMap();
                break;
            }
        }
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
        System.out.println("Create map > Size " + mapX + "x" + mapY + " <");
    }

    public static void showMap (){
        System.out.println("===== ACTUAL MAP =====");
        for (int y = 0; y < mapY; y++) {
            for (int x = 0; x < mapX; x++) {
                System.out.print(map[y][x] + "|");
            }
            System.out.println();
        }
        System.out.println("======================");

    }

    public static void createPlayer(boolean isRadom){
        if (isRadom) {
        playerY = randomRange(0,mapY-1);
        playerX = randomRange(0,mapX-1);
        }else{
            playerY = mapY / 2;
            playerX = mapX / 2;
        }
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
        int countEnemies = (mapX + mapY) / 4;
        for (int i = 0; i <countEnemies; i++) {
            do {
                y = random.nextInt(mapY - 1);
                x = random.nextInt(mapX - 1);
            } while (x == playerX && y == playerY || x == boxX && y == boxY || x == keyX && y == keyY);

            invmap[y][x] = enemyViewer;
        }
        System.out.println("Enemies count: " + countEnemies + ". Enemy damage: " + enemyHit);

    }

    public static void moveHero(){
        int currentY = playerY;
        int currentX = playerX;
        int playerDestination;

        do {
            System.out.print("Enter your move (UP = " + moveUp + ", DOWN = " + moveDown +
                    ", LEFT = " + moveLeft + ", RIGHT = " + moveRight + ") ->>> ");
            playerDestination  = scanner.nextInt();

            switch (playerDestination) {
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

        } while (!checkNextStep(currentX, currentY, playerY, playerX));
        nextStep(currentY, currentX, playerY, playerX);
        ++scorePlayerSteps;

    }

    public static boolean isFullMap(){
        for (int y = 0; y < mapY; y++){
            for (int x = 0; x < mapX; x++){
                if (map[y][x] == emptySell) return false;
            }
        }
        return true;
    }

    public static boolean checkNextStep (int currentX, int currentY, int playerX, int playerY ){
        if (playerY >= 0 && playerY < mapY && playerX >=0 && playerX < mapX){
            System.out.println("Player move to [" + (playerX + 1) + ":" + (playerY + 1) + "] success");
            return true;
        }else {
            playerX = currentX;
            playerY = currentY;
            System.out.println("Invalid move. Please try again!");
            return false;
        }
    }

    public static void nextStep(int currentY, int currentX, int playerX, int playerY){
        if (invmap[playerY][playerX] == enemyViewer) {
            playerHP -= enemyHit;
            System.out.println("Enemy give damage > " + enemyHit + ". Player HP = " + playerHP);
        }

        map[currentY][currentX] = readyCell;
        map[playerY][playerX] = playerViewer;
        invmap[playerY][playerX] = readyCell;

        if (randomActionBuff()) {
            healPlayer(randomRange(10, 20));
        }
    }

    public static boolean isAlivePlayer() {
        return playerHP > 0;
    }

    public static boolean randomActionBuff() {
        return random.nextInt(100) < 10;
    }
    public static void healPlayer(int value) {
        playerHP += value;
        System.out.println("Player heal on " + value + ". Player HP = " + playerHP);
    }

    public static int randomRange(int min, int max){
        return random.nextInt(max - min + 1)+min;
    }

}
