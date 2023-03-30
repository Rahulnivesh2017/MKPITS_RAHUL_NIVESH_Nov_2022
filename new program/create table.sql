// create table

mysql> create table ram1(sr_no int,name varchar(20),address varchar(40),roll_no varchar(30));
Query OK, 0 rows affected (0.03 sec)

mysql> show tables;
+---------------+
| Tables_in_ram |
+---------------+
| ram1          |
+---------------+
1 row in set (0.00 sec)

mysql> insert into ram1 values(1,'rahul','ram_nagar','21'),(2,'devesh','laxmi_nagar','22'),(3,'akshay','pawan','23'),(4,'zaffar','mom','24');
Query OK, 4 rows affected (0.01 sec)
Records: 4  Duplicates: 0  Warnings: 0

mysql> select * from ram1;
+-------+--------+-------------+---------+
| sr_no | name   | address     | roll_no |
+-------+--------+-------------+---------+
|     1 | rahul  | ram_nagar   | 21      |
|     2 | devesh | laxmi_nagar | 22      |
|     3 | akshay | pawan       | 23      |
|     4 | zaffar | mom         | 24      |
+-------+--------+-------------+---------+
4 rows in set (0.00 sec)
