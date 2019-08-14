package com.rock1;


import java.util.List;
import java.util.Map;
import java.util.Set;

public class JavaCollection {
	private List addressList;
	private Map addressMap;
	private Set addressSet;
	public List getAddressList() {
		System.out.println("JavaCollection.getAddressList()"+addressList);
		return addressList;
	}
	public void setAddressList(List addressList) {
		this.addressList = addressList;
	}
	public Map getAddressMap() {
		System.out.println("JavaCollection.getAddressMap()"+addressMap);
		return addressMap;
	}
	public void setAddressMap(Map addressMap) {
		this.addressMap = addressMap;
	}
	public Set getAddressSet() {
		System.out.println("JavaCollection.getAddressSet()"+addressSet);
		return addressSet;
	}
	public void setAddressSet(Set addressSet) {
		this.addressSet = addressSet;
	}
	
}
