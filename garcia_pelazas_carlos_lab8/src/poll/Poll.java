package poll;

import java.util.ArrayList;
import java.util.List;

public class Poll 
{
	private int yeses;
	private int nos;
	private String question;
	private List<PollObserver> observers = new ArrayList<>();
	
	public Poll(String question) {
		this.question = question;
	}

	public String getQuestion() {
		return question;
	}

	public int yeses() {
		return yeses;
	}

	public int nos() {
		return nos;
	}

	public void incrementYeses() {
		yeses++;
		notifyObservers();
	}

	public void incrementNos() {
		nos++;
		notifyObservers();
	}
	
	public void addObserver(PollObserver observer) {
		observers.add(observer);
	}
	
	private void notifyObservers() {
		for(PollObserver o: observers) {
			o.update(this);
		}
	}

}
