package fr.gtm.pb_v4_avo.domain;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Client {

	@OneToOne
	@JoinColumn(name = "id_address", referencedColumnName = "id")
	private Address address;
	@Column
	private LocalDate birthday;
	@Column
	private String firstName;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column
	private String lastName;

	public Address getAddress() {
		return this.address;
	}

	public LocalDate getBirthday() {
		return this.birthday;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public Integer getId() {
		return this.id;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setAddress(final Address address) {
		this.address = address;
	}

	public void setBirthday(final LocalDate birthday) {
		this.birthday = birthday;
	}

	public void setFirstName(final String firstName) {
		this.firstName = firstName;
	}

	public void setId(final Integer id) {
		this.id = id;
	}

	public void setLastName(final String lastName) {
		this.lastName = lastName;
	}

}
