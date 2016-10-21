package com.psjsaravana.zombierun.actors.buttons;

import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;

/**
 * Created by subramas on 10/21/16.
 */
public class GPlayButton {
    private TextureAtlas buttonsAtlas;
    private Skin buttonSkin;
    public TextButton gplayBtn;
    private BitmapFont font;

    public  GPlayButton(Stage stage) {
        buttonsAtlas = new TextureAtlas("buttons.pack");
        buttonSkin = new Skin();
        buttonSkin.addRegions(buttonsAtlas);
        font = new BitmapFont();

        TextButton.TextButtonStyle style = new TextButton.TextButtonStyle();
        style.up = buttonSkin.getDrawable("gPlayNormal");
        style.down = buttonSkin.getDrawable("gPlayHover");
        style.font = font;

        gplayBtn = new TextButton("", style);
        gplayBtn.setPosition(((stage.getCamera().viewportWidth/5)*3)-(gplayBtn.getWidth()/2),stage.getCamera().viewportHeight/5);
        gplayBtn.setWidth(100);
        gplayBtn.setHeight(100);
    }

}
