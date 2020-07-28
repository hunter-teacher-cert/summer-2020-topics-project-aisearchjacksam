import java.util.ArrayList;

public class Room {
	private boolean hasTreasure;
	private ArrayList<Room> connections;
	private int roomNumber;

	public Room(boolean treasure, int roomNumber) {
		this.roomNumber = roomNumber;
		hasTreasure = treasure;
		connections = new ArrayList<Room>();
	}

	public boolean hasTreasure() {
		return hasTreasure;
	}

	public Room getConnection(int i) {
		return connections.get(i);
	}

	public int numChildren() {
		return connections.size();
	}

	public void addConnection(Room room) {
		if (!(connections.contains(room))) {
			connections.add(room);
			room.addConnection(this);
		}
	}

	public String toString() {
		return "Room" + roomNumber;
	}
}