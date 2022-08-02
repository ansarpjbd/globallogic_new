DBMS: SQL


@Login into DBMS using is username and password
@username : root
@password : root
--------------------------------------------------
#Create Database :

// create databse <databasename>
mysql>  create database buddy; 
#Query OK, 1 row affected (0.03 sec)

employee : Need to store below information
         1. Employee name 
		 2. Employee id 
		 3. salary , 
		 4. dept ,
		 5  father-name , 
		 6  address 

//you have to select the database under which you want under to create 
mysql>use buddy;
#Database changed

//create the table;
  //there can be multiple table in one database 
  
//create table <tablename>(col1 datatype1, col2 datatype2..........)
mysql> CREATE TABLE employee(id INT,name VARCHAR(100), fname VARCHAR(100), salary DOUBLE,deptid INT);
Query OK, 0 rows affected (0.29 sec)  

#view the tables;
>describe employee;
>desc employee;

//Fill with data 
//insert into employee(col1,col2.....) values (val1,val2....)  //you have give value for selected or custom column
//insert into employee values(val1,val2,val3...);  //you have to give value for all the coloumn 

mysql> INSERT INTO employee VALUES(1,'ravinder','kumar',1000,1);
Query OK, 1 row affected (0.27 sec)

#CRUD on data:
 //where condition
 //where col1 =val1


mysql>
sorting ,
 #select query
#select * from <tablename>
mysql> select * from employee;
+------+----------+-------+--------+--------+
| id   | name     | fname | salary | deptid |
+------+----------+-------+--------+--------+
|    1 | ravinder | kumar |   1000 |      1 |
|    2 | DINESH   | KUMAR |   2000 |      1 |
|    4 | priya    | RAM   |   3000 |      4 |
|    5 | komol    | TOM   |    500 |      1 |
+------+----------+-------+--------+--------+
4 rows in set (0.22 sec)

#update table employee set  col1=val1,col2-value2 where condition

#if condition is not given it will update all the values

mysql> select * from employee;
+------+----------+-------+--------+--------+
| id   | name     | fname | salary | deptid |
+------+----------+-------+--------+--------+
|    1 | ravinder | kumar |   1000 |      1 |
|    2 | DINESH   | KUMAR |   2000 |      1 |
|    4 | priya    | RAM   |   3000 |      4 |
|    5 | komol    | KKK   |    500 |      1 |
+------+----------+-------+--------+--------+
4 rows in set (0.00 sec)

//delete from table where condition
mysql> select * from employee;
+------+----------+-------+--------+--------+
| id   | name     | fname | salary | deptid |
+------+----------+-------+--------+--------+
|    1 | ravinder | kumar |   1000 |      1 |
|    2 | DINESH   | KUMAR |   2000 |      1 |
|    4 | priya    | RAM   |   3000 |      4 |
+------+----------+-------+--------+--------+
3 rows in set (0.00 sec)

 
 logical operator > <= >= 
binary  AND , OR  
>searching , 
mysql> select * from employee where salary > 2000
    -> ;
+------+-------+-------+--------+--------+
| id   | name  | fname | salary | deptid |
+------+-------+-------+--------+--------+
|    4 | priya | RAM   |   3000 |      4 |
+------+-------+-------+--------+--------+
1 row in set (0.01 sec)

mysql> select * from employee where salary => 2000
    -> ;
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near '=> 2000' at line 1
mysql> select * from employee where salary >= 2000
    -> ;
+------+--------+-------+--------+--------+
| id   | name   | fname | salary | deptid |
+------+--------+-------+--------+--------+
|    2 | DINESH | KUMAR |   2000 |      1 |
|    4 | priya  | RAM   |   3000 |      4 |
+------+--------+-------+--------+--------+
2 rows in set (0.00 sec)

 
mysql> select * from employee where name like '%A%';
+------+----------+-------+--------+--------+
| id   | name     | fname | salary | deptid |
+------+----------+-------+--------+--------+
|    1 | ravinder | kumar |   1000 |      1 |
|    4 | priya    | RAM   |   3000 |      4 |
+------+----------+-------+--------+--------+
2 rows in set (0.01 sec)


Relation Between two tables

#these are the keyword in sql when we add these it have some condition also:


Primary Key :
            #it will always hold the unique value
			#Not will nvever have the null value
Auto_Increment
            : it will incress the value by one every time
			: you will not give the value of this columun
