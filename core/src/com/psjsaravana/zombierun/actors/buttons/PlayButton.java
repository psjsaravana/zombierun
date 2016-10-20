package com.psjsaravana.zombierun.actors.buttons;

import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;

/**
 * Created by subramas on 10/20/16.
 */
public class PlayButton extends Actor {
    private TextureAtlas buttonsAtlas;
    private Skin buttonSkin;
    private TextButton playBtn;
    private BitmapFont font;

    public PlayButton() {
        setBounds(100,100,100,100);
        buttonsAtlas = new TextureAtlas("buttons.pack");
        buttonSkin = new Skin();
        buttonSkin.addRegions(buttonsAtlas);
        font = new BitmapFont();

        TextButton.TextButtonStyle style = new TextButton.TextButtonStyle();
        style.up = buttonSkin.getDrawable("playNormal");
        style.down = buttonSkin.getDrawable("playHover");
        style.font = font;

        playBtn = new TextButton("", style);
        playBtn.setPosition(100,100);
        playBtn.setWidth(100);
        playBtn.setHeight(100);
    }

    @Override
    public void draw(Batch batch, float parentAlpha) {
        super.draw(batch, parentAlpha);
    }
}
