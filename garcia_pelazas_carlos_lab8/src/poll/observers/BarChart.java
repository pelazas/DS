package poll.observers;

import poll.Poll;
import poll.PollObserver;

public class BarChart implements PollObserver {

	@Override
	public void update(Poll poll) {
		System.out.println("Drawing a bar chart...");

	}

}
