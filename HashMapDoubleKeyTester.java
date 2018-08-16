
/**
 * @author	BingLi224
 * @version	2018.08.14
 *
 * Testing of <code>contrainsKey</code> between <code>Double</code> object as the key of <code>HashMap</code> and new <code>Double</code> object.
 */
import java.util.HashMap;

public class HashMapDoubleKeyTester
{
	public static void main(String[] args)
	{
		Double d1 = new Double ( 123.456 );
		Double d2 = new Double ( 123.456 );
		Double d3 = new Double ( 123.456 );
		HashMap < Double, Double > h = new HashMap <Double,Double> ( );
		h.put ( d1, new Double ( 1 ) );
		h.put ( d2, new Double ( 10 ) );
		h.put ( d3, new Double ( 100 ) );

		System.out.println ( h.get ( new Double ( 1.0 ) ) );

		System.out.println ( "d1=" + d1.hashCode ( ) );
		System.out.println ( "d2=" + d3.hashCode ( ) );
		System.out.println ( "d3=" + d2.hashCode ( ) );
		System.out.println ( h.containsKey ( d1 ) );
		System.out.println ( h.containsKey ( d2 ) );
		System.out.println ( h.containsKey ( d3 ) );
		System.out.println ( h.containsKey ( new Double ( 123.456 ) ) );

		System.out.println ( h.containsKey ( new Double ( "123.456" ) ) );
	}
}
