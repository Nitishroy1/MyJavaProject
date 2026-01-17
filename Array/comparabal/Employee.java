package comparabal;

public record Employee(Integer id ,String name) //implements Comparable<Employee>
{

	//@Override
//	public int compareTo(Employee o) {
//		
//		return this.id().compareTo(o.id());
//	}

}
