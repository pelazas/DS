package main;

import java.awt.Point;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

import editor.core.Editor;
import editor.tool.CircleCreationTool;
import editor.tool.RectangleCreationTool;
import editor.tool.SelectionTool;
import editor.tool.TriangleCreationTool;

public class UserInterface {
	
	private Editor editor;

	public UserInterface(Editor editor) {
		this.editor = editor;
	}

	public void run() throws IOException {

		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		PrintStream output = System.out;

		showHelp(output);
		do {
			output.print("> ");
			output.flush();

			String[] tokens = input.readLine().split(" ", 2);
			String action = tokens[0];

			if (action.equals("exit")) {
				output.println("Bye!");
				return;
			}

			if (action.equals("click") || action.equals("move")) {
				Point point = parseCoordinates(tokens[1]);
				
				if (action.equals("click")) {
					editor.mousePressed(point.x, point.y);
				} else if (action.equals("move")) {
					editor.mouseMoved(point.x, point.y);
				} 
				continue;
			}
			
			if(action.equals("release")) {
				editor.mouseReleased();
				continue;
			}

			// Checks that the rest of the actions do not have arguments
			if (tokens.length > 1) {
				output.printf("Syntax error: %s has no arguments\n", action);
				continue;
			}

			if (action.equals("selection")) {
				editor.setTool(new SelectionTool(editor));
			} else if (action.equals("rectangle")) {
				editor.setTool(new RectangleCreationTool(editor));
			} else if (action.equals("circle")) {
				editor.setTool(new CircleCreationTool(editor));
			} else if (action.equals("triangle")) {
				editor.setTool(new TriangleCreationTool(editor));
			} else if (action.equals("draw")) {
				editor.draw();
			} else if (action.equals("help")) {
				showHelp(output);
			} 
			else {
				output.println("Unknown action");
				showHelp(output);
			}
		} while (true);
	}
	

		private static void showHelp(PrintStream output) {
			output.println("");
			output.println("Tools: selection - rectangle - circle - triangle");
			output.println("Mouse actions: click <x>,<y> - move <x>,<y> - release");
			output.println("Other options: draw - help - exit");
			output.println("-------------------------------------------------------------");
		}

		private static Point parseCoordinates(String coordinates) {
			String[] arguments = coordinates.split("\\s*,\\s*");
			int x = Integer.parseInt(arguments[0]);
			int y = Integer.parseInt(arguments[1]);
			return new Point(x, y);
		}

}
