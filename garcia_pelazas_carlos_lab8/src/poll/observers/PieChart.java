package poll.observers;

import poll.Poll;
import poll.PollObserver;

public class PieChart implements PollObserver{

	@Override
	public void update(Poll poll) {
		System.out.println("Drawing a pie chart...");
		
	}

}
