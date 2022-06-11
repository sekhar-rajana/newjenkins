/**
 * 
 */
package testcases;

/**
 * @author Administrator
 *
 */
public class NewClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//integer
		byte age;
		age=25;
		int salary=500000;
		short marks=500;
		long turnover=100000000;
		
		System.out.println(age);
		System.out.println(marks);
		System.out.println("turnover:"+turnover);
		System.out.println("age:"+age);
		System.out.println("salary:"+salary);
		System.out.println(age+marks);
		
		//Real Numbers
		float a = 1.00023f;
		double b = 1000.50;
		System.out.println(a);
		System.out.println(b);
		
		//Character
		char gender='m';
		System.out.println(gender);
		gender='f';
		System.out.println(gender);
		
		//Boolean
		boolean issleeping=true;
		System.out.println(issleeping);
		
		//string values
		String cname;
		cname = "java";
		
		System.out.println(cname);
		//length returns value
		System.out.println(cname.length());
		//UpperCase value returns
		System.out.println(cname.toUpperCase());
		//LowerCase value returns
		System.out.println(cname.toLowerCase());
		
		String exptitle,acttitle;
		exptitle="Gmail";
		acttitle="GMail";
		System.out.println(exptitle.equals(acttitle));
		//case sensitive ignored.
		System.out.println(exptitle.equalsIgnoreCase(acttitle));
	
   
	}

}
