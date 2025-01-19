package com.baseCollection;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

class Stud implements Comparable<Stud>
{
	int rollno,marks;
	String name;
	public Stud(int rollno , String name ,int marks )
	{
		super();
		this.rollno= rollno;
		this.marks= marks;
		this.name=name;
	}
	@Override
	public String toString() {
		return "Stud [rollno=" + rollno + ", marks=" + marks + ", name=" + name + "]";
	}
	
	public int compareTo(Stud s)
	{
		//return  marks>s.marks?1:-1;  // sorting based on marks 
		return name.length()>s.name.length()?1:-1;	
			}
}
public class comparableCollections {

	public static void main(String[] args) {
		
		List<Stud> studs = new ArrayList<>();
		studs.add(new Stud(23, "Mohit", 23));
		studs.add(new Stud(21, "Ayushi", 13));
		studs.add(new Stud(18, "Vija", 22));
		
		//Collections.sort(studs);
		//overriding the comparable login based on comparator
		Collections.sort(studs,(i,j)->i.marks>j.marks?1:-1);
		
		for(Stud s:studs)
		{
			System.out.println(s);
		}
		
	}

}
