package com.awe.BuildingRESTServices.bookmarks;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Account {
	
	@Id
	@GeneratedValue
	private Long id;
	
	private String username;
	
	@JsonIgnore
	private String password;
	
	@OneToMany(mappedBy = "account")
	private Set<Bookmark> bookmarks = new HashSet<>();
	
	private Account() { } //JPA only
	
	private Account(final String username, final String password) {
		this.username = username;
		this.password = password;
	}
	
	public Long getId() {
		return id;
	}
	
	public String getUsername() {
		return username;
	}
	
	public String getPassword() {
		return password;
	}
	
	public Set<Bookmark> getBookmarks() {
		return bookmarks;
	}

}
