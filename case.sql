SELECT * FROM customer.customer;
create table positions(
id_position int primary key auto_increment,
name_position varchar(45) not null
);
create table diploma(
id_diloma int primary key auto_increment,
name_diloma varchar(255) not null
);


create table employee(
id_employee int primary key auto_increment,
name_employee varchar(255) not null,
date_of_birth date not null,
gender varchar(45) not null,
salary double not null,
address varchar(255) not null,
phone_number varchar(45) not null,
email_employee varchar(255) not null,
img text,
id_diploma int,
id_position int,
id_branch int,
foreign key(id_position) references positions(id_position),
foreign key(id_diploma) references diploma(id_dimloma),
foreign key(id_branch) references branch(id_branch)
);

insert into diploma(name_diloma)
values
('Giám đốc'),
('Thư kí'),
('Quản lý'),
('Nhân viên bán hàng'),
('Thực tập');
insert into positions(name_position)
values
('Tiến sĩ'),
('Đại học'),
('Cao đẳng'),
('Trung cấp'),
('Không có');
insert into employee(name_employee,date_of_birth,gender,salary,address,phone_number,email_employee,img,id_diploma,id_position ,id_branch )
values
('Nguyễn Văn An','1970-11-07','Nam','5000','295 Nguyễn Tất Thành, Đà Nẵng','0901234121','annguyen@gmail.com','https://giaydabongtot.com/wp-content/uploads/2020/10/Hinh-nen-ronaldo-cr7-may-tinh-laptop-3-scaled.jpg',1,1,1),
('Lê Văn Bình','1997-04-09','Nam','2000','22 Yên Bái, Đà Nẵng','0934212314','binhlv@gmail.com','https://giaydabongtot.com/wp-content/uploads/2020/10/Hinh-nen-ronaldo-cr7-may-tinh-laptop-3-scaled.jpg',1,1,2),
('Hồ Thị Yến','1995-12-12','Nữ','3000','K234/11 Điện Biên Phủ, Gia Lai','0412352315','thiyen@gmail.com','https://giaydabongtot.com/wp-content/uploads/2020/10/Hinh-nen-ronaldo-cr7-may-tinh-laptop-3-scaled.jpg',1,1,3),
('Võ Công Toản','1980-04-04','Nam','1000','77 Hoàng Diệu, Quảng Trị','0374443232','toan0404@gmail.com','https://giaydabongtot.com/wp-content/uploads/2020/10/Hinh-nen-ronaldo-cr7-may-tinh-laptop-3-scaled.jpg',1,1,3),
('Nguyễn Bỉnh Phát','1999-12-09','Nam','500','43 Yên Bái, Đà Nẵng','0902341231','phatphat@gmail.com','https://giaydabongtot.com/wp-content/uploads/2020/10/Hinh-nen-ronaldo-cr7-may-tinh-laptop-3-scaled.jpg',1,1,2),
('Khúc Nguyễn An Nghi','2000-11-08','Nam','5000','294 Nguyễn Tất Thành, Đà Nẵng','0978653213','annghi20@gmail.com','https://giaydabongtot.com/wp-content/uploads/2020/10/Hinh-nen-ronaldo-cr7-may-tinh-laptop-3-scaled.jpg',2,2,1),
('Nguyễn Hữu Hà','1993-01-01','Nam','3000','4 Nguyễn Chí Thanh, Huế','0941234553','nhh0101@gmail.com','https://giaydabongtot.com/wp-content/uploads/2020/10/Hinh-nen-ronaldo-cr7-may-tinh-laptop-3-scaled.jpg',2,2,2),
('Nguyễn Hà Đông','1989-09-03','Nam','2000','111 Hùng Vương, Hà Nội','0642123111','donghanguyen@gmail.com','https://giaydabongtot.com/wp-content/uploads/2020/10/Hinh-nen-ronaldo-cr7-may-tinh-laptop-3-scaled.jpg',2,2,3),
('Tòng Hoang','1982-09-03','Nam','1000','213 Hàm Nghi, Đà Nẵng','0245144444','hoangtong@gmail.com','https://giaydabongtot.com/wp-content/uploads/2020/10/Hinh-nen-ronaldo-cr7-may-tinh-laptop-3-scaled.jpg',2,2,3),
('Nguyễn Công Đạo','1994-01-08','Nam','500','6 Hoà Khánh, Đồng Nai','0988767111','nguyencongdao12@gmail.com','https://giaydabongtot.com/wp-content/uploads/2020/10/Hinh-nen-ronaldo-cr7-may-tinh-laptop-3-scaled.jpg',2,2,2),
('Nguyễn Thị Hào','1970-11-07','Nữ','5000','23 Nguyễn Hoàng, Đà Nẵng','0945423362','thihao07@gmail.com','https://giaydabongtot.com/wp-content/uploads/2020/10/Hinh-nen-ronaldo-cr7-may-tinh-laptop-3-scaled.jpg',3,3,1),
('Phạm Xuân Diệu','1992-08-08','Nam','3000','K77/22 Thái Phiên, Quảng Trị','0954333333','xuandieu92@gmail.com','https://giaydabongtot.com/wp-content/uploads/2020/10/Hinh-nen-ronaldo-cr7-may-tinh-laptop-3-scaled.jpg',3,3,2),
('Trương Đình Nghệ','1989-12-11','Nam','2000','K323/12 Ông Ích Khiêm, Vinh','0373213122','nghenhan2702@gmail.com','https://giaydabongtot.com/wp-content/uploads/2020/10/Hinh-nen-ronaldo-cr7-may-tinh-laptop-3-scaled.jpg',3,3,3),
('Dương Văn Quan','1981-07-08','Nam','1000','K453/12 Lê Lợi, Đà Nẵng','0490039241','duongquan@gmail.com','https://giaydabongtot.com/wp-content/uploads/2020/10/Hinh-nen-ronaldo-cr7-may-tinh-laptop-3-scaled.jpg',3,3,3),
('Hoàng Trần Nhi Nhi','1995-12-09','Nữ','500','224 Lý Thái Tổ, Gia Lai','0312345678','nhinhi123@gmail.com','https://giaydabongtot.com/wp-content/uploads/2020/10/Hinh-nen-ronaldo-cr7-may-tinh-laptop-3-scaled.jpg',3,3,2),
('Tôn Nữ Mộc Châu','2005-12-06','Nữ','5000','37 Yên Thế, Đà Nẵng','0988888844','tonnuchau@gmail.com','https://giaydabongtot.com/wp-content/uploads/2020/10/Hinh-nen-ronaldo-cr7-may-tinh-laptop-3-scaled.jpg',4,4,1),
('Nguyễn Mỹ Kim','1984-04-08','Nữ','3000','K123/45 Lê Lợi, Hồ Chí Minh','0912345698','kimcuong84@gmail.com','https://giaydabongtot.com/wp-content/uploads/2020/10/Hinh-nen-ronaldo-cr7-may-tinh-laptop-3-scaled.jpg',4,4,2),
('Nguyễn Thị Hào','1999-04-08','Nữ','2000','55 Nguyễn Văn Linh, Kon Tum','0763212345','haohao99@gmail.com','https://giaydabongtot.com/wp-content/uploads/2020/10/Hinh-nen-ronaldo-cr7-may-tinh-laptop-3-scaled.jpg',4,4,3),
('Trần Đại Danh','1994-07-01','Nam','1000','24 Lý Thường Kiệt, Quảng Ngãi','0643343433','danhhai99@gmail.com','https://giaydabongtot.com/wp-content/uploads/2020/10/Hinh-nen-ronaldo-cr7-may-tinh-laptop-3-scaled.jpg',4,4,2),
('Nguyễn Tâm Đắc','1989-07-01','Nam','500','22 Ngô Quyền, Đà Nẵng','0987654321','dactam@gmail.com','https://giaydabongtot.com/wp-content/uploads/2020/10/Hinh-nen-ronaldo-cr7-may-tinh-laptop-3-scaled.jpg',4,4,3),
('Trần Thị Dung','1989-12-11','Nữ','5000','88 Hồ Nghinh, Đà Nẵng','0907326463','dungtran@gmail.com','https://giaydabongtot.com/wp-content/uploads/2020/10/Hinh-nen-ronaldo-cr7-may-tinh-laptop-3-scaled.jpg',5,5,1),
('Nguyễn Phan Bảo Hoàng','1998-11-11','Nam','3000','22 Phan Thanh, Đà Nẵng','0998311563','hoangbaophan@gmail.com','https://giaydabongtot.com/wp-content/uploads/2020/10/Hinh-nen-ronaldo-cr7-may-tinh-laptop-3-scaled.jpg',5,5,1),
('Nguyễn Thị Bích Ngọc','1996-10-11','Nữ','2000','121 Tố Hữu, Đà Nẵng','0903111563','bichngoc@gmail.com','https://giaydabongtot.com/wp-content/uploads/2020/10/Hinh-nen-ronaldo-cr7-may-tinh-laptop-3-scaled.jpg',5,5,1),
('Tạ Đình Vũ Đàm','1997-07-11','Nam','1000','111 Phan Tứ, Đà Nẵng','0905323563','damvuta@gmail.com','https://giaydabongtot.com/wp-content/uploads/2020/10/Hinh-nen-ronaldo-cr7-may-tinh-laptop-3-scaled.jpg',5,5,1),
('Nguyễn Thị Hương Trà','1999-02-11','Nữ','500','453 Bạch Đằng, Đà Nẵng','0909124863','huongtra@gmail.com','https://giaydabongtot.com/wp-content/uploads/2020/10/Hinh-nen-ronaldo-cr7-may-tinh-laptop-3-scaled.jpg',5,5,1);