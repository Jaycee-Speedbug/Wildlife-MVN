package wildlife;

/**
 * Hello world!
 *
 */
public class App 
{

    /**
     *
     * @param args
     */
    public static void main(String[] args) 
    {
        // Création du jeu
        WildLifeGame theGame = new WildLifeGame(15,WildLifeGame.MODE_WINDOW);
        theGame.runGame();
        //theGame.endGame();
        theGame = null;
        System.exit(0);
    }
}
