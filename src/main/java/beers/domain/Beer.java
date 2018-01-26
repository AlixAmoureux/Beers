package beers.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Beer implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", updatable = false)
	private long id;

	@Column(name = "name", unique = true)
	private String name;

	@Column(name = "country", unique = true)
	private String country;

	@Column(name = "alcohol_level", unique = true)
	private float alcoholLevel;

	public Beer(String name, String country, float alcoholLevel) {
		this.name = name;
		this.country = country;
		this.alcoholLevel = alcoholLevel;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public float getAlcoholLevel() {
		return alcoholLevel;
	}

	public void setAlcoholLevel(float alcoholLevel) {
		this.alcoholLevel = alcoholLevel;
	}

}
