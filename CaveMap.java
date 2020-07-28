import java.util.*;

public class CaveMap {
	private Room entrance;

	public CaveMap(Room entrance) {
		this.entrance = entrance;
	}

	/*
	 * // DFS search to find treasure from entrance, returns path of rooms taken.
	 * public ArrayList<Room> dfsSearch() { // start at entrance Room current =
	 * entrance; // tracks if treasure has been found, used later boolean found =
	 * false; // tracks rooms already visited ArrayList<Room> visited = new
	 * ArrayList<Room>(); // add current node to visited list visited.add(entrance);
	 * 
	 * // if treasure in room, return visited list if (current.hasTreasure()) {
	 * return visited; } // else we need to expand to children // recursively call
	 * dfsHelp on each function (this helper method accepts the // visited Array and
	 * the current Node as a parameter to continue the search) else { // checks each
	 * connection of current room for (int i = 0; i < current.numChildren(); i++) {
	 * // if the connected room hasn't been visited yet, explore that branch if
	 * (!(visited.contains(current.getConnection(i)))) { // if the method returns
	 * true, the treasure has been found found = dfsHelp(current.getConnection(i),
	 * visited); // if the treasure has been found, exit the loop and head on up if
	 * (found) break; } } } // as long as the treasure exists if (found) return
	 * visited; else return null; }
	 */

	public ArrayList<Room> dfsSearch() {
		ArrayList<Room> visited = new ArrayList<>();
		dfsSearch(entrance, visited);
		return visited;
	}

	public boolean dfsSearch(Room current, ArrayList<Room> visited) {
		// tracks if treasure has been found, used later
		boolean found = false;
		// adds current node to visited list
		visited.add(current);
		// if treasure present, return true
		if (current.hasTreasure()) {
			return true;
		}
		// else we need to expand to children
		// recursively call dfsSearch on each connection sending visited Array and the
		// next Node as a parameter to continue the search
		else {
			for (int i = 0; i < current.numChildren(); i++) {
				// if the connected room hasn't been visited yet, explore that branch
				if (!(visited.contains(current.getConnection(i)))) {
					// if the method returns true, the treasure has been found
					found = dfsSearch(current.getConnection(i), visited);
					// if the treasure has been found, exit the loop and head on up
					if (found)
						break;
				}
			}
		}
		return found;

	} // end dfsSearch

	// BFS Search to find treasure from entrance, returns SHORTEST path to treasure
	public static ArrayList<Room> bfsSearch() {
		return null;
	}

}