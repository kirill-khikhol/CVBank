package com.telran.cvBank.dto.jobSeekerDto;

import java.io.Serializable;
import java.util.List;

import com.telran.cvBank.dto.DescriptionDto;
import com.telran.cvBank.dto.ExperienceDto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class JobSeekerCvWrapperDto implements Serializable {
	JobSeekerCvDto cv;

}
