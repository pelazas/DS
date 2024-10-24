package instruction;

import java.util.Scanner;

import virtualmachine.State;

public class Input extends AbstractInstruction{
	
	private Scanner console = new Scanner(System.in);

	public Input() {
	}

	@Override
	protected void doExecute(State state) {
		System.out.println("Escriba un número entero: ");
		
		state.getStack()[state.getSp()] = console.nextInt();
		state.setSp(state.getSp()+1);
	}
	
	

}
