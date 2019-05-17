package com.table;

import java.util.Arrays;


public class HashTable {
	
	private int[] table;
	
	public HashTable(int size) {
		this.table = new int[size];
		
	}
	
	public void add(int key) {
		int position = hashFunction(key);

		if(table[position] != 0)
			position = linearProbing(position, key);
		
		table[position] = key;
		
	}
	
	public void remove(int key) {
		int position = hashFunction(key);
		
		if(table[position] != key)
			position = linearProbing(position, key);
		
		table[position] = -1;
		
	}
	
	private int hashFunction(int key) {
		return key % this.table.length;
		
	}
	
	private int linearProbing(int position, int key) {
		while(table[position] != 0 && table[position] != -1 && table[position] != key) {
			position++;
			
			if(position > this.table.length - 1) 
				position = 0;
		}
		
		return position;
		
	}
	
	public void printTable() {
		System.out.println(Arrays.toString(table));
		
	}

}