Unique KEy : all the value of column is unquie
NOT NUll : it will hold the null or empty value
Foreign Key :it is special key which link one table col t another table 
            : there should be entry in the parent table before adding the id to child


inner Join--which will give the common data from both the tables


Enter password: ****
Welcome to the MySQL monitor.  Commands end with ; or \g.
Your MySQL connection id is 8
Server version: 8.0.25 MySQL Community Server - GPL

Copyright (c) 2000, 2021, Oracle and/or its affiliates.

Oracle is a registered trademark of Oracle Corporation and/or its
affiliates. Other names may be trademarks of their respective
owners.

Type 'help;' or '\h' for help. Type '\c' to clear the current input statement.

mysql> create database buddy
    -> ;
Query OK, 1 row affected (0.03 sec)

mysql> use buddy;
Database changed
mysql> CREATE TABLE employee(id INT,name VARCHAR(100), fname VARCHAR(100), salary DOUBLE,deptid INT);
Query OK, 0 rows affected (0.29 sec)

mysql> desc employee;
+--------+--------------+------+-----+---------+-------+
| Field  | Type         | Null | Key | Default | Extra |
+--------+--------------+------+-----+---------+-------+
| id     | int          | YES  |     | NULL    |       |
| name   | varchar(100) | YES  |     | NULL    |       |
| fname  | varchar(100) | YES  |     | NULL    |       |
| salary | double       | YES  |     | NULL    |       |
| deptid | int          | YES  |     | NULL    |       |
+--------+--------------+------+-----+---------+-------+
5 rows in set (0.07 sec)

mysql> INSERT INTO employee VALUES(1,'ravinder','kumar',1000,1);
Query OK, 1 row affected (0.27 sec)

mysql> INSERT INTO employee VALUES(2,'DINESH','KUMAR',2000,1);
Query OK, 1 row affected (0.01 sec)

mysql> INSERT INTO employee VALUES(4,'priya','RAM',3000,4);
Query OK, 1 row affected (0.01 sec)

mysql> INSERT INTO employee VALUES(5,'komol','TOM',500,1);
Query OK, 1 row affected (0.01 sec)

mysql> select * from employee;
+------+----------+-------+--------+--------+
| id   | name     | fname | salary | deptid |
+------+----------+-------+--------+--------+
|    1 | ravinder | kumar |   1000 |      1 |
|    2 | DINESH   | KUMAR |   2000 |      1 |
|    4 | priya    | RAM   |   3000 |      4 |
|    5 | komol    | TOM   |    500 |      1 |
+------+----------+-------+--------+--------+
4 rows in set (0.22 sec)

mysql> update employee set fname='KKK' where id=5;
Query OK, 1 row affected (0.01 sec)
Rows matched: 1  Changed: 1  Warnings: 0

mysql> select * from employee;
+------+----------+-------+--------+--------+
| id   | name     | fname | salary | deptid |
+------+----------+-------+--------+--------+
|    1 | ravinder | kumar |   1000 |      1 |
|    2 | DINESH   | KUMAR |   2000 |      1 |
|    4 | priya    | RAM   |   3000 |      4 |
|    5 | komol    | KKK   |    500 |      1 |
+------+----------+-------+--------+--------+
4 rows in set (0.00 sec)

mysql> delete from employee where id=5;
Query OK, 1 row affected (0.01 sec)

mysql> select * from employee;
+------+----------+-------+--------+--------+
| id   | name     | fname | salary | deptid |
+------+----------+-------+--------+--------+
|    1 | ravinder | kumar |   1000 |      1 |
|    2 | DINESH   | KUMAR |   2000 |      1 |
|    4 | priya    | RAM   |   3000 |      4 |
+------+----------+-------+--------+--------+
3 rows in set (0.00 sec)

mysql> INSERT INTO employee VALUES(5,'komol','TOM',500,1);
Query OK, 1 row affected (0.22 sec)

mysql> select * from employee where salary > 2000
    -> ;
+------+-------+-------+--------+--------+
| id   | name  | fname | salary | deptid |
+------+-------+-------+--------+--------+
|    4 | priya | RAM   |   3000 |      4 |
+------+-------+-------+--------+--------+
1 row in set (0.01 sec)

mysql> select * from employee where salary => 2000
    -> ;
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near '=> 2000' at line 1
mysql> select * from employee where salary >= 2000
    -> ;
