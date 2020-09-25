
public class SingerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Singers singer1 = new Singers();
		System.out.println("Displaying with default values");
		System.out.println(singer1._id);
		System.out.println(singer1._name);
		System.out.println(singer1._address);
		System.out.println(singer1._dob);
		System.out.println(singer1._noOfAlbumsPublished);

		// setting values with one setter that would allow to set all the values of the
		// instance variables at once
		singer1.setValues(101, "John", "Toronto", "22-Jan-1997", 4);

		System.out.println("Displaying after setting the values");
		System.out.println(singer1._id);
		System.out.println(singer1._name);
		System.out.println(singer1._address);
		System.out.println(singer1._dob);
		System.out.println(singer1._noOfAlbumsPublished);
	}

}
