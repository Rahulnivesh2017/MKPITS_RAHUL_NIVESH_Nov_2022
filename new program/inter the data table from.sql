// inter the data table from 


mysql> insert into student Values(1,'Rahul',12,'it'),(2,'Devesh',13,'cse'),(3,'Akshay',14,'mech'),(4,'Zaffar',15,'civil'),(5,'Amit',1
6,'etc');
Query OK, 5 rows affected (0.01 sec)
Records: 5  Duplicates: 0  Warnings: 0

mysql> select * from student;
+------+--------+--------+--------+
| srno | name   | rollno | branch |
+------+--------+--------+--------+
|    1 | Rahul  |     12 | it     |
|    2 | Devesh |     13 | cse    |
|    3 | Akshay |     14 | mech   |
|    4 | Zaffar |     15 | civil  |
|    5 | Amit   |     16 | etc    |
+------+--------+--------+--------+
5 rows in set (0.00 sec)