+------+--------+-------+--------+--------+
| id   | name   | fname | salary | deptid |
+------+--------+-------+--------+--------+
|    2 | DINESH | KUMAR |   2000 |      1 |
|    4 | priya  | RAM   |   3000 |      4 |
+------+--------+-------+--------+--------+
2 rows in set (0.00 sec)

mysql> select * from employee where name like '%A%';
+------+----------+-------+--------+--------+
| id   | name     | fname | salary | deptid |
+------+----------+-------+--------+--------+
|    1 | ravinder | kumar |   1000 |      1 |
|    4 | priya    | RAM   |   3000 |      4 |
+------+----------+-------+--------+--------+
2 rows in set (0.01 sec)

mysql> create table dept(id int , name varchar(100));
Query OK, 0 rows affected (0.67 sec)

mysql> desc dept;
+-------+--------------+------+-----+---------+-------+
| Field | Type         | Null | Key | Default | Extra |
+-------+--------------+------+-----+---------+-------+
| id    | int          | YES  |     | NULL    |       |
| name  | varchar(100) | YES  |     | NULL    |       |
+-------+--------------+------+-----+---------+-------+
2 rows in set (0.01 sec)

mysql> drop dept;
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'dept' at line 1
mysql> drop table dept;
Query OK, 0 rows affected (0.37 sec)

mysql> create table dept(id int primary key auto_increment , name varchar(100));
Query OK, 0 rows affected (0.03 sec)

mysql> desc dept;
+-------+--------------+------+-----+---------+----------------+
| Field | Type         | Null | Key | Default | Extra          |
+-------+--------------+------+-----+---------+----------------+
| id    | int          | NO   | PRI | NULL    | auto_increment |
| name  | varchar(100) | YES  |     | NULL    |                |
+-------+--------------+------+-----+---------+----------------+
2 rows in set (0.00 sec)

mysql> insert into dept(name) values('IT');
Query OK, 1 row affected (0.01 sec)

mysql> insert into dept(name) values('SALE');
Query OK, 1 row affected (0.10 sec)

mysql> insert into dept(name) values('Marketing');
Query OK, 1 row affected (0.01 sec)

mysql> desc dept;
+-------+--------------+------+-----+---------+----------------+
| Field | Type         | Null | Key | Default | Extra          |
+-------+--------------+------+-----+---------+----------------+
| id    | int          | NO   | PRI | NULL    | auto_increment |
| name  | varchar(100) | YES  |     | NULL    |                |
+-------+--------------+------+-----+---------+----------------+
2 rows in set (0.00 sec)

mysql> selet
    ->
    -> * from dept;
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'selet

* from dept' at line 1
mysql> selet * from dept;
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'selet * from dept' at line 1
mysql> select * from dept;
+----+-----------+
| id | name      |
+----+-----------+
|  1 | IT        |
|  2 | SALE      |
|  3 | Marketing |
+----+-----------+
3 rows in set (0.00 sec)

mysql> alter table employee ADD Foreign key(deptid) references dept(id);
ERROR 1452 (23000): Cannot add or update a child row: a foreign key constraint fails (`buddy`.`#sql-1530_8`, CONSTRAINT `employee_ibfk_1` FOREIGN KEY (`deptid`) REFERENCES `dept` (`id`))
mysql> desc employee;
+--------+--------------+------+-----+---------+-------+
| Field  | Type         | Null | Key | Default | Extra |
+--------+--------------+------+-----+---------+-------+
| id     | int          | YES  |     | NULL    |       |
| name   | varchar(100) | YES  |     | NULL    |       |
| fname  | varchar(100) | YES  |     | NULL    |       |
| salary | double       | YES  |     | NULL    |       |
| deptid | int          | YES  |     | NULL    |       |
+--------+--------------+------+-----+---------+-------+
5 rows in set (0.01 sec)

