package com.collections.generics;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Pair<T,V> {

	private T first;
	private V second;
	
	public Pair(T first, V second) {
		this.first = first;
		this.second = second;
	}
	public static void main(String[] args) {
		Pair<Integer,Integer> p1 = new Pair<>(10,20);
		System.out.println("("+p1.getFirst()+ "," + p1.getSecond()+")");
		Pair<String,String> p2 = new Pair<>("Abhishek","Ghosh");
		System.out.println("("+p2.getFirst()+ "," + p2.getSecond()+")");
		
		Pair<Pair<Integer,Integer>,Integer> p3 = new Pair<>(p1,30);
		System.out.println("("+p3.getFirst().getFirst()+ ","+p3.getFirst().getSecond()+"," + p3.getSecond()+")");
		
	} 
}
