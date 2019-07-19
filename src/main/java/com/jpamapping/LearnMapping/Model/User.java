package com.jpamapping.LearnMapping.Model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;



@Entity
@Table(name = "users")
public class User implements Serializable{

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	


	@NotBlank(message="Please Enter Your First Name")
	@Size(max=65)
	@Column(name="first_name")
	private String firstname;
	
	@NotBlank(message="Please Enter Your Last Name")
	@Size(max=65)
	@Column(name="last_name")
	private String lastname;
	
	@NotNull
	@Email
	@Column(name = "email")
	private String email;
	
	
		@NotNull
	    @Size(max = 128)
	    private String password;
		
		@OneToOne(fetch = FetchType.LAZY,
				cascade=CascadeType.ALL,
				mappedBy="user")
		private UserProfile userProfile;
		
		public User()
		{
			
		}
		
		public User(@NotBlank(message = "Please Enter Your First Name") @Size(max = 65) String firstname,
				@NotBlank(message = "Please Enter Your Last Name") @Size(max = 65) String lastname,
				@NotNull @Email String email, @NotNull @Size(max = 128) String password) {
			super();
			this.firstname = firstname;
			this.lastname = lastname;
			this.email = email;
			this.password = password;
		}
		

		public long getId() {
			return id;
		}

		public void setId(long id) {
			this.id = id;
		}

		public String getFirstname() {
			return firstname;
		}

		public void setFirstname(String firstname) {
			this.firstname = firstname;
		}

		public String getLastname() {
			return lastname;
		}

		public void setLastname(String lastname) {
			this.lastname = lastname;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public void setUserProfile(UserProfile userProfile) {
			// TODO Auto-generated method stub
			this.userProfile=userProfile;
		}
		
}
