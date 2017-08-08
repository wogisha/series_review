package cs544.week2.entities;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import cs544.week2.entities.enums.UserRole;


@Entity
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private String username;

	private String password;

	@Enumerated(EnumType.STRING)
	UserRole role;

	public Long getId() {
		return id;
	}

	public String getPassword() {
		return password;
	}

	public UserRole getRole() {
		return role;
	}

	public String getUsername() {
		return username;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	public void setRole(UserRole role) {
		this.role = role;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
}
