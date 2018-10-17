package com.telran.cvBank.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class FolderEntity {
	@Id
	@GeneratedValue
	private long id;
	private String folderName;
	@ManyToMany
	private List<CvEntity> myCvList;
}
