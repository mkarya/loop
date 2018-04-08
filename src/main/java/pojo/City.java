package pojo;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class City {
	@Id
	@GeneratedValue
	@Column(name = "CITY_ID")
	int id;
	
	@Column(nullable = false)
	private String name;

	@OneToMany (mappedBy = "City", fetch = FetchType.LAZY)
	private List<Hotel> hotelId;

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

	public List<Hotel> getHotelId() {
		return hotelId;
	}

	public void setHotelId(List<Hotel> hotelId) {
		this.hotelId = hotelId;
	}

	public City(String name) {
		super();
		this.name = name;
	}
	
	

}
