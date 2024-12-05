package fylesystem.outputs.filter;

import java.io.IOException;

import fylesystem.Output;

public class NumberOfCharactersFilter implements Output {
	
	private Output output;
	private int numberOfCharacters = 0;

	public NumberOfCharactersFilter(Output output) {
		this.output = output;
	}

	@Override
	public void write(char c) throws IOException {
		output.write(c);
		numberOfCharacters++;
	}

	@Override
	public void open() throws IOException {
		output.open();
		
	}

	@Override
	public void close() throws IOException {
		output.close();
		
	}
	
	public int getNumberOfCharacters() {
		return numberOfCharacters;
	}

}
