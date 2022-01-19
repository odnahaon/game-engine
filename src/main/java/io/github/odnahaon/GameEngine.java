package io.github.odnahaon;

public class GameEngine {

    public static void main(String[] args) {
        try {
            boolean vSync = true;
            IGameLogic gameLogic = new DummyGame();
            Engine gameEng = new Engine("Game Engine", 600, 480, vSync, gameLogic);
            gameEng.run();
            System.out.println("Running");
        } catch (Exception excp) {
            excp.printStackTrace();
            System.exit(-1);
        }
    }
}
