package com.pratice;

public class StringBuff {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("Hello ");  
		sb.append("Java");//now original string is changed  
		System.out.println(sb);//prints Hello Java  
	
		System.out.println(sb.insert(2, "Mohir"));
		System.out.println(sb.replace(1,4, "Mohir"));
		System.out.println(sb.delete(1,9));
		System.out.println(sb.reverse());
		
		StringBuffer sb1=new StringBuffer();  
		System.out.println(sb1.capacity());//default 16  
		sb1.append("Hello");  
		System.out.println(sb1.capacity());//now 16  
		sb1.append("java is my favourite language");  
		System.out.println(sb1.capacity());//now (16*2)+2=34 i.e (oldcapacity*2)+2 
		
		sb1.ensureCapacity(10);//now no change  
		System.out.println(sb1.capacity());//now 34  
		sb1.ensureCapacity(50);//now (34*2)+2  
		System.out.println(sb1.capacity());//now 70
		
		/**String Builder methods same as String Buffer 
		only diff is String Builder is faster than String Buffer
		But String Buffer is thread safe and in order , it runs of multiple thread whereas
		string builder runs on single thread but not in order/sync **/

	}

}
