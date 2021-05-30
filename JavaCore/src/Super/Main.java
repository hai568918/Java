package Super;

public class Main {
	public static void main(String[] args) {
		HinhChuNhat hcn = new HinhVuong();
		HinhVuong hv = new HinhVuong();
		hv.setChieuDai(3);
		hv.setChieuDai(4);
		
		
		
		hv.setCanh(3);
		System.out.println(hv.tinhDienTich());
		System.out.println(hv.tinhChuVi());
		
		hv.thayDoiGiaTriCanhHCN();
		System.out.println(hcn.getChieuDai());
		
		
	}
}
