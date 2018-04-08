package respository;

import javax.transaction.Transactional;

import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

import pojo.Hotel;

@Component("hotelService")
@Transactional
public class HotelServiceImpl implements HotelService{

		private final HotelRepo hotelRepository;


		public HotelServiceImpl(HotelRepo hotelRepository) {
			this.hotelRepository = hotelRepository;
		}

		@Override
		public Hotel getHotel(Hotel city, String name) {
			Assert.notNull(city, "City must not be null");
			Assert.hasLength(name, "Name must not be empty");
			return this.hotelRepository.findByName(city, name);
		}

}
