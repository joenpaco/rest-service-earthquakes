package com.joenpaco.utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Component;

import com.joenpaco.errors.NotDateParseException;

@Component
public class Fecha {
	
	public static final String FORMATO_DE_SALIDA = "yyyy-MM-dd";
	
	public static final long DIA_EN_MILISEGUNDOS = 86400000;
	
	public Fecha() {
	}

	public String getDate(String string) {
		
		DateFormat dateFormat = new SimpleDateFormat(FORMATO_DE_SALIDA);
		
		String dateString;
		
		Date date;
		
		try {
			
			date = dateFormat.parse(string);
			
			dateString = dateFormat.format(date);
			
		} catch (Exception e) {
			
			throw new NotDateParseException("Revise el Formato de la Fecha");
			
		}
		
		return dateString;
	}
	
	public String getDateAfter(String string) {
		
		DateFormat dateFormat = new SimpleDateFormat(FORMATO_DE_SALIDA);
		
		Date date;
		
		long actualDate;
		
		long afterDate;
		
		String dateString;
		
		try {
			
			date = dateFormat.parse(string);
			
			actualDate = date.getTime();
			
			afterDate = actualDate + DIA_EN_MILISEGUNDOS;
			
			dateString = dateFormat.format(new Date(afterDate));
			
		} catch (Exception e) {
			
			throw new NotDateParseException("Revise el Formato de la Fecha");
			
		}
		
		return dateString;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
