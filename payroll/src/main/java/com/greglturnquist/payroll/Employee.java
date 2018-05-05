/**
 * 
 */
package com.greglturnquist.payroll;

import javax.persistence.GeneratedValue;

import org.hibernate.annotations.Entity;
import org.springframework.data.annotation.Id;

import lombok.Data;

/**
 * @author awe
 *
 */
@Data
@Entity
public class Employee {
	
	private @Id @GeneratedValue Long id;
	private String firstName;
	private String lastName;
	private String description;
	
	private Employee() {}
	
	public Employee(String firstName, String lastName, String description) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.description = description;
	}

}
