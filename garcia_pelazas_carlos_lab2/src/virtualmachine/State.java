package virtualmachine;

public class State {
	private int ip = 0;

	private int[] memory = new int[1024];

	private int[] stack = new int[32];
	private int sp = 0;
	
	public State() {

	}

	public int getIp() {
		return ip;
	}

	public void setIp(int ip) {
		this.ip = ip;
	}

	public int[] getMemory() {
		return memory;
	}

	public void setMemory(int[] memory) {
		this.memory = memory;
	}

	public int[] getStack() {
		return stack;
	}

	public void setStack(int[] stack) {
		this.stack = stack;
	}

	public int getSp() {
		return sp;
	}

	public void setSp(int sp) {
		this.sp = sp;
	}
	
	
	
	
	
	
}
