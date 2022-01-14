package io.github.odnahaon;

import java.awt.*;

public class Engine implements Runnable {
    private final Thread gameLoopThread;

    public Engine(String windowTitle, int width, int height, boolean vsSync, IGameLogic gameLogic) throws Exception {
        gameLoopThread = new Thread(this, "GAME_LOOP_THREAD");
        window = new Window(windowTitle, width, height, vsSync);
        this.gameLogic = gameLogic;
    }

    @Override
    public void run() {

    }
}
