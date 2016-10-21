package com.psjsaravana.zombierun.actors.buttons;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.InputListener;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.psjsaravana.zombierun.screens.GameScreen;
import com.psjsaravana.zombierun.utils.AppManager;

/**
 * Created by subramas on 10/20/16.
 */
public class PlayButton extends Actor {
    private TextureAtlas buttonsAtlas;
    private Skin buttonSkin;
    public TextButton playBtn;
    private BitmapFont font;
    private Stage gameStage;

    public  PlayButton(Stage stage) {
        gameStage = stage;
        initPlayBtn();
    }

    private void initPlayBtn() {
        buttonsAtlas = new TextureAtlas("buttons.pack");
        buttonSkin = new Skin();
        buttonSkin.addRegions(buttonsAtlas);
        font = new BitmapFont();
        TextButton.TextButtonStyle style = new TextButton.TextButtonStyle();
        style.up = buttonSkin.getDrawable("playNormal");
        style.down = buttonSkin.getDrawable("playHover");
        style.font = font;

        playBtn = new TextButton("", style);
        playBtn.setWidth(100);
        playBtn.setHeight(100);
        playBtn.setPosition((gameStage.getCamera().viewportWidth/5)-(playBtn.getWidth()/2),gameStage.getCamera().viewportHeight/5);
        playBtn.addListener(new InputListener(){
            @Override
            public void touchUp(InputEvent event, float x, float y, int pointer, int button) {
                super.touchUp(event, x, y, pointer, button);
                Gdx.app.log("playbtn tap","play button tapped");
                AppManager.getGameInstance().setScreen(new GameScreen());
            }

            @Override
            public boolean touchDown(InputEvent event, float x, float y, int pointer, int button) {
                return true;
            }
        });
    }

}
