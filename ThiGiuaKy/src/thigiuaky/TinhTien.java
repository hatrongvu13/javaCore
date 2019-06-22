package thigiuaky;

public class TinhTien {
	private int st;
	private int ed;
	public TinhTien(int st, int ed) {
		this.st = st;
		this.ed = ed;
	}
	public int getSt() {
		return st;
	}
	public void setSt(int st) {
		this.st = st;
	}
	public int getEd() {
		return ed;
	}
	public void setEd(int ed) {
		this.ed = ed;
	}
	public double tinhtien() {
		int time = this.ed - this.st;
		double money;
		if(time<=1) {
			money = time*60000;
		}else if(time  > 1 & time < 4) {
			money = time*60000*0.8;
		}else {
			money = time*60000*0.6;
		}
		return money;
	}
}
