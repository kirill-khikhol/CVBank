package com.telran.cvBank.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class CvListDto {
	private Integer currentPage;
	private Integer itemsOnPage;
	private Integer itemsTotal;
	private List<CvWrapperDto> cvList;

}
