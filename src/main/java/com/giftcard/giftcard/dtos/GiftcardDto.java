package com.giftcard.giftcard.dtos;

import lombok.Data;
import lombok.NonNull;

@Data
public class GiftcardDto {
	
	@NonNull
	private String name;
	@NonNull
	private String description;
	@NonNull
	private Long inventory;
	@NonNull
	private Double price;
}
