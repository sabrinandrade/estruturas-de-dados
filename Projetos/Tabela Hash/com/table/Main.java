package com.table;

public class Main {

	public static void main(String[] args) {
		HashTable t = new HashTable(40);
		
		t.printTable();
		t.add(1);
		t.printTable();
		t.add(41);
		t.printTable();
		
		t.printTable();
		t.add(39);
		t.printTable();
		t.add(79);
		t.printTable();
		
		t.remove(79);
		t.printTable();
		t.add(79);
		t.printTable();
		
		t.add(22);
		t.printTable();
		t.add(42);
		t.printTable();
	}

}
