package Bean;

public class jiben {
	String Rid;
	public String getRid() {
		return Rid;
	}
	public void setRid(String rid) {
		Rid = rid;
	}
	public String getRname() {
		return Rname;
	}
	public void setRname(String rname) {
		Rname = rname;
	}
	public String getRloc() {
		return Rloc;
	}
	public void setRloc(String rloc) {
		Rloc = rloc;
	}
	public String getRnum() {
		return Rnum;
	}
	public void setRnum(String rnum) {
		if(rnum.equals("A")) {
			Rnum="30";
		}
		else if(rnum.equals("B")) {
			Rnum="20";
		}
		else if(rnum.equals("B")) {
			Rnum="10";
		}
	}
	public String getRzt() {
		return Rzt;
	}
	public void setRzt(String rzt) {
		Rzt = rzt;
	}
	public String getRusezt() {
		return RUsezt;
	}
	public void setRusezt(String rUsezt) {
		RUsezt = rUsezt;
	}
	String Rname;
	String Rloc;
	String Rnum;
	String Rzt;
	String RUsezt;
}
