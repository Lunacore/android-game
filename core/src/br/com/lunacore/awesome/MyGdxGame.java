package br.com.lunacore.awesome;


import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import br.com.lunacore.awesome.helper.Helper;
import br.com.lunacore.awesome.states.StateManager;

public class MyGdxGame extends ApplicationAdapter {
	SpriteBatch batch;
	
	StateManager manager;

	@Override
	public void create () {
		batch = new SpriteBatch();
		manager = new StateManager();
		manager.create();

	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(17/255f, 26/255f, 36/255f, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		
		manager.update(Gdx.graphics.getDeltaTime());
		manager.render(batch);
		
		Helper.Game.globalTimer += Gdx.graphics.getDeltaTime();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		manager.dispose();
	}
}
