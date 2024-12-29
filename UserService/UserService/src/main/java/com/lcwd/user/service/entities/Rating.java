package com.lcwd.user.service.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Rating {
    private String ratingId;
    private String userId;
    private String hotelId;
    private  int rating;
    private  String feedback;
    private Hotel hotel;
	public void setHotel(Hotel hotel2) {
		// TODO Auto-generated method stub
		
	}
	public String getHotelId() {
		// TODO Auto-generated method stub
		return null;
	}

}
