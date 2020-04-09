﻿DROP DATABASE Ass_Java4
go
CREATE DATABASE Ass_Java4
go
USE Ass_Java4

go

DROP TABLE Users
go
CREATE TABLE Users(
UserName nvarchar(50) not null,
Password nvarchar(50) null,
Ten nvarchar(50) null,
SDT nvarchar(50) null,
Permission nvarchar(50) null,

CONSTRAINT PK_KhachHang PRIMARY KEY (UserName)
)

DELETE FROM Users
INSERT INTO Users(UserName,Password,Ten,SDT,Permission) VALUES('abc','123',N'Anh Bảo Cảu','012345679','nv')
INSERT INTO Users(UserName,Password,Ten,SDT,Permission) VALUES('abd','123',N'Anh bảo Deo','012345678','nv')
INSERT INTO Users(UserName,Password,Ten,SDT,Permission) VALUES('xyz','123',N'XYX','012345678','nv')
INSERT INTO Users(UserName,Password,Ten,SDT,Permission) VALUES('uic','123',N'UI IA CE','012345678','nv')
INSERT INTO Users(UserName,Password,Ten,SDT,Permission) VALUES('HuynhManhThang','123',N'Huỳnh Mạnh Thắng','012345679','admin')
INSERT INTO Users(UserName,Password,Ten,SDT,Permission) VALUES('NguyenAnhDuc','123',N'Nguyễn Anh Đức','012345678','admin')
INSERT INTO Users(UserName,Password,Ten,SDT,Permission) VALUES('NguyenCuongThinh','123',N'Nguyễn Cường Thịnh','012345678','admin')
INSERT INTO Users(UserName,Password,Ten,SDT,Permission) VALUES('admin','123',N'admin','012345678','admin')


IF OBJECT_ID('SANPHAM') IS NOT NULL
	DROP TABLE SANPHAM
GO
CREATE TABLE SANPHAM
(
	MASP	NVARCHAR (20) NOT NULL,
	TENSP	NVARCHAR(30) NULL,	
	GIA NVARCHAR (50) NULL,
	

CONSTRAINT PK_SANPHAM PRIMARY KEY(MASP)
)
delete from SANPHAM
insert into SANPHAM values('SP01',N'IPHONE11','1000000')
insert into SANPHAM values('SP02',N'SAMSUNGA90','20000')
insert into SANPHAM values('SP03',N'ASUS6','400000')

SELECT * FROM Users
SELECT * FROM SANPHAM