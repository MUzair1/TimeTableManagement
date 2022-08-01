package edu.uog;



import java.util.List;

import edu.uog.campus.Room;
import edu.uog.campus.roomData;

public class TimeTableManagement {
	public static void main(String args[]) {
		roomData roomdata=new roomData();
		
	   // Room room= roomdata.findOne(7);
		List<Room> rooms = roomdata.findAll();
		for(int i=0; i<rooms.size();i++) {
			
		System.out.println(rooms.get(i).toString());
		}
	}

}
