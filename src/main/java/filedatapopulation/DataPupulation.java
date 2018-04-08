package filedatapopulation;

import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

import pojo.City;
import pojo.Hotel;
import respository.HotelService;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class DataPupulation {
	
	@Autowired
	private HotelService hotelservice;

    private static final String SAMPLE_CSV_FILE_PATH = "./users-with-header.csv";

    
    public void parseCsvFile() {
        try (
            Reader reader = Files.newBufferedReader(Paths.get(SAMPLE_CSV_FILE_PATH));
        ) {
            @SuppressWarnings("unchecked")
			CsvToBean csvToBean = new CsvToBeanBuilder(reader)
                    .withType(HotelCsv.class)
                    .withIgnoreLeadingWhiteSpace(true)
                    .build();

            List<HotelCsv> hotel = csvToBean.parse();

            for (HotelCsv csvUser : hotel) {
            	
            	Hotel hotel2db = new Hotel();
            	
            	City newcity = new City(csvUser.getCityname());
            	
            	hotel2db.setCity(newcity);
            	
            	
                System.out.println("HotelName : " + csvUser.getHotelname());
                System.out.println("Email : " + csvUser.getCityname());
                System.out.println("PhoneNo : " + csvUser.getCountry());
                System.out.println("Country : " + csvUser.getAddress());
                System.out.println("---------------------------");
            }
        } catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    
    public Boolean doesHotelExit(HotelCsv hotel2enter) {
    	Boolean result = false;
    	
    	
    
    	return result;
    	
    }
}
