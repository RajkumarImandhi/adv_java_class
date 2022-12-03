package Assignment;
import java.io.*;
import java.util.*;

class Data {
	public int n; // dimension of maze
	public boolean[][] north; // is there a wall to north of cell i, j
	public boolean[][] east;
	public boolean[][] south;
	public boolean[][] west;

	public Data(String filename) {
		readMaze(filename);
	}

	public void readMaze(String filename) {
		try {
			File file = new File(filename);
			BufferedReader buf = new BufferedReader(new FileReader(file));
			String text = buf.readLine();
			n = Integer.parseInt(text);
			north = new boolean[n + 2][n + 2];
			east = new boolean[n + 2][n + 2];
			south = new boolean[n + 2][n + 2];
			west = new boolean[n + 2][n + 2];
			while ((text = buf.readLine()) != null) {
				String[] tokens = text.split(" ");
				int x = Integer.parseInt(tokens[0]);
				int y = Integer.parseInt(tokens[1]);
				north[x][y] = (tokens[2].equals("1") ? true : false);
				east[x][y] = (tokens[3].equals("1") ? true : false);
				south[x][y] = (tokens[4].equals("1") ? true : false);
				west[x][y] = (tokens[5].equals("1") ? true : false);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

class Pair {
	int x, y;

	Pair(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

public class Maze {
	private int n; // dimension of maze
	private boolean[][] visited;
	private boolean done = false;
	private Data data;

	public Maze(Data data) {
		this.data = data;
		this.n = data.n;
		StdDraw.setXscale(0, n + 2);
		StdDraw.setYscale(0, n + 2);
	}

	public void drawDot(int x, int y, String color) {
		float size = (float) 0.25;
		if (color.equals("RED")) {
			StdDraw.setPenColor(StdDraw.RED);
			size = (float) 0.375;
		} else if (color.equals("BLUE"))
			StdDraw.setPenColor(StdDraw.BLUE);
		else if (color.equals("GRAY"))
			StdDraw.setPenColor(StdDraw.GRAY);
		else
			StdDraw.setPenColor(StdDraw.BLACK);
		StdDraw.filledCircle(x + 0.5, y + 0.5, size);
		StdDraw.show();
		StdDraw.pause(200);
//try{System.in.read();}
//catch(Exception e){}
	}

// draw the maze
	public void draw() {
		StdDraw.setPenColor(StdDraw.BLACK);
		for (int x = 1; x <= n; x++) {
			for (int y = 1; y <= n; y++) {
				if (data.south[x][y])
					StdDraw.line(x, y, x + 1, y);
				if (data.north[x][y])
					StdDraw.line(x, y + 1, x + 1, y + 1);
				if (data.west[x][y])
					StdDraw.line(x, y, x, y + 1);
				if (data.east[x][y])
					StdDraw.line(x + 1, y, x + 1, y + 1);
			}
		}
		StdDraw.show();
		drawDot(n, 1, "RED");
		drawDot(1, n, "RED");
	}

	public void solve() {
		Stack<Pair> a = new Stack<Pair>();
		a.push(new Pair(1, n));
		int x = 1, y = n;
		visited = new boolean[n + 2][n + 2];
		while (x != n || y != 1) {
			Pair p = a.peek();
			x = p.x;
			y = p.y;
			if (visited[x][y] == true) {
				drawDot(x, y, "GRAY");
				a.pop();
				continue;
			}
			visited[x][y] = true;
			drawDot(x, y, "BLUE");
			if (!this.data.south[x][y] && !visited[x][y - 1]) {
				a.push(new Pair(x, y - 1));
			}
			if (!this.data.north[x][y] && !visited[x][y + 1]) {
				a.push(new Pair(x, y + 1));
			}
			if (!this.data.east[x][y] && !visited[x + 1][y]) {
				a.push(new Pair(x + 1, y));
			}
			if (!this.data.west[x][y] && !visited[x - 1][y]) {
				a.push(new Pair(x - 1, y));
			}
		}
	}

	static public void main(String args[]) {
		if (args.length > 0) {
			Data data = new Data(args[0]);
			Maze maze = new Maze(data);
			maze.draw();
			maze.solve();
		} else
			System.out.println("Cannot read data file ...");
	}
}