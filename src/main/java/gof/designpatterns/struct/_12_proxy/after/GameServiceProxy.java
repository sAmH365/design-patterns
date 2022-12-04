package gof.designpatterns.struct._12_proxy.after;

public class GameServiceProxy implements GameService{

    private GameService gameService;

    @Override
    public void startGame() throws InterruptedException {
        long before = System.currentTimeMillis();
        if (this.gameService == null) {
            this.gameService = new DefaultGameService();
        }

        gameService.startGame();
        System.out.println(System.currentTimeMillis() - before);
    }
}
