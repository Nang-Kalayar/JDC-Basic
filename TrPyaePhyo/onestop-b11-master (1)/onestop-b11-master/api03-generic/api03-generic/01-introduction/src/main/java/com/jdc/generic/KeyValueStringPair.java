package com.jdc.generic;

public class KeyValueStringPair implements Pair<String, String>{

	private String key;
	private String value;
	
	public KeyValueStringPair(String key, String value) {
		super();
		this.key = key;
		this.value = value;
	}

	@Override
	public String getKey() {
		// TODO Auto-generated method stub
		return key;
	}

	@Override
	public String getValue() {
		// TODO Auto-generated method stub
		return value;
	}

}
