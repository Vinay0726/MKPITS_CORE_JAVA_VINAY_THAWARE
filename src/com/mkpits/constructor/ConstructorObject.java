package com.mkpits.constructor;

public class ConstructorObject {
    int id,pincode;
	public static void main(String[] args) {
		ConstructorObject obj=new ConstructorObject();
		obj.getDetail();
		ConstructorObject obj1=new ConstructorObject(2,440013);
		obj1.getDetail();
		ConstructorObject obj2=new ConstructorObject(obj);
		obj2.getDetail();
		
	}
	
	
	public void getDetail() {
		System.out.println("Id:"+id +" Pincode:" +pincode);
		
	}


	public ConstructorObject() {
		System.out.println("Construtor with no arguement");
		id=1;
		pincode=440012;
	}


	public ConstructorObject(int i, int p) {
		System.out.println("Constructor with parameterized");
		id=i;
		pincode=p;
	}


	public ConstructorObject(ConstructorObject obj) {
		System.out.println("Constructor with Object");
		id=obj.id;
		pincode=obj.pincode;
	}
	
}

