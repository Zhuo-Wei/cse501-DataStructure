package studio7;

public class Rectangle {
	
	private int width,length;
	/**
	 * 
	 * @param width£º the width of the rectangle
	 * @param length:  the length of the rectangle
	 */
	public Rectangle(int width, int length) {
		this.width = width;
		this.length = length;
	}
	/**
	 * 
	 * @return the area of the rectangle
	 */
	public int area() {
		return width*length;
	}
	/**
	 * 
	 * @return the perimeter of the rectangle
	 */
	public int perimeter() {
		return 2*(width+length);
	}
	
	/**
	 * 
	 * @param rec1: another rectangle used to be compared 
	 * @return whether the rectangle larger than rec1
	 */
	public boolean bigger(Rectangle rec1) {
		if (this.area()>rec1.area()) {
			return true;
		}
		else return false;
	}
	/**
	 * 
	 * @return whether the rectangle is actually a square
	 */
	public boolean square() {
		if (width==length) {
			return true;
		}
		else return false;
	}
	
	
	
	/**
	 * 
	 * @return get width of rectangle
	 */
	public int getWidth() {
		return width;
	}
	/**
	 * 
	 * @param width: set the width
	 */
	public void setWidth(int width) {
		this.width = width;
	}
	/**
	 * 
	 * @return get the length
	 */
	public int getLength() {
		return length;
	}
	/**
	 * 
	 * @param length: set the length
	 */
	public void setLength(int length) {
		this.length = length;
	}
	
	public String toString() {
		
		if ( square()== true) {
			return "This rectangle actually is a square. Width= length =" + width ;
		}
		else return  "This rectangle actually is not a square. Width= "+width+"length =" + length;
		
	}
	
	public static void main(String[] args) {
		Rectangle a1  = new Rectangle(4,4);
		Rectangle a2  = new Rectangle(5,4);
        System.out.println(a1.toString()+ "\n"+
        		"Is it the bigger one? "+ a1.bigger(a2));
	}

}
