package models;

import java.util.Date;

import com.google.code.morphia.annotations.Embedded;
import com.google.code.morphia.annotations.Entity;

import play.modules.morphia.Model;

@Embedded
public class Payment  {

		public Date date ;
		public float amount ;
}
