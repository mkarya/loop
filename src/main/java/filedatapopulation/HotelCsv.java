package filedatapopulation;

import com.opencsv.bean.CsvBindByName;

public class HotelCsv {


	    @CsvBindByName (column = "city", required = true)
	    private String cityname;

	    @CsvBindByName(column = "hotelname", required = true)
	    private String hotelname;

	    @CsvBindByName(column = "starrating", required = true)
	    private String starrating;

	    @CsvBindByName (column = "address", required = true)
	    private String address;
	    
	    @CsvBindByName (column = "roomtypetag", required = true)
	    private String roomtags;

	    @CsvBindByName (column = "country", required = false)
	    private String country;
	    
	    

		public String getCityname() {
			return cityname;
		}

		public void setCityname(String cityname) {
			this.cityname = cityname;
		}

		public String getHotelname() {
			return hotelname;
		}

		public void setHotelname(String hotelname) {
			this.hotelname = hotelname;
		}

		public String getStarrating() {
			return starrating;
		}

		public void setStarrating(String starrating) {
			this.starrating = starrating;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public String getRoomtags() {
			return roomtags;
		}

		public void setRoomtags(String roomtags) {
			this.roomtags = roomtags;
		}

		public String getCountry() {
			return country;
		}

		public void setCountry(String country) {
			this.country = country;
		}	    

		// Getters and Setters (Omitted for brevity)
	    
	    
}
