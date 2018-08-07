package lab8;

import java.util.Iterator;
import java.util.LinkedList;

public class Polynomial {

	final private LinkedList<Double> list;
//	double sum=0;

	/**
	 * Constructs a Polynomial with no terms yet.
	 */
	public Polynomial() {
	// Set the instance variable (list) to be a new linked list of Double type
	list = new LinkedList<Double>();
	
	}


	

	@Override
	public String toString() {
		String n="";
		for(int i=0; i<list.size();i++) {
			if (i==0) {
				n=n+list.get(i);
			}
			else{
				if(list.getFirst()!=0) {
					n=n+ "+"+list.get(i)+"x^"+i;
				}
			
			}
		}
		return n;
		
	}
		



	public Polynomial addTerm(double coeff) {
		list.add(coeff);
		return this;  // required by lab spec
	}

	public double evaluate(double x) {
//		System.out.println("calling evaluate with x = " + x);
		double sum = 0;
		int i = list.size()-1;
		while(i>=0) {
			
			sum = sum*x + list.get(i);
			i--;
		
		}
		return sum;
	
	}
	
	
	public Polynomial derivative() {
		
		int i= 1;
		Polynomial d = new Polynomial();
			while(i<=list.size()-1) {
				 d.addTerm(list.get(i)*i);
				 i++;
			 }
			

		return d;
		
		
	}
	
	public Polynomial sum(Polynomial another) {
		
		Polynomial s = new Polynomial();
		int al=list.size();
		int bl=another.list.size();
	
		if(al<bl) {
			//for(int x = al.size; x < bl.size; x++){....}
			for(int i=0; i<al; i++) {
			 s.addTerm(this.list.get(i)+ another.list.get(i));
			
			}
			
		    for(int j= al; j< bl; j++) {
		    	s.addTerm(another.list.get(j));
		    
		    }
		    
		}
		else if(bl<al) {
			for(int a=0; a<bl; a++) {
				 s.addTerm(this.list.get(a)+ another.list.get(a));
				
				}
			
			    for(int b= bl; b< al; b++) {
			    	s.addTerm(this.list.get(b));

			    }
			    
		}
			else {
				for(int a=0; a<bl; a++) {
					 s.addTerm(list.get(a)+ another.list.get(a));
	
					}
			 
			
		}
		

	return s;
	}

	/**
	 * This is the "equals" method that is called by
	 *    assertEquals(...) from your JUnit test code.
	 *    It must be prepared to compare this Polynomial
	 *    with any other kind of Object (obj).  Eclipse
	 *    automatically generated the code for this method,
	 *    after I told it to use the contained list as the basis
	 *    of equality testing.  I have annotated the code to show
	 *    what is going on.
	 */

	public boolean equals(Object obj) {
		// If the two objects are exactly the same object,
		//    we are required to return true.  The == operator
		//    tests whether they are exactly the same object.
		if (this == obj)
			return true;
		// "this" object cannot be null (or we would have
		//    experienced a null-pointer exception by now), but
		//    obj can be null.  We are required to say the two
		//    objects are not the same if obj is null.
		if (obj == null)
			return false;

		//  The two objects must be Polynomials (or better) to
		//     allow meaningful comparison.
		if (!(obj instanceof Polynomial))
			return false;

		// View the obj reference now as the Polynomial we know
		//   it to be.  This works even if obj is a BetterPolynomial.
		Polynomial other = (Polynomial) obj;

		//
		// If we get here, we have two Polynomial objects,
		//   this and other,
		//   and neither is null.  Eclipse generated code
		//   to make sure that the Polynomial's list references
		//   are non-null, but we can prove they are not null
		//   because the constructor sets them to some object.
		//   I cleaned up that code to make this read better.


		// A LinkedList object is programmed to compare itself
		//   against any other LinkedList object by checking
		//   that the elements in each list agree.

		return this.list.equals(other.list);
	}

}
