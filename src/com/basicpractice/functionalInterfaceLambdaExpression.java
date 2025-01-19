package com.basicpractice;
// Interfcae - 1 - Normal Interface 2 - Single Abstract Method Interface 3 - Market Interface(Serializable)
               // Bu java 1.8 - 2 - Is recalled as Functional Interface having only 1 method
  

// interface - only declare method - till java 1.7
//interface - we can define method in interface post java 1.8

interface funcILam
{
	void expression();// by default public abstract
}

/*class lam implements funcILam
{
	public void expression()
	{
		
	}
}*/

public class functionalInterfaceLambdaExpression {

	public static void main(String[] args) {
		
		funcILam obj = () -> System.out.println("Lamda Example");
		obj.expression();


	}

}
