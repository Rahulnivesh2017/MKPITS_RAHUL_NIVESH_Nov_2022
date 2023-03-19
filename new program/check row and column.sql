//check row and column



mysql> create table student(srno int(10),name varchar(20),rollno int(10),branch varchar(30));
Query OK, 0 rows affected (0.03 sec)

mysql> desc student;
+--------+-------------+------+-----+---------+-------+
| Field  | Type        | Null | Key | Default | Extra |
+--------+-------------+------+-----+---------+-------+
| srno   | int(10)     | YES  |     | NULL    |       |
| name   | varchar(20) | YES  |     | NULL    |       |
| rollno | int(10)     | YES  |     | NULL    |       |
| branch | varchar(30) | YES  |     | NULL    |       |
+--------+-------------+------+-----+---------+-------+
4 rows in set (0.02 sec)