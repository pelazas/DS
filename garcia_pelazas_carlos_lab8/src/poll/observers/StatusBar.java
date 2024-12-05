package poll.observers;

import poll.Poll;
import poll.PollObserver;

public class StatusBar implements PollObserver{

	@Override
	public void update(Poll poll) {
		int nYes = poll.yeses();
		int nNos = poll.nos();
		
		System.out.println("Number of YES votes = "+ nYes + ". Number of NO votes = " + nNos);
		
	}

}
