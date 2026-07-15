package Creational;

public class TreatmentRoom {

	private String roomType;
	private boolean available;
	public TreatmentRoom(String roomType) {
		this.roomType = roomType;
		this.available = true;
	}
	/**
	 * @return the roomType
	 */
	public String getRoomType() {
		return roomType;
	}
	/**
	 * @param roomType the roomType to set
	 */
	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}
	/**
	 * @return the available
	 */
	public boolean isAvailable() {
		return available;
	}
	/**
	 * @param available the available to set
	 */
	public void setAvailable(boolean available) {
		this.available = available;
	}
	
	public void prepareRoom() {
		System.out.println(roomType + "is being prepared");
	}
	
}
