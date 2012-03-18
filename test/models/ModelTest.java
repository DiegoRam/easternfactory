package models;

import java.util.Date;

import models.Detail.COLOR;
import models.Detail.SIZE;

import org.junit.Test;

import play.test.UnitTest;

public class ModelTest extends UnitTest {
	
	@Test
	public void testClients(){
		Client cl = new Client("Diego", "Ramirez");
		assertNotNull(cl);
		cl.save();
		
		assertNotNull(Client.find("firstname", "Diego").first());
		
	}
	@Test
	public void testOrderwithclient(){
		Client cl = Client.find("firstname", "Diego").first();
		assertNotNull(cl);
		
		Order order = new Order( new Date(System.currentTimeMillis()) , cl);
		assertNotNull(order);
		order.save();
		
		Detail det = new Detail(COLOR.BLACK,SIZE.MEDIUM,2);
		order.addDetail(det);
		order.save();
		
	}
	

}
