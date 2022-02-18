package overloading;

public class overload {
      void poly (int a) {
	 System.out.println("a: " + a);
      }
      
     void poly (int a, int b) {
    	 System.out.println("a and b: " + a + "," + b);
     }
     double poly(double a) {
    	 System.out.println("double a: " + a);
         return a*a;
}
    	 
    	 }
 class Methodoverloading
 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
overload obj = new overload();
double result;
obj.poly(10);
obj.poly(10,20);
result = obj.poly(1.2);
System.out.println("O/P : " + result);
	}

}