mysql> alter table employee ADD constraint Foreign key(deptid) references dept(id);
ERROR 1452 (23000): Cannot add or update a child row: a foreign key constraint fails (`buddy`.`#sql-1530_8`, CONSTRAINT `employee_ibfk_1` FOREIGN KEY (`deptid`) REFERENCES `dept` (`id`))
mysql> alter table employee ADD constraint FK_deptid_id Foreign key(deptid) references dept(id);
ERROR 1452 (23000): Cannot add or update a child row: a foreign key constraint fails (`buddy`.`#sql-1530_8`, CONSTRAINT `FK_deptid_id` FOREIGN KEY (`deptid`) REFERENCES `dept` (`id`))
mysql> desc employee;
+--------+--------------+------+-----+---------+-------+
| Field  | Type         | Null | Key | Default | Extra |
+--------+--------------+------+-----+---------+-------+
| id     | int          | YES  |     | NULL    |       |
| name   | varchar(100) | YES  |     | NULL    |       |
| fname  | varchar(100) | YES  |     | NULL    |       |
| salary | double       | YES  |     | NULL    |       |
| deptid | int          | YES  |     | NULL    |       |
+--------+--------------+------+-----+---------+-------+
5 rows in set (0.01 sec)

mysql> desc dept;
+-------+--------------+------+-----+---------+----------------+
| Field | Type         | Null | Key | Default | Extra          |
+-------+--------------+------+-----+---------+----------------+
| id    | int          | NO   | PRI | NULL    | auto_increment |
| name  | varchar(100) | YES  |     | NULL    |                |
+-------+--------------+------+-----+---------+----------------+
2 rows in set (0.00 sec)

mysql> alter table employee ADD constraint FK_deptid_id Foreign key(id) references dept(deptid);
ERROR 3734 (HY000): Failed to add the foreign key constraint. Missing column 'deptid' for constraint 'FK_deptid_id' in the referenced table 'dept'
mysql> alter table employee ADD constraint FK_deptid_id Foreign key(deptid) references dept(deptid);
ERROR 3734 (HY000): Failed to add the foreign key constraint. Missing column 'deptid' for constraint 'FK_deptid_id' in the referenced table 'dept'
mysql> alter table employee ADD constraint FK_deptid_id Foreign key(deptid) references dept(id);
ERROR 1452 (23000): Cannot add or update a child row: a foreign key constraint fails (`buddy`.`#sql-1530_8`, CONSTRAINT `FK_deptid_id` FOREIGN KEY (`deptid`) REFERENCES `dept` (`id`))
mysql> delete from employee;
Query OK, 4 rows affected (0.01 sec)

mysql> select * from employee;
Empty set (0.00 sec)

mysql> alter table employee ADD constraint FK_deptid_id Foreign key(deptid) references dept(id);
Query OK, 0 rows affected (0.09 sec)
Records: 0  Duplicates: 0  Warnings: 0

mysql> INSERT INTO employee VALUES(1,'ravinder','kumar',1000,1);
Query OK, 1 row affected (0.01 sec)

mysql> INSERT INTO employee VALUES(2,'DINESH','KUMAR',2000,1);
Query OK, 1 row affected (0.01 sec)

mysql> INSERT INTO employee VALUES(3,'komol','TOM',500,5);
ERROR 1452 (23000): Cannot add or update a child row: a foreign key constraint fails (`buddy`.`employee`, CONSTRAINT `FK_deptid_id` FOREIGN KEY (`deptid`) REFERENCES `dept` (`id`))
mysql> select * from dept;
+----+-----------+
| id | name      |
+----+-----------+
|  1 | IT        |
|  2 | SALE      |
|  3 | Marketing |
+----+-----------+
3 rows in set (0.01 sec)

mysql> INSERT INTO employee VALUES(3,'komol','TOM',500,3);
Query OK, 1 row affected (0.11 sec)

mysql> select * from employee;
+------+----------+-------+--------+--------+
| id   | name     | fname | salary | deptid |
+------+----------+-------+--------+--------+
|    1 | ravinder | kumar |   1000 |      1 |
|    2 | DINESH   | KUMAR |   2000 |      1 |
|    3 | komol    | TOM   |    500 |      3 |
+------+----------+-------+--------+--------+
3 rows in set (0.00 sec)

mysql> select * from dept;
+----+-----------+
| id | name      |
+----+-----------+
|  1 | IT        |
|  2 | SALE      |
|  3 | Marketing |
+----+-----------+
3 rows in set (0.00 sec)

mysql> select * from employee inner join dept on employee.deptid=dept.id;
+------+----------+-------+--------+--------+----+-----------+
| id   | name     | fname | salary | deptid | id | name      |
+------+----------+-------+--------+--------+----+-----------+
|    1 | ravinder | kumar |   1000 |      1 |  1 | IT        |
|    2 | DINESH   | KUMAR |   2000 |      1 |  1 | IT        |
|    3 | komol    | TOM   |    500 |      3 |  3 | Marketing |
+------+----------+-------+--------+--------+----+-----------+
3 rows in set (0.00 sec)

