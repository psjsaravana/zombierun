package com.psjsaravana.zombierun.utils;

import com.badlogic.gdx.Game;
import com.psjsaravana.zombierun.MyGdxGame;

/**
 * Created by subramas on 10/21/16.
 */
public class AppManager {
    private static MyGdxGame gameInstance;

    public static Game getGameInstance() {
        return gameInstance;
    }

    public void setGameInstance(MyGdxGame gameInstance) {
        this.gameInstance = gameInstance;
    }
}
