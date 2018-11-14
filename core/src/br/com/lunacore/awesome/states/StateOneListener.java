package br.com.lunacore.awesome.states;

import com.badlogic.gdx.physics.box2d.Contact;
import com.badlogic.gdx.physics.box2d.ContactImpulse;
import com.badlogic.gdx.physics.box2d.Manifold;

import br.com.lunacore.awesome.objects.EmptyContact;
import br.com.lunacore.awesome.objects.PlatformPlayer;

public class StateOneListener extends EmptyContact {

	
	public StateOneListener(State state) {
		super(state);
	}

	public void beginContact(Contact contact) {
		PlatformPlayer.beginContact(contact, this);
	}

	public void endContact(Contact contact) {
		PlatformPlayer.endContact(contact, this);
	}

	public void preSolve(Contact contact, Manifold oldManifold) {

	}

	public void postSolve(Contact contact, ContactImpulse impulse) {
		
	}

}