mysql> select employee.name,dept.name from employee inner join dept on employee.deptid=dept.id;
+----------+-----------+
| name     | name      |
+----------+-----------+
| ravinder | IT        |
| DINESH   | IT        |
| komol    | Marketing |
+----------+-----------+
3 rows in set (0.00 sec)

mysql> select e.name,d.name from employee e inner join dept d on e.deptid=d.id;
+----------+-----------+
| name     | name      |
+----------+-----------+
| ravinder | IT        |
| DINESH   | IT        |
| komol    | Marketing |
+----------+-----------+
3 rows in set (0.00 sec)

mysql> select e.name,d.name from employee as e inner join dept as d on e.deptid=d.id;
+----------+-----------+
| name     | name      |
+----------+-----------+
| ravinder | IT        |
| DINESH   | IT        |
| komol    | Marketing |
+----------+-----------+
3 rows in set (0.00 sec)

mysql> select e.name,d.name from employee as e full join dept
    -> ;
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'full join dept' at line 1
mysql> select e.name,d.name from employee as e full outer  join dept
    -> ;
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'full outer  join dept' at line 1
mysql> select e.name,d.name from employee as e join dept s;
ERROR 1054 (42S22): Unknown column 'd.name' in 'field list'
mysql> select e.name,d.name from employee as e join dept d;
+----------+-----------+
| name     | name      |
+----------+-----------+
| ravinder | Marketing |
| ravinder | SALE      |
| ravinder | IT        |
| DINESH   | Marketing |
| DINESH   | SALE      |
| DINESH   | IT        |
| komol    | Marketing |
| komol    | SALE      |
| komol    | IT        |
+----------+-----------+
9 rows in set (0.02 sec)

mysql> insert into dept (name) values('R&D');
Query OK, 1 row affected (0.01 sec)

mysql> select * from dept;
+----+-----------+
| id | name      |
+----+-----------+
|  1 | IT        |
|  2 | SALE      |
|  3 | Marketing |
|  4 | R&D       |
+----+-----------+
4 rows in set (0.01 sec)

mysql> select employee.name,dept.name from employee left join dept on employee.deptid=dept.id;
+----------+-----------+
| name     | name      |
+----------+-----------+
| ravinder | IT        |
| DINESH   | IT        |
| komol    | Marketing |
+----------+-----------+
3 rows in set (0.01 sec)

mysql> INSERT INTO employee(id,name,salary) VALUES(7,'komol','TOM',500);
ERROR 1136 (21S01): Column count doesn't match value count at row 1
mysql> INSERT INTO employee(id,name,,fname,salary) VALUES(7,'komol','TOM',500);
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near ',fname,salary) VALUES(7,'komol','TOM',500)' at line 1
mysql> INSERT INTO employee(id,name,fname,salary) VALUES(7,'komol','TOM',500);
Query OK, 1 row affected (0.26 sec)

mysql> select * from employee;
+------+----------+-------+--------+--------+
| id   | name     | fname | salary | deptid |
+------+----------+-------+--------+--------+
|    1 | ravinder | kumar |   1000 |      1 |
|    2 | DINESH   | KUMAR |   2000 |      1 |
|    3 | komol    | TOM   |    500 |      3 |
|    7 | komol    | TOM   |    500 |   NULL |
+------+----------+-------+--------+--------+
4 rows in set (0.00 sec)

mysql> INSERT INTO employee(id,name,fname,salary) VALUES(8,'tom','TOM',500);
Query OK, 1 row affected (0.01 sec)

mysql> select * from employee;
+------+----------+-------+--------+--------+
| id   | name     | fname | salary | deptid |
+------+----------+-------+--------+--------+
|    1 | ravinder | kumar |   1000 |      1 |
|    2 | DINESH   | KUMAR |   2000 |      1 |
|    3 | komol    | TOM   |    500 |      3 |
|    7 | komol    | TOM   |    500 |   NULL |
|    8 | tom      | TOM   |    500 |   NULL |
+------+----------+-------+--------+--------+
5 rows in set (0.00 sec)

