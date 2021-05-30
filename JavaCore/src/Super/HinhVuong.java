package Super;

public class HinhVuong extends HinhChuNhat {
	private int canh;

	public int getCanh() {
		return canh;
	}

	public void setCanh(int canh) {
		this.canh = canh;
	}

	public int tinhDienTich() {
		super.tinhDienTich();
		System.out.println("Dien Tich Hinh Vuong");
		return canh * canh;
	}

	public int tinhChuVi() {
		super.tinhChuVi();
		System.out.println("Chu vi Hinh Vuong");
		return canh * 4;
	}
	
	public void thayDoiGiaTriCanhHCN(){
		super.setChieuDai(7);
		super.setChieuRong(7);
	}
}
