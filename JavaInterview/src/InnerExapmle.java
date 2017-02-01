


public class InnerExapmle{
   public static void main(String args[]){
	   	  
	   Outer_Demo out = new Outer_Demo();
	   Outer_Demo.Inner_Demo inner = out.new Inner_Demo();
	   System.out.println(inner.getNum());
   }

}

class Outer_Demo {
	
	   private int num= 175; 
	   
	   public class Inner_Demo{
		   
	      public int getNum(){
	         System.out.println("This is the getnum method of the inner class");
	         return num;
	      }
	      
	   }
	}
