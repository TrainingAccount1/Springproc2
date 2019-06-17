package com.pac;

import java.util.*;

public class ClassCollection {

	private List addresslist;
	private Set addressset;
	private Map addressmap;
	private Properties addressprop;
	
	public List getAddresslist1() {
	
		System.out.println("List Eelements "+addresslist);
		return addresslist;
	}
	

	
	public void setAddresslist(List addresslist) {
	
		{
		this.addresslist = addresslist;
		
		}
	}
	
	
	public Set getAddressset() {
		
		System.out.println("set Elements :"+addressset);
		return addressset;
	}
	public void setAddressset(Set addressset) {
		this.addressset = addressset;
	}
	public Map getAddressmap() {
		System.out.println("Map Elelements: "+addressmap);
		return addressmap;
	}
	public void setAddressmap(Map addressmap) {
		this.addressmap = addressmap;
	}
	public Properties getAddressprop() {
		System.out.println("Properties Elements :"+addressprop);
		return addressprop;
	}
	public void setAddressprop(Properties addressprop) {
		this.addressprop = addressprop;
	}
	
	
	
	
}
