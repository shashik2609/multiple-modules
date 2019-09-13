package com.acme;

import com.acme.domain.Hotel;
import com.acme.persistence.HotelRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HotelController {
    private HotelRepository hotelRepository;

    public HotelController(HotelRepository hotelRepository) {
        this.hotelRepository = hotelRepository;
    }

    @RequestMapping(value = "/hotels", method = RequestMethod.GET)
    public List<Hotel> getHotels(){
        List<Hotel> hotels = hotelRepository.findAll();
        return hotels;
    }

}
