package models;

import com.google.code.morphia.annotations.Entity;

import play.modules.morphia.Model;

@Entity
public class Client extends Model {
	public String firstname ;
	public String lastname ;
	
	public Client(String firstname , String lastname){
		this.firstname = firstname ;
		this.lastname = lastname ;
	}

}
