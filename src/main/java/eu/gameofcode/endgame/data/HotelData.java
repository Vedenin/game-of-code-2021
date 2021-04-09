package eu.gameofcode.endgame.data;



import eu.gameofcode.endgame.dto.HotelDto;

import java.util.ArrayList;
import java.util.List;

public class HotelData {

    public static List<HotelDto> hotels = new ArrayList<>();

    static {
        HotelDto hotelDto = new HotelDto();
        hotelDto.setLon("49.6373");
        hotelDto.setLat("6.21631");
        hotelDto.setName("NH Luxembourg");
        hotelDto.setAddress(" 1 Route de Trèves, 2633 Senningerberg");
        hotelDto.setUrl("https://www.nh-hotels.fr/hotel/nh-luxembourg");
        hotelDto.setForDisablePeople(true);

        hotels.add(hotelDto);

        hotelDto = new HotelDto();
        hotelDto.setLon("49.6012");
        hotelDto.setLat("6.12968");
        hotelDto.setName("Hotel Perrin");
        hotelDto.setAddress("7-9 Rue de Strasbourg, 2561 Luxembourg");
        hotelDto.setUrl("https://hotel-perrin.lu");
        hotelDto.setForDisablePeople(true);

        hotels.add(hotelDto);

        hotelDto = new HotelDto();
        hotelDto.setLon("49.63356");
        hotelDto.setLat("6.19917");
        hotelDto.setName("Ibis Luxembourg Aeroport");
        hotelDto.setAddress("Route de Trèves, 2632 Findel");
        hotelDto.setUrl("https://all.accor.com/hotel/0974/index.ru.shtml");
        hotelDto.setForDisablePeople(true);

        hotels.add(hotelDto);

        hotelDto = new HotelDto();
        hotelDto.setLon("49.36792");
        hotelDto.setLat("6.08291");
        hotelDto.setName("Youth Hostel Luxembourg");
        hotelDto.setAddress("2, rue du Fort Olisy");
        hotelDto.setUrl("https://youthhostels.lu/en/youth-hostels/youth-hostel-luxembourg");
        hotelDto.setForDisablePeople(true);

        hotels.add(hotelDto);
    }
}
