package com.psjsaravana.zombierun.actors.buttons;

import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;

/**
 * Created by subramas on 10/21/16.
 */
public class RatingButton {

    private TextureAtlas buttonsAtlas;
    private Skin buttonSkin;
    public TextButton ratingBtn;
    private BitmapFont font;

    public  RatingButton() {
        buttonsAtlas = new TextureAtlas("buttons.pack");
        buttonSkin = new Skin();
        buttonSkin.addRegions(buttonsAtlas);
        font = new BitmapFont();

        TextButton.TextButtonStyle style = new TextButton.TextButtonStyle();
        style.up = buttonSkin.getDrawable("ratingNormal");
        style.down = buttonSkin.getDrawable("ratingHover");
        style.font = font;

        ratingBtn = new TextButton("", style);
        ratingBtn.setPosition(300,100);
        ratingBtn.setWidth(100);
        ratingBtn.setHeight(100);
    }

}
