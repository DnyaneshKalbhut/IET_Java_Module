
public class Player {

	private int pid;
	private String pname;
	private String speciality;
	public Player() {
		super();
}
	public Player(int pid, String pname, String speciality) {
		this.pid = pid;
		this.pname = pname;
		this.speciality = speciality;		
	}

	public int getPid() {
	    return pid;

}
	public String getPname() {
		return pname;
	}
	public String getspeciality() {
		return speciality;
	}
	
	public void setId(int pid) {
		this.pid=pid;
	}
	
	public void setPname(String pname) {
		this.pname=pname;
	}
	public void setSpeciality(String speciality) {
		this.speciality=speciality;
	}
	public String toString() {
		return "Player[pid ="+ pid + ",pname ="+pname+",speciality="+speciality+"]";
	}
}
