package com.cooksys.socialmedia.entities;

import javax.persistence.Column;
import javax.persistence.Embeddable;


import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable
@NoArgsConstructor
@Data

public class Profiles {
	
	private String firstName;

	private String lastName;

	@Column(nullable = false)
	private String email;

	private String phone;


}