mysql> select employee.name,dept.name from employee left join dept on employee.deptid=dept.id;
+----------+-----------+
| name     | name      |
+----------+-----------+
| ravinder | IT        |
| DINESH   | IT        |
| komol    | Marketing |
| komol    | NULL      |
| tom      | NULL      |
+----------+-----------+
5 rows in set (0.00 sec)

mysql> select employee.name,dept.name from employee right join dept on employee.deptid=dept.id;
+----------+-----------+
| name     | name      |
+----------+-----------+
| ravinder | IT        |
| DINESH   | IT        |
| NULL     | SALE      |
| komol    | Marketing |
| NULL     | R&D       |
+----------+-----------+
5 rows in set (0.00 sec)

mysql> select max(salary) from employee;
+-------------+
| max(salary) |
+-------------+
|        2000 |
+-------------+
1 row in set (0.01 sec)

mysql> select min(salary) from employee;
+-------------+
| min(salary) |
+-------------+
|         500 |
+-------------+
1 row in set (0.00 sec)

mysql> select name, min(salary) from employee;
+----------+-------------+
| name     | min(salary) |
+----------+-------------+
| ravinder |         500 |
+----------+-------------+
1 row in set (0.00 sec)

mysql> select  sum(salary) from employee;
+-------------+
| sum(salary) |
+-------------+
|        4500 |
+-------------+
1 row in set (0.01 sec)

mysql> select  avg(salary) from employee;
+-------------+
| avg(salary) |
+-------------+
|         900 |
+-------------+
1 row in set (0.00 sec)

mysql> select  *  from employe orderby salary;
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'salary' at line 1
mysql> select  *  from employe order by salary;
ERROR 1146 (42S02): Table 'buddy.employe' doesn't exist
mysql> select  *  from employee order by salary;
+------+----------+-------+--------+--------+
| id   | name     | fname | salary | deptid |
+------+----------+-------+--------+--------+
|    3 | komol    | TOM   |    500 |      3 |
|    7 | komol    | TOM   |    500 |   NULL |
|    8 | tom      | TOM   |    500 |   NULL |
|    1 | ravinder | kumar |   1000 |      1 |
|    2 | DINESH   | KUMAR |   2000 |      1 |
+------+----------+-------+--------+--------+
5 rows in set (0.00 sec)

mysql> select  *  from employee order by salary asc;
+------+----------+-------+--------+--------+
| id   | name     | fname | salary | deptid |
+------+----------+-------+--------+--------+
|    3 | komol    | TOM   |    500 |      3 |
|    7 | komol    | TOM   |    500 |   NULL |
|    8 | tom      | TOM   |    500 |   NULL |
|    1 | ravinder | kumar |   1000 |      1 |
|    2 | DINESH   | KUMAR |   2000 |      1 |
+------+----------+-------+--------+--------+
5 rows in set (0.00 sec)

mysql> select  *  from employee order by salary desc;
+------+----------+-------+--------+--------+
| id   | name     | fname | salary | deptid |
+------+----------+-------+--------+--------+
|    2 | DINESH   | KUMAR |   2000 |      1 |
|    1 | ravinder | kumar |   1000 |      1 |
|    3 | komol    | TOM   |    500 |      3 |
|    7 | komol    | TOM   |    500 |   NULL |
|    8 | tom      | TOM   |    500 |   NULL |
+------+----------+-------+--------+--------+
5 rows in set (0.00 sec)

mysql> select  *  from employee group by deptid;
+------+----------+-------+--------+--------+
| id   | name     | fname | salary | deptid |
+------+----------+-------+--------+--------+
|    7 | komol    | TOM   |    500 |   NULL |
|    1 | ravinder | kumar |   1000 |      1 |
|    3 | komol    | TOM   |    500 |      3 |
+------+----------+-------+--------+--------+
3 rows in set (0.25 sec)

mysql> select  *  from employee group by deptid and deptid=1;
+------+----------+-------+--------+--------+
| id   | name     | fname | salary | deptid |
+------+----------+-------+--------+--------+
|    1 | ravinder | kumar |   1000 |      1 |
|    3 | komol    | TOM   |    500 |      3 |
|    7 | komol    | TOM   |    500 |   NULL |
+------+----------+-------+--------+--------+
3 rows in set (0.01 sec)

mysql>alter table employee modify id add primary key ;
     alter table employee ADD deptname int primary key ;






























































































































































































































































































































































































  