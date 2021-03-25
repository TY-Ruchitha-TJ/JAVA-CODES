package com.tyss.constructor.ths;

public class Bike extends Vehicle{
int	maxspeed=180;
void speed() {
	System.out.println("max speed"+maxspeed);
	System.out.println("super max speed"+super.maxspeed);
}

}
