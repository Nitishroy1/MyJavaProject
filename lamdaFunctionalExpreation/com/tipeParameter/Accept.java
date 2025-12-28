package com.tipeParameter;
 

class Accept1<T>{
	private T data;
	public Accept1(T data){
		this.data=data;
	}
	public T getData() {
		return this.data;
	}
}

class Student{
	private int id;
	private String name;
	
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	
	
}
 public class  Accept 
{
void main() {
	Accept1<Integer> typeInt= new Accept1<Integer>(12);
    IO.println(typeInt.getData());
    Accept1<Double> typeDouble=new Accept1<Double>(12d);
    IO.println(typeDouble.getData());
    Accept1<Student> student= new Accept1<Student>(new Student(111,"smith"));
    IO.println(student.getData());
}
	

}
