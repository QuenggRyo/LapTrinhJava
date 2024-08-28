package vnua.fita.practice.bai3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Nguoi {
	protected String hoTen;
	protected Date ngaySinh;
	protected String queQuan;
	
	public Nguoi() {}
	
	public Nguoi(String hoTen, Date ngaySinh) {
		this.hoTen = hoTen;
		this.ngaySinh = ngaySinh;
	}
	
	public Nguoi(String hoTen, Date ngaySinh, String queQuan) {
		this(hoTen, ngaySinh);
		this.queQuan = queQuan;
	}
	
	public void nhapThongTin(Scanner sc) {
		System.out.print("Nhập họ tên: ");
		hoTen = sc.nextLine();
		
		System.out.print("Nhập ngày sinh (dd/mm/yyyy): ");
		String ngaySinhStr = sc.nextLine();
		ngaySinh = stringToDate(ngaySinhStr);
		
		System.out.print("Nhập quê quán: ");
		queQuan = sc.nextLine();
	}
	
	public Date stringToDate(String ngaySinhStr) {
		Date ngaySinhDate = null;
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		try {
			ngaySinhDate = sdf.parse(ngaySinhStr);
		} catch (ParseException e) {
			e.printStackTrace();
			System.out.println("Lỗi định dạng ngày sinh");
		}
		return ngaySinhDate;
	}
	
	public void inThongTin() {
		System.out.println(hoTen);
		System.out.println(ngaySinh);
		System.out.println(queQuan);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Nguoi ng = new Nguoi();
		ng.nhapThongTin(sc);
		ng.inThongTin();
	}
}