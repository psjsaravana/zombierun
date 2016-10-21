package com.psjsaravana.zombierun.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Camera;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.psjsaravana.zombierun.MyGdxGame;
import com.psjsaravana.zombierun.actors.buttons.AboutButton;
import com.psjsaravana.zombierun.actors.buttons.GPlayButton;
import com.psjsaravana.zombierun.actors.buttons.PlayButton;
import com.psjsaravana.zombierun.actors.buttons.RatingButton;

/**
 * Created by subramas on 9/29/16.
 */
public class MainScreen implements Screen {
    PlayButton playButton;
    RatingButton ratingButton;
    GPlayButton gPlayButton;
    AboutButton aboutButton;
    private Stage stage;
    private BitmapFont font;
    SpriteBatch batch;
    Texture building,backgroundImage,ground,walkSheet;
    TextureRegion[] walkFrames;
    TextureRegion currentFrame;
    Animation walkAnimation;
    float stateTime;
    MyGdxGame myGame;
    OrthographicCamera camera;
    int srcXBuilding,srcXGround;

    public MainScreen(MyGdxGame myGdxGame) {
        myGame = myGdxGame;
        stage = new Stage();
        stage.clear();
        Gdx.input.setInputProcessor(stage);
        batch = new SpriteBatch();
        playButton = new PlayButton(stage);
        ratingButton = new RatingButton(stage);
        gPlayButton = new GPlayButton(stage);
        aboutButton = new AboutButton(stage);
        Gdx.app.log("viewport width/5",""+(stage.getCamera().viewportWidth/5));
        Gdx.app.log("viewport width/4",""+(((stage.getCamera().viewportWidth/5)*4)-(ratingButton.ratingBtn.getWidth()/2)));
        Gdx.app.log("viewport width/3",""+(((stage.getCamera().viewportWidth/5)*3)-(ratingButton.ratingBtn.getWidth()/2)));
        Gdx.app.log("viewport width/2",""+(((stage.getCamera().viewportWidth/5)*2)-(ratingButton.ratingBtn.getWidth()/2)));
        Gdx.app.log("viewport width/1",""+(((stage.getCamera().viewportWidth/5)*1)-(ratingButton.ratingBtn.getWidth()/2)));
        Gdx.app.log("viewport width",""+stage.getCamera().viewportWidth);
        Gdx.app.log("btn width",""+ratingButton.ratingBtn.getWidth());
        stage.addActor(playButton.playBtn);
        stage.addActor(ratingButton.ratingBtn);
        stage.addActor(gPlayButton.gplayBtn);
        stage.addActor(aboutButton.aboutBtn);
        //TextureRegion[][] tmp = TextureRegion.split(walkSheet, walkSheet.getWidth()/8, walkSheet.getHeight()/1);
        //walkFrames = new TextureRegion[8 * 1];
        //int index = 0;
        //for (int i = 0; i < 1; i++) {
        //    for (int j = 0; j < 8; j++) {
        //        walkFrames[index++] = tmp[i][j];
        //    }
        //}
        //walkAnimation = new Animation(0.25f, walkFrames);
        //stateTime = 0f;

        //batch = new SpriteBatch();
        //srcXBuilding = 0;
        //srcXGround = 0;
        //building = new Texture("buildings.png");
        //ground = new Texture("ground.png");
        //backgroundImage = new Texture("background.png");
        //backgroundImage.setWrap(Texture.TextureWrap.Repeat, Texture.TextureWrap.Repeat);
        //ground.setWrap(Texture.TextureWrap.Repeat, Texture.TextureWrap.Repeat);
        //building.setWrap(Texture.TextureWrap.Repeat, Texture.TextureWrap.Repeat);

    }
    @Override
    public void show() {
        //stage.addActor(playButton);
    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(0, 0.1f, 0.2f, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        //stateTime += Gdx.graphics.getDeltaTime();
        //currentFrame = walkAnimation.getKeyFrame(stateTime, true);
        batch.begin();
        //srcXBuilding+=1;
        //srcXGround +=2;
        //if(srcXBuilding >= (int) Gdx.graphics.getWidth()) {
            //srcx = 0;
        //}
        stage.draw();
        batch.end();
    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {
        batch.dispose();
    }
}
