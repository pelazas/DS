package poll.observers;

import poll.Poll;
import poll.PollObserver;

public class StartingFromObserver implements PollObserver {
	
	private int counter = 0;
	private int limit;
	private PollObserver next;
	
	public StartingFromObserver(PollObserver next,int limit) {
		this.limit = limit;
		this.next = next;
	}

	@Override
	public void update(Poll poll) {
		counter++;
		if(counter >= limit) {
			next.update(poll);
		}

	}

}
