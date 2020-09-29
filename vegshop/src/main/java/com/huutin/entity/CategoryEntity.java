package com.huutin.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "category")
public class CategoryEntity extends BaseEntity {

	@Column(name = "name")
	private String name;

	@Column(name = "code")
	private String code;

	@OneToMany(mappedBy = "category")
	private List<VegEntity> vegs = new ArrayList<>();

	public String getName() {
		return name;
	}

	public List<VegEntity> getVegs() {
		return vegs;
	}

	public void setVegs(List<VegEntity> vegs) {
		this.vegs = vegs;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

}
