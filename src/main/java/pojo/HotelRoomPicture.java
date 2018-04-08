package pojo;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table (name = "HOTEL_ROOM_PICTURE")
public class HotelRoomPicture {
	@Id
	@GeneratedValue
	@Column(name = "CITY_ROOOM_PICTURE_ID")
	int id;
	
	@Column(nullable = false)
	private String name;

	@OneToOne 
	@JoinColumn (name = "HOTEL_ID")
	private Hotel hotel;

	@Column (name = "HOTEL_ROOM_TAG")
	private Hotel hotel_room_tag;
	
	
	public HotelRoomPicture(String name, Hotel hotel, Hotel hotel_room_tag) {
		super();
		this.name = name;
		this.hotel = hotel;
		this.hotel_room_tag = hotel_room_tag;
	}

	@Override
	public String toString() {
		return "HotelRoomPicture [id=" + id + ", name=" + name + ", hotel=" + hotel + ", hotel_room_tag="
				+ hotel_room_tag + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Hotel getHotel() {
		return hotel;
	}

	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}

	public Hotel getHotel_room_tag() {
		return hotel_room_tag;
	}

	public void setHotel_room_tag(Hotel hotel_room_tag) {
		this.hotel_room_tag = hotel_room_tag;
	}
	
	
}
