package com.tyss.inheritance.defaults;

public class TestMulti {
public static void main(String[] args) {
	
	Hero hero=new Hero();
	hero.chasisNo=354433;
	hero.color="black";
	hero.type();
	hero.name();
	
	Tvs tvs=new Tvs();
	tvs.cc="125";
	tvs.chasisNo=589473;
	tvs.color="blue";
	tvs.type();
	tvs.name();
	
}
}
