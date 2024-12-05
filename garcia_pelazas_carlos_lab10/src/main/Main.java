package main;

import game.adapter.BallGameAdapter;
import game.adapter.adapters.*;
import game.template.*;

public class Main {
	
	public static void main(String[] args) {
		
		// ADAPTER
		System.out.println("ADAPTER");
		BallGameAdapter game = new BallGameAdapter(new PlaystationAdapter());
		game.play();
		game = new BallGameAdapter(new AndroidAdapter());
		game.play();
		game = new BallGameAdapter(new WindowsAdapter());
		game.play();
		
		// TEMPLATE
		System.out.println("TEMPLATE");
		PlaystationTemplate gamePs5 = new PlaystationTemplate();
		gamePs5.play();
		AndroidTemplate gameAndroid = new AndroidTemplate();
		gameAndroid.play();
		WindowsTemplate gameWindows = new WindowsTemplate();
		gameWindows.play();
	}
}
