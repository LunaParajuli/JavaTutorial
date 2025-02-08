package oop;

import org.w3c.dom.ls.LSOutput;

public class learnAnonymousClasses {
	
OuterClass objClass = new OuterClass(){
	void sing() {
		
	}
};

SuperInterface obj2 = new SuperInterface() {

	@Override
	public void interfaceMethod() {
		// TODO Auto-generated method stub
		
	}
	
};

SuperInterface obj3 =()->{ //==> similar to obj2
	
};


}

class OuterClass{
	public void outerMethod() {
		
	}
}

@FunctionalInterface
interface SuperInterface{
	void interfaceMethod();
}