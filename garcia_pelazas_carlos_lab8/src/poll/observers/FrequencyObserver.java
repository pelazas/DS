package poll.observers;

import poll.Poll;
import poll.PollObserver;

public class FrequencyObserver implements PollObserver {
	
	private int frequency;
	private PollObserver next;
	private int counter = 0;
	
	public FrequencyObserver(PollObserver next,int frequency) {
		this.frequency = frequency;
		this.next = next;
	}

	@Override
	public void update(Poll poll) {
		counter++;
		if(counter % frequency == 0) {
			next.update(poll);
		}

	}

}
