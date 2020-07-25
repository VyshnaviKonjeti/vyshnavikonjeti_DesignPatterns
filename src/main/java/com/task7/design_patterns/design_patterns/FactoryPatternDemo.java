package com.task7.design_patterns.design_patterns;

public class FactoryPatternDemo {

	   public static void main(String[] args) {
	      FruitFactory fruitFactory = new FruitFactory();

	      
	      Fruit fruit1 = fruitFactory.getFruit("APPLE");
	      fruit1.buy();

	      Fruit fruit2 = fruitFactory.getFruit("BANANA");
	      fruit2.buy();
	      
	      Fruit fruit3 = fruitFactory.getFruit("MANGO");
	      fruit3.buy();

	   }
	}