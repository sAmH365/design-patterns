package gof.designpatterns.struct._12_proxy.after;

import gof.designpatterns.struct._12_proxy.before.GameService;

public class GameServiceProxyWithExtend extends GameService {


    @Override
    public void startGame() throws InterruptedException {
        long before = System.currentTimeMillis();
        super.startGame();
        System.out.println(System.currentTimeMillis() - before);
    }
}
