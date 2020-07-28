public class CaveMapDriver {
	public static void main(String[] args) {
		Room room1 = new Room(false,1);
		CaveMap cave = new CaveMap(room1);
		Room room2 = new Room(false,2);
		Room room3 = new Room(false,3);
		Room room4 = new Room(false,4);
		room1.addConnection(room2);
		room1.addConnection(room3);
		room1.addConnection(room4);
		Room room5 = new Room(false,5);
		Room room6 = new Room(false,6);
		Room room7 = new Room(false,7);
		Room room8 = new Room(false,8);
		Room room9 = new Room(false,9);
		Room room10 = new Room(false,10);
		Room room11 = new Room(false,11);
		Room room12 = new Room(true,12);
		room2.addConnection(room5);
		room2.addConnection(room6);
		room4.addConnection(room7);
		room4.addConnection(room8);
		room5.addConnection(room9);
		room5.addConnection(room10);
		room7.addConnection(room10);
		room7.addConnection(room11);
		room7.addConnection(room12);
		System.out.println(cave.dfsSearch());
	} //end main
} //end class