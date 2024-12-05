package main;
import java.io.*;

import poll.*;
import poll.observers.*;

public class Main {
	public static void main(String[] args) throws IOException {
		Poll poll = new Poll("Are you in favor of nuclear energy?");
		
		poll.addObserver(new FrequencyObserver(new BarChart(),3));
		poll.addObserver(new StartingFromObserver(new PieChart(), 3) );
		poll.addObserver(new ResultSaver());
		poll.addObserver( new StartingFromObserver( new FrequencyObserver(new StatusBar(), 2) ,4) );

		TextUserInterface ui = new TextUserInterface();
		ui.fill(poll);
	}
}