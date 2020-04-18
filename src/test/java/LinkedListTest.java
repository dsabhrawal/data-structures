
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class LinkedListTest {

	static LinkedList list ;
	
	@BeforeAll
	public static void setup() {
		list = new LinkedList();
	}
	
	@Test
	public void testAddFirst() {
		list.addFirst(10);
		Assertions.assertEquals(0,list.indexOf(10));
	}
}
