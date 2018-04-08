package respository;

import org.springframework.data.jpa.repository.JpaRepository;

import pojo.City;
import pojo.Hotel;

interface HotelRepo extends JpaRepository{
	
	Hotel findByName(Hotel city, String name);

/*	@Query("select h.city as city, h.name as name, avg(r.rating) as averageRating "
			+ "from Hotel h left outer join h.reviews r where h.city = ?1 group by h")
	Page<HotelSummary> findByCity(City city, Pageable pageable);

	@Query("select r.rating as rating, count(r) as count "
			+ "from Review r where r.hotel = ?1 group by r.rating order by r.rating DESC")
	List<RatingCount> findRatingCounts(Hotel hotel);*/
}
