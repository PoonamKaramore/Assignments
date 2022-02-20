package com.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class ZipcodeService {

	    private static List<Zipcode> list = new ArrayList<Zipcode>();

	    static {
	        list.add(new Zipcode(442301, "AK", "ANCHORAGE", "US"));
	    }

	    public Zipcode getByZipcode(int zipcode) {

	        return list.stream().filter(z -> z.getZipcode() == zipcode).findFirst().get();
	    }

	    public List<Zipcode> findAll() {
	        return list;
	    }

}
