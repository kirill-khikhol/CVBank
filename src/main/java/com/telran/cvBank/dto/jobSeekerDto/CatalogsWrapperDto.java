package com.telran.cvBank.dto.jobSeekerDto;
import java.io.Serializable;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class CatalogsWrapperDto implements Serializable {
	private List<CatalogWrapperDto> catalogs;
}
