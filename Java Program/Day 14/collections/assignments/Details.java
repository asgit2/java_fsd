package com.collections.assignments;
import java.util.Comparator;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Details {
	private Integer ID;
	private String name;
	private String skills;
	
//	@Override
//	public int hashCode() {
//		return this.getID();
//	}
//	@Override
//	public boolean equals(Object obj) {
//		return this.getID().equals(((Details)obj).getID());
//	}
}
class sortById implements Comparator{
	@Override
	public int compare(Object o1,Object o2) {
		return ((Details)o1).getID().compareTo(((Details)o2).getID());
	}
	
}

class sortBySkills implements Comparator{
	@Override
	public int compare(Object o1,Object o2) {
		return ((Details)o1).getSkills().compareTo(((Details)o2).getSkills());
	}
}
class sortByFirstName implements Comparator{
	@Override
	public int compare(Object o1, Object o2) {
		String[] f1 = ((Details)o1).getName().split(" ");
		String[] f2 = ((Details)o2).getName().split(" ");
		return (f1[0]).compareTo(f2[0]);
	}
}
class sortByLastName implements Comparator{
	@Override
	public int compare(Object o1, Object o2) {
		String[] f1 = ((Details)o1).getName().split(" ");
		String[] f2 = ((Details)o2).getName().split(" ");
		return (f1[1]).compareTo(f2[1]);
	}
}

