package com.equals.hashmape;

class Product{
  private int productId;
  private String productName;
  
  public Product(int productId, String productName) {
	  this.productId=productId;
	  this.productName=productName;
  }
  
  public int getProductId() {
	return productId;
}

  public String getProductName() {
	return productName;
  }
  
  @Override
  public int hashCode() {
	  return this.getProductId();
  }

  @Override
  public boolean equals(Object obj) {
	  if(obj instanceof Product) {
	  
	  //first object data
	  int id1=this.getProductId();
	  String name1=this.getProductName();
	  
	  //second object data
	  Product c2=(Product)obj;
	  int id2 = c2.getProductId();
	  String name2=c2.getProductName();
	  if(id1==id2 && name1.equals(name2)) {
		  return true;
	  }
	  else {
		  return false;
	  }
  }
	  else {
		  IO.println("You not pass correct object plz pass correct obj");
		  System.exit(0);
		  return false;
	  }
	  
  }	  
}

public class ProductEquality {
	void main() {
		int id=Integer.parseInt(IO.readln("Enter Product Id: "));
		String name= IO.readln("Enter Product name: ");
		Product p1=new Product(id, name);
		int id1=Integer.parseInt(IO.readln("Enter Product Id: "));
		String name1= IO.readln("Enter Product name: ");
		Product p2=new Product(id1, name1);
		IO.println("Product p1 is Equals to p2 : "+p1.equals(p2));
		IO.println("Product p1 HashCode: " +p1.hashCode());
		IO.println("Product p2 HashCode:" +p2.hashCode());
		
		
	}
}
