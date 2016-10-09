package Quiz3;
import static org.junit.Assert.*;

public class quiz3Test {
	@Test
	public void test() {
		triangle t1 = new triangle(1,1,1);
		triangle t2 = new triangle(2,2,2.82);
		assertEquals(t1.getArea(),.433,.1);
		assertEquals(t1.getPerimeter(),3,.1);
		assertEquals(t2.getArea(),1.99,.1);
		assertEquals(t2.getPerimeter(),6,.82,.1);
		
	}


}
