package com.cg.fs.hsbc;
import org.junit.*;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
	private App a1=null;
	
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
	@Before
	public void seUp() throws Exception {
		a1=new App();
	}

	@After
	public void teaDown() throws Exception {
		a1=null;
	}

	@Test
	public void testGreetMe(){
		Assert.assertEquals("Welcome: Sameer",a1.greetMe());
	} 
	 
    public AppTest()
    {
        super();
    }

    /**
     * @return the suite of tests being tested
     */
    
}
