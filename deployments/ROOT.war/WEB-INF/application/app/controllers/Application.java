package controllers;

import play.*;
import play.data.validation.Required;
import play.data.validation.Valid;
import play.mvc.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

import models.*;
import java.text.SimpleDateFormat;

public class Application extends Controller {

	private static final SimpleDateFormat SDF = new SimpleDateFormat(
			"dd/MM/yyyy");

	public static void index() {

		List<Client> clients = Client.findAll();
		List<Order> orders = Order.findAll();
		render(clients, orders);
	}

	public static void stats() {

	}

	public static void saveClient(@Required String firstname, @Required String lastname) {
		
		
		Client cl = new Client(firstname, lastname);
		cl.save();
		flash.success("Vamos Rusa!!!");
		index();

	}

	public static void saveOrder(@Required String clientId,
			@Required String orderDate, @Required String deliveryDate,
			@Required Order order) {

		if (!validation.hasErrors()) {

			order.client = Client.findById(clientId);
			try {
				order.date = SDF.parse(orderDate);
				order.deliberyDate = SDF.parse(deliveryDate);
			} catch (ParseException e) {
				flash.error("Fecha Invalida");
				index();
			}
			order.save();
			flash.success("Grande Rusa!!");
			index();
		}
	}

}