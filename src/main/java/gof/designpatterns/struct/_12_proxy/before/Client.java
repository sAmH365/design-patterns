package gof.designpatterns.struct._12_proxy.before;

public class Client {

    public static void main(String[] args) throws InterruptedException {
        GameService gameService = new GameService();
//        GameService gameService = new GameServiceProxy();
        gameService.startGame();
    }
}
