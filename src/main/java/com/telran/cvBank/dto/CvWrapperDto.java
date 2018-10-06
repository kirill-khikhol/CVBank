package com.telran.cvBank.dto;

public class CvWrapperDto {
	private CvDto cv;

	public CvWrapperDto(CvDto cv) {
		super();
		this.cv = cv;
	}

	public CvWrapperDto() {
		super();
	}

	public CvDto getCv() {
		return cv;
	}

}
