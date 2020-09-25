
public class Singers {
	int _id;
	String _name;
	String _address;
	String _dob;
	int _noOfAlbumsPublished;

	// Several overloaded constructors

	// no arguments
	public Singers() {

	}

	// 1 argument
	public Singers(int id) {
		_id = id;
	}

	// 2 arguments
	public Singers(int id, String name) {
		_id = id;
		_name = name;
	}

	// 3 arguments
	public Singers(int id, String name, String address) {
		_id = id;
		_name = name;
		_address = address;
	}

	// 4 arguments
	public Singers(int id, String name, String address, String dob) {
		_id = id;
		_name = name;
		_address = address;
		_dob = dob;
	}

	// 5 arguments
	public Singers(int id, String name, String address, String dob, int noOfAlbumsPublished) {
		_id = id;
		_name = name;
		_address = address;
		_dob = dob;
		_noOfAlbumsPublished = noOfAlbumsPublished;
	}

	// Setters and getters for all the instance variables

	// getter
	public int getId() {
		return _id;
	}

	// setter
	public void setId(int newId) {
		_id = newId;
	}

	// getter
	public String getName() {
		return _name;
	}

	// setter
	public void setName(String newName) {
		_name = newName;
	}

	// getter
	public String getAddress() {
		return _address;
	}

	// setter
	public void setAddress(String newAddress) {
		_address = newAddress;
	}

	// getter
	public String getDob() {
		return _dob;
	}

	// setter
	public void setDob(String newDob) {
		_dob = newDob;
	}

	// getter
	public int getNoOfAlbumsPublished() {
		return _noOfAlbumsPublished;
	}

	// setter
	public void setNoOfAlbumsPublished(int newNoOfAlbumsPublished) {
		_noOfAlbumsPublished = newNoOfAlbumsPublished;
	}

	// one setter that would allow you to set all the values of the instance
	// variables at once
	public void setValues(int newid, String newname, String newaddress, String newdob, int newnoOfAlbumsPublished) {
		_id = newid;
		_name = newname;
		_address = newaddress;
		_dob = newdob;
		_noOfAlbumsPublished = newnoOfAlbumsPublished;
	}
}
