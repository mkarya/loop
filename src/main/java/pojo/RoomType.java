package pojo;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

public class RoomType {
	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getRoomType() {
		return roomType;
	}

	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}

	public int getHotelId() {
		return hotelId;
	}

	public void setHotelId(int hotelId) {
		this.hotelId = hotelId;
	}

	public List<String> getRoomPictures() {
		return roomPictures;
	}

	public void setRoomPictures(List<String> roomPictures) {
		this.roomPictures = roomPictures;
	}

	@Id
	@GeneratedValue
	int Id;
	
	@Column(nullable = true)
	String roomType;
	
	@OneToOne
	int hotelId;
	
	@OneToMany
	@Column (nullable = true)
	List<String> roomPictures;
}
