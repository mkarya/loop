package pojo;

import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table (name = "HOTEL_CHAIN")
public class HotelChain {
	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public HotelChain(int id, String name) {
		super();
		Id = id;
		this.name = name;
	}

	public List<Hotel> getHotelInfo() {
		return hotelInfo;
	}

	public void setHotelInfo(List<Hotel> hotelInfo) {
		this.hotelInfo = hotelInfo;
	}



	@Id
	@GeneratedValue
	@Column(name = "HOTEL_CHAIN_ID")
	int Id;
	
	@Column(name = "HOTEL_CHAIN", nullable = false)
	private String name;
	
	@Column(name = "HOTEL_CHAIN_URL", nullable = true)
	private String url;

	@OneToMany(mappedBy = "HOTEL_CHAIN", cascade = CascadeType.ALL)
	private List<Hotel> hotelInfo;
}
