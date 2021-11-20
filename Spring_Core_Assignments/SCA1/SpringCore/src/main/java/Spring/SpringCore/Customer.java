package Spring.SpringCore;

public class Customer {
	int cid;
	String cname;
	long cnum;
	Address address;
	
	public Customer() {
		
	}
	public Customer(Address address) {
		this.address=address;
	}
	public Customer(int cid, String cname, int cnum, Address address) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.cnum = cnum;
		this.address = address;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public long getCnum() {
		return cnum;
	}
	public void setCnum(long cnum) {
		this.cnum = cnum;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", cname=" + cname + ", cnum=" + cnum + ", address=" + address + "]";
	}
	public void myInit() {
		System.out.println("--------object initialized--------");
	}
	public void myDestroy() {
		System.out.println("-------object destroyed------");
	}


}
