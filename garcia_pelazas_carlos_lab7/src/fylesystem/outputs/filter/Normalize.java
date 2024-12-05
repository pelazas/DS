package fylesystem.outputs.filter;

import java.io.IOException;

import fylesystem.Output;

public class Normalize extends AbstractFilter {

	public Normalize(Output output) {
		super(output);
	}

	@Override
	public void write(char c) throws IOException {
		if(c != '\r')
			next.write(c);

	}

}
