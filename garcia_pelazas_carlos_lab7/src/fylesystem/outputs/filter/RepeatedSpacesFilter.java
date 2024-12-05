package fylesystem.outputs.filter;

import java.io.IOException;

import fylesystem.Output;

public class RepeatedSpacesFilter extends AbstractFilter {
	
	private char lastChar;

	public RepeatedSpacesFilter(Output output) {
		super(output);
	}

	@Override
	public void write(char c) throws IOException {
		if(lastChar == ' ' && c == ' ') {
			return;
		}
		next.write(c);
		
		this.lastChar = c;

	}

}
