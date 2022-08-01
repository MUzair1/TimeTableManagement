package edu.uog.campus;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class roomData {

	private String csvFile="F:\\ROOM.csv";

	public String getCsvFile() {
		return csvFile;
	}

	public void setCsvFile(String csvFile) {
		this.csvFile = csvFile;
	}
	
	@SuppressWarnings("resource")
	public List<Room> findAll(){
		List<Room> rooms = new ArrayList<Room>();
		String line;
		try {
			BufferedReader bufferreader =new BufferedReader(new FileReader(this.csvFile));
			while((line=bufferreader.readLine()) !=null) {
				
				Room room =new Room();
				
				String[] roomRow =line.split(",");
				
				
				room.setROOM_ID(Integer.parseInt(roomRow[0]));
				room.setROOM_NAME(roomRow[1]);
				room.setROOM_FLOUR(Integer.parseInt(roomRow[2]));
				room.setROOM_CAPACITY(Integer.parseInt(roomRow[3]));
				room.setROOM_TYPE(roomRow[4]);
				
				rooms.add(room);
				
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return rooms;
	}




public Room findOne(int room_ID){
	
	String line;
	try {
		BufferedReader bufferreader =new BufferedReader(new FileReader(this.csvFile));
		while((line=bufferreader.readLine()) !=null) {
			
			Room room =new Room();
			
			String[] roomRow =line.split(",");
			
			if(Integer.parseInt(roomRow[0]) == room_ID){
			room.setROOM_ID(Integer.parseInt(roomRow[0]));
			room.setROOM_NAME(roomRow[1]);
			room.setROOM_FLOUR(Integer.parseInt(roomRow[2]));
			room.setROOM_CAPACITY(Integer.parseInt(roomRow[3]));
			room.setROOM_TYPE(roomRow[4]);
			 return room;
			}
			
			
		}
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	
	return null;
}
}
