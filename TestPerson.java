/**
 * Hello world!
 *
 */
public class TestPerson 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello to Jenkins!"+greetMe());
    }
	
	public static String greetMe(){
		String name="Sameer";
		return "Welcome: "+name;
	}
	
	public static int add(int num1,int num2){
		System.out.println("Addition of two numbers: "+(num1+num2));
		return (num1+num2);
	}
	
}
