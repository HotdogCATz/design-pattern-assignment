package q2;

public class App {
    public static void main(String[] args) {
        Game footballGame = new Game(new FootballStrategy());
        footballGame.play();
        
        System.out.println(); // Separate output
        
        Game basketballGame = new Game(new BasketballStrategy());
        basketballGame.play();
    }
}
