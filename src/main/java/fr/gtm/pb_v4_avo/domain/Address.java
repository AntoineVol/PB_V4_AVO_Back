package fr.gtm.pb_v4_avo.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Address {

	@Column
	private String city;
	@Column
	private String country;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column
	private String line1;
	@Column
	private String line2;
	@Column
	private String postalCode;

	public String getCity() {
		return this.city;
	}

	public String getCountry() {
		return this.country;
	}

	public Integer getId() {
		return this.id;
	}

	public String getLine1() {
		return this.line1;
	}

	public String getLine2() {
		return this.line2;
	}

	public String getPostalCode() {
		return this.postalCode;
	}

	public void setCity(final String city) {
		this.city = city;
	}

	public void setCountry(final String country) {
		this.country = country;
	}

	public void setId(final Integer id) {
		this.id = id;
	}

	public void setLine1(final String line1) {
		this.line1 = line1;
	}

	public void setLine2(final String line2) {
		this.line2 = line2;
	}

	public void setPostalCode(final String postalCode) {
		this.postalCode = postalCode;
	}

}
