package org.agoncal.fascicle.quarkus.gettingstarted;

import java.util.Objects;
import java.util.UUID;

import javax.json.bind.annotation.JsonbProperty;
import javax.json.bind.annotation.JsonbTransient;

public class Artist {
	
	@JsonbTransient
	private UUID id;
	@JsonbProperty("first_name")
	private String firstName;
	@JsonbProperty("last_name")
	private String lastName;
	
	// Constructors, getters, setters

	public UUID getId() {
		return id;
	}
	public void setId(UUID id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
		
	public Artist id(UUID id) {
		setId(id);
		return this;
	}
  
	public Artist firstName(String firstName) {
	    setFirstName(firstName);
	    return this;
	}
	
	public Artist lastName(String lastName) {
	    setLastName(lastName);
	    return this;
	}
	
	@Override
  	public boolean equals(Object o) {
	    if (this == o) return true;
	    if (o == null || getClass() != o.getClass()) return false;
	    Artist artist = (Artist) o;
	    return id.equals(artist.id);
	}

	@Override
	public int hashCode() {
	    return Objects.hash(id);
	}

	@Override
	public String toString() {
	    return "Artist{" +
	      "id='" + id + '\'' +
	      ", firstName='" + firstName + '\'' +
	      ", lastName='" + lastName + '\'' +
	      '}';
	}
	  
}
