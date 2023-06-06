package Emanuele.demo.entities;

import java.util.HashSet;
import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@AllArgsConstructor
@ToString
public class User {


	private Long id;
	private String username;
	private String nome;
	private String email;
	private Boolean active = true;
	
	private String password;
	
	private Set<Role> roles = new HashSet<>();	
	

}
