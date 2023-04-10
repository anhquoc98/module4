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
insert into diploma()
values
('Giám đốc'),
('Thư kí'),
('Quản lý'),
('Nhân viên bán hàng'),
('Thực tập');
insert into positions()
values 
('Tiến sĩ'),
('Đại học'),
('Cao đẳng'),
('Trung cấp'),
('Không có');

insert into employee()
values
('Nguyễn Văn A','1989-12-11','Nam','1000','Đà Nẵng','0904324563','nguyenvana@gmail.com','https://giaydabongtot.com/wp-content/uploads/2020/10/Hinh-nen-ronaldo-cr7-may-tinh-laptop-3-scaled.jpg',1,1,1),
('Nguyễn Văn B','1989-12-11','Nam','1000','Đà Nẵng','0904324563','nguyenvanb@gmail.com','https://giaydabongtot.com/wp-content/uploads/2020/10/Hinh-nen-ronaldo-cr7-may-tinh-laptop-3-scaled.jpg',1,1,2),
('Nguyễn Văn C','1989-12-11','Nam','1000','Đà Nẵng','0904324563','nguyenvanc@gmail.com','https://giaydabongtot.com/wp-content/uploads/2020/10/Hinh-nen-ronaldo-cr7-may-tinh-laptop-3-scaled.jpg',1,1,3),
('Nguyễn Văn D','1989-12-11','Nam','1000','Đà Nẵng','0904324563','nguyenvand@gmail.com','https://giaydabongtot.com/wp-content/uploads/2020/10/Hinh-nen-ronaldo-cr7-may-tinh-laptop-3-scaled.jpg',1,1,3),
('Nguyễn Văn E','1989-12-11','Nam','1000','Đà Nẵng','0904324563','nguyenvane@gmail.com','https://giaydabongtot.com/wp-content/uploads/2020/10/Hinh-nen-ronaldo-cr7-may-tinh-laptop-3-scaled.jpg',1,1,2),
('Trần Văn A','1989-12-11','Nam','1000','Đà Nẵng','0904324563','nguyenvane@gmail.com','https://giaydabongtot.com/wp-content/uploads/2020/10/Hinh-nen-ronaldo-cr7-may-tinh-laptop-3-scaled.jpg',2,2,1),
('Trần Văn B','1989-12-11','Nam','1000','Đà Nẵng','0904324563','nguyenvane@gmail.com','https://giaydabongtot.com/wp-content/uploads/2020/10/Hinh-nen-ronaldo-cr7-may-tinh-laptop-3-scaled.jpg',2,2,2),
('Trần Văn C','1989-12-11','Nam','1000','Đà Nẵng','0904324563','nguyenvane@gmail.com','https://giaydabongtot.com/wp-content/uploads/2020/10/Hinh-nen-ronaldo-cr7-may-tinh-laptop-3-scaled.jpg',2,2,3),
('Trần Văn D','1989-12-11','Nam','1000','Đà Nẵng','0904324563','nguyenvane@gmail.com','https://giaydabongtot.com/wp-content/uploads/2020/10/Hinh-nen-ronaldo-cr7-may-tinh-laptop-3-scaled.jpg',2,2,3),
('Trần Văn E','1989-12-11','Nam','1000','Đà Nẵng','0904324563','nguyenvane@gmail.com','https://giaydabongtot.com/wp-content/uploads/2020/10/Hinh-nen-ronaldo-cr7-may-tinh-laptop-3-scaled.jpg',2,2,2),
('Lê Văn A','1989-12-11','Nam','1000','Đà Nẵng','0904324563','nguyenvane@gmail.com','https://giaydabongtot.com/wp-content/uploads/2020/10/Hinh-nen-ronaldo-cr7-may-tinh-laptop-3-scaled.jpg',3,3,1),
('Lê Văn B','1989-12-11','Nam','1000','Đà Nẵng','0904324563','nguyenvane@gmail.com','https://giaydabongtot.com/wp-content/uploads/2020/10/Hinh-nen-ronaldo-cr7-may-tinh-laptop-3-scaled.jpg',3,3,2),
('Lê Văn C','1989-12-11','Nam','1000','Đà Nẵng','0904324563','nguyenvane@gmail.com','https://giaydabongtot.com/wp-content/uploads/2020/10/Hinh-nen-ronaldo-cr7-may-tinh-laptop-3-scaled.jpg',3,3,3),
('Lê Văn D','1989-12-11','Nam','1000','Đà Nẵng','0904324563','nguyenvane@gmail.com','https://giaydabongtot.com/wp-content/uploads/2020/10/Hinh-nen-ronaldo-cr7-may-tinh-laptop-3-scaled.jpg',3,3,3),
('Lê Văn E','1989-12-11','Nam','1000','Đà Nẵng','0904324563','nguyenvane@gmail.com','https://giaydabongtot.com/wp-content/uploads/2020/10/Hinh-nen-ronaldo-cr7-may-tinh-laptop-3-scaled.jpg',3,3,2),
('Ngô Văn A','1989-12-11','Nam','1000','Đà Nẵng','0904324563','nguyenvane@gmail.com','https://giaydabongtot.com/wp-content/uploads/2020/10/Hinh-nen-ronaldo-cr7-may-tinh-laptop-3-scaled.jpg',4,4,1),
('Ngô Văn A','1989-12-11','Nam','1000','Đà Nẵng','0904324563','nguyenvane@gmail.com','https://giaydabongtot.com/wp-content/uploads/2020/10/Hinh-nen-ronaldo-cr7-may-tinh-laptop-3-scaled.jpg',4,4,2),
('Ngô Văn A','1989-12-11','Nam','1000','Đà Nẵng','0904324563','nguyenvane@gmail.com','https://giaydabongtot.com/wp-content/uploads/2020/10/Hinh-nen-ronaldo-cr7-may-tinh-laptop-3-scaled.jpg',4,4,3),
('Ngô Văn A','1989-12-11','Nam','1000','Đà Nẵng','0904324563','nguyenvane@gmail.com','https://giaydabongtot.com/wp-content/uploads/2020/10/Hinh-nen-ronaldo-cr7-may-tinh-laptop-3-scaled.jpg',4,4,2),
('Ngô Văn A','1989-12-11','Nam','1000','Đà Nẵng','0904324563','nguyenvane@gmail.com','https://giaydabongtot.com/wp-content/uploads/2020/10/Hinh-nen-ronaldo-cr7-may-tinh-laptop-3-scaled.jpg',4,4,3),
('Ngô Văn A','1989-12-11','Nam','1000','Đà Nẵng','0904324563','nguyenvane@gmail.com','https://giaydabongtot.com/wp-content/uploads/2020/10/Hinh-nen-ronaldo-cr7-may-tinh-laptop-3-scaled.jpg',5,5,1),
('Ngô Văn A','1989-12-11','Nam','1000','Đà Nẵng','0904324563','nguyenvane@gmail.com','https://giaydabongtot.com/wp-content/uploads/2020/10/Hinh-nen-ronaldo-cr7-may-tinh-laptop-3-scaled.jpg',5,5,1),
('Ngô Văn A','1989-12-11','Nam','1000','Đà Nẵng','0904324563','nguyenvane@gmail.com','https://giaydabongtot.com/wp-content/uploads/2020/10/Hinh-nen-ronaldo-cr7-may-tinh-laptop-3-scaled.jpg',5,5,1),
('Ngô Văn A','1989-12-11','Nam','1000','Đà Nẵng','0904324563','nguyenvane@gmail.com','https://giaydabongtot.com/wp-content/uploads/2020/10/Hinh-nen-ronaldo-cr7-may-tinh-laptop-3-scaled.jpg',5,5,1),
('Ngô Văn A','1989-12-11','Nam','1000','Đà Nẵng','0904324563','nguyenvane@gmail.com','https://giaydabongtot.com/wp-content/uploads/2020/10/Hinh-nen-ronaldo-cr7-may-tinh-laptop-3-scaled.jpg',5,5,1);
