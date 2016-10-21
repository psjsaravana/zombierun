package com.psjsaravana.zombierun;

import com.badlogic.gdx.Game;
import com.psjsaravana.zombierun.screens.MainScreen;
import com.psjsaravana.zombierun.utils.AppManager;

public class MyGdxGame extends Game {

	@Override
	public void create() {
		new AppManager().setGameInstance(this);
		setScreen(new MainScreen(this));
	}

}
