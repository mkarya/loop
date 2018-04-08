package pojo;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="HOTEL")
public class Hotel {
	
	@Id
	@GeneratedValue
	@Column(name="HOTEL_ID")
	int id;
	
	@Column(name = "HOTEL_NAME", nullable = false)
	private String hotelName;
	
	@Column(name = "STAR_RATING", nullable = true)
	private int starRatingId;
	
	@Column(name = "HOTEL_ADDRESS", nullable = false)
	private String hotelAddress;
	
	@Column(name = "City", nullable = false)
	private City city;
	
	@Column(name = "HOTEL_CHAIN_INFO", nullable = true)
	@ManyToOne (fetch = FetchType.LAZY)
	@JoinColumn(name="HOTEL_CHAIN_ID", nullable = true)
	private HotelChain hotelchain;
	
	@Column(name = "COUNTRY",nullable = false)
	private Country country;
	
	@Column(name = "HOTEL_URL", nullable = false)
	private String hotel_url;
	
	@Column(name = "HOTEL_PICTURES", nullable = false)
	@OneToMany(mappedBy = "HOTEL", cascade = CascadeType.ALL)
	private List<HotelPictures> pictures;
	
	@Column (name = "HOTEL_ROOM_PICTURES", nullable = true)
	@OneToMany (mappedBy = "HOTEL", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<HotelRoomPicture> roompicture;

	public int getHotelId() {
		return id;
	}

	public void setHotelId(int hotelId) {
		this.id = hotelId;
	}

	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public int getStarRatingId() {
		return starRatingId;
	}

	public void setStarRatingId(int starRatingId) {
		this.starRatingId = starRatingId;
	}

	public String getHotelAddress() {
		return hotelAddress;
	}

	public void setHotelAddress(String hotelAddress) {
		this.hotelAddress = hotelAddress;
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	public HotelChain getHotelchain() {
		return hotelchain;
	}

	public void setHotelchain(HotelChain hotelchain) {
		this.hotelchain = hotelchain;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	public List<HotelPictures> getPictures() {
		return pictures;
	}

	public void setPictures(List<HotelPictures> pictures) {
		this.pictures = pictures;
	}
	
	


	
	

}
