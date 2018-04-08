package pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table (name = "HOTEL_PICTURES")
public class HotelPictures {

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getPictureUrl() {
		return pictureUrl;
	}

	public void setPictureUrl(String pictureUrl) {
		this.pictureUrl = pictureUrl;
	}
	
	public Hotel getHotel() {
		return hotel;
	}

	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}




	@Id
	@GeneratedValue
	@Column(name = "HOTEL_PICTURE_ID")
	int Id;
	
	@Column(nullable = true)
	String pictureUrl;
	
	@ManyToOne
	@JoinColumn(name="HOTEL_ID", nullable = false)
	Hotel hotel;
	
}
