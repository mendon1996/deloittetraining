package com.javatraining.deloitte.assessment1;

abstract class Shape{
	
	abstract double area(double length, double breath, double height);
	abstract double volume(double length, double breath, double height);
	}

	class Cube extends Shape{

	@Override
		double area(double length, double breadth, double height) {
		double a = length;
		double b = breadth;
		double c = height;
		
		double ar = (2*a*b+2*b*c+2*c*a);
		return ar;
	}

	@Override
	double volume(double length, double breadth, double height) {
		double a = length;
		double b = breadth;
		double c = height;
		
		double vol = a*b*c;
		return vol;
	}
}
	class Sphere extends Shape{

		@Override
			double area(double length, double breadth, double height) {
			double a = length;
			double b = breadth;
			
			
			double ar = 4*(3.14)*a*b;
			return ar;
		}

		@Override
		double volume(double length, double breadth, double height) {
			double a = length;
			double b = breadth;
			double c = height;
			
			double vol = (4/3)*(3.14)*a*b*c;
			return vol;
		}
	}
		class Rectangle extends Shape{

			@Override
				double area(double length, double breadth, double height) {
				double a = length;
				double b = breadth;
				
				
				double ar = a*b;
				return ar;
			}

			@Override
			double volume(double length, double breadth, double height) {
				
				
				double vol = -1;
				return vol;
			}
		}		
		class Triangle extends Shape{

				@Override
					double area(double length, double breadth, double height) {
					double a = length;
					double b = breadth;
					
					
					double ar = a*b;
					return ar;
				}

				@Override
				double volume(double length, double breadth, double height) {
					
					
					double vol = -1;
					return vol;
				}
			}
	

		

public class Body{
	
	public static void main(String[] args) {	
	
		Cube c = new Cube();
		Sphere s = new Sphere();
		Triangle t = new Triangle();
		Rectangle r = new Rectangle();
		
		double C = c.area(5, 5, 5);
		System.out.println("Area of cube is "+C +" sq units.");
				
		double C1 = c.volume(5, 5, 5);
		System.out.println("Volume of cube is "+C1 +" cubic units.");
		
		double S = s.area(5, 5, 5);
		System.out.println("Area of sphere is "+S +" sq units.");
		
		double S1 = s.volume(6, 5, 5);
		System.out.println("Volume of sphere is "+S1 +" sq units.");
		
		double T = t.area(3, 4, 5);
		System.out.println("Area of triangle is "+T +" sq units.");
		
		double T1 = t.volume(5, 5, 5);
		System.out.println("Volume of triangle is "+T1 +" sq units.");
		
		double R = r.area(6, 8, 10);
		System.out.println("Area of rectangle is "+R+" sq units.");
		
		double R1 = r.volume(6, 8, 10);
		System.out.println("Volume of rectangle is "+R1 +" sq units.");
	}
	

}
		
