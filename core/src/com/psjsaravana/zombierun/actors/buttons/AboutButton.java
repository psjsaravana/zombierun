package com.psjsaravana.zombierun.actors.buttons;

import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;

/**
 * Created by subramas on 10/21/16.
 */
public class AboutButton {
    private TextureAtlas buttonsAtlas;
    private Skin buttonSkin;
    public TextButton aboutBtn;
    private BitmapFont font;

    public  AboutButton() {
        buttonsAtlas = new TextureAtlas("buttons.pack");
        buttonSkin = new Skin();
        buttonSkin.addRegions(buttonsAtlas);
        font = new BitmapFont();

        TextButton.TextButtonStyle style = new TextButton.TextButtonStyle();
        style.up = buttonSkin.getDrawable("playNormal");
        style.down = buttonSkin.getDrawable("playHover");
        style.font = font;

        aboutBtn = new TextButton("", style);
        aboutBtn.setPosition(700,100);
        aboutBtn.setWidth(100);
        aboutBtn.setHeight(100);
    }

}
