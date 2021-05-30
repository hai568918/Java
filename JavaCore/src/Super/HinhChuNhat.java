package Super;

public class HinhChuNhat {
	private int chieuDai;
	private int chieuRong;
	public int getChieuDai() {
		return chieuDai;
	}
	public void setChieuDai(int i) {
		this.chieuDai = i;
	}
	public int getChieuRong() {
		return chieuRong;
	}
	public void setChieuRong(int chieuRong) {
		this.chieuRong = chieuRong;
	}
	
	public int tinhDienTich() {
		System.out.println("Dien Tich Hinh CN");
		return chieuDai*chieuRong;
	}
	
	public int tinhChuVi() {
		System.out.println("Chu vi Hinh CN");
		return (chieuDai + chieuRong) * 2;
	}
	
}
