package com.telran.cvBank.dto.jobSeekerDto;

import java.io.Serializable;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class CatalogDto implements Serializable {
	private String catalogName;
	private List<String> catalogBody;
}
