package com.bvly.cuph;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.bvly.screens.GameScreen;

public class cuph extends Game {

       @Override
        public void create() {
           Gdx.app.log("cuph", "created");
           setScreen(new GameScreen());
       }
}