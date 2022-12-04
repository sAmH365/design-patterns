package gof.designpatterns.struct._12_proxy.after;

public class Client {

    public static void main(String[] args) throws InterruptedException {
        GameService gameService = new GameServiceProxy();
        gameService.startGame();
    }
}
