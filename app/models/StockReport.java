package models;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.code.morphia.annotations.Entity;

import play.modules.morphia.Model;
@Entity
public class StockReport extends Model {

	public Date date ;
	public int color ;
	public int size ;
	public int number ;
	
	public StockReport(Date date, int color, int size, int number){
		this.date = date ;
		this.color = color ;
		this.size = size ;
		this.number = number ;
	}
	
	public Map<String,Integer> getAll(){
		
		Map<String, Integer> mapReturn = new HashMap<String, Integer>();
		
		List<StockReport> stocks = StockReport.findAll();
		for (StockReport stock : stocks){
			switch (stock.color) {
			case 1:
				
				break;

			default:
				break;
			}
		}
		return new HashMap<String, Integer>();
	}
	
}
