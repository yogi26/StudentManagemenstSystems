package com.interfaceconcept;

public class Child implements Parent, Uncle{
	
	public void show() {
		System.out.println("Hello form show from child class");
	}
	public static void main(String[] args) {
		Parent p=new Child();
		((Child)p).display();
		//p.display();
		
		/*Learning: p.show() will first go to parent interface/class and checks weather 
		show() is overridden in subclass if no then it will call show() from Parent else it 
		will call overridden show() from subclass
		
		*/
	}
}
