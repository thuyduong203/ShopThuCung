CREATE DATABASE ShopThuCung
GO
USE ShopThuCung
GO
-- Bảng Nhân viên
create TABLE NhanVien
(
	maNV nvarchar(50) primary key,
	tenNV nvarchar(50) ,
	chucVu nvarchar(50) ,
	email nvarchar(50) ,
	soDienThoai varchar(10),
	diaChi nvarchar(max) ,
	gioiTinh bit , --0 :nam , 1:nữ
	Luong money ,
	namSinh date ,
	matKhau varchar(100)
);
-- Bảng khách hàng
CREATE TABLE KhachHang
(
	maKH nvarchar(50)  primary key,
	tenKH nvarchar(50) ,
	soDT varchar(10) ,
	email nvarchar(50) ,
	diaChi nvarchar(max) ,
	gioiTinh bit, --0 :nam , 1:nữ
);
--Tạo bảng thú cưng
CREATE TABLE ThuCung
(
	maThuCung nvarchar(50) primary key,
	soLuong int ,
	giongLoai nvarchar(50),
	mauLong nvarchar(50),
	gia money ,
	gioiTinh bit --0: Đực, 1: Cái 
);
--Tạo bảng hóa đơn
CREATE TABLE HoaDon
(
	maHoaDon nvarchar(50)  primary key,
	maKH nvarchar(50) not null references KHACHHANG(maKH),
	maNV nvarchar(50) not null references NhanVien(maNV),
	ngayTao date,
	trangThang nvarchar(max)
);
--Tạo bảng hóa đơn chi tiết
CREATE TABLE HoaDonChiTiet
(
	maThuCung nvarchar(50)  references THUCUNG(maThuCung),
	maHoaDon nvarchar(50)  references HOADON(maHoaDon),
	soLuong int ,
	donGia money,
	tongTien money ,
	primary key(maHoaDon, maThuCung)
);
--Nhân viên:
INSERT INTO [dbo].[NhanVien]
           ([maNV],[tenNV] ,[chucVu],[email],[soDienThoai] ,[diaChi],[gioiTinh],[Luong],[namSinh]
           ,[matKhau])
 VALUES
           ('QL001','Quan Ly 1',N'Quản lý','quanLy1@gmail.com','01234567'
            ,'Ha Noi',0,3000,'2000-01-01','12345')   

