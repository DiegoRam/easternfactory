package models;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.google.code.morphia.annotations.Embedded;
import com.google.code.morphia.annotations.Entity;
import com.google.code.morphia.annotations.Reference;

import play.modules.morphia.Model;
@Entity
public class Order extends Model {
	
	public Date date ;
	public Date deliberyDate;
	@Reference
	public Client client ;
	@Embedded
	public List<Detail> detail ;
	@Embedded
	public List<Payment> payments ;
	
	public Order(Date date , Client cl){
		this.date = date ;
		this.client = cl ;
		this.detail = new ArrayList<Detail>();
		this.payments = new ArrayList<Payment>();
	}
	
	public void addDetail(Detail det){
		this.detail.add(det);
	}
	public List<Detail> getDetails(){
		return detail;
	}
	public boolean removeDetail(Detail det){
		 return this.detail.remove(det);
	}

}
