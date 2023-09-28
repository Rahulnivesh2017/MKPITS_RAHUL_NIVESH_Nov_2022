mysql> select * from student;
+----+----------+--------+-------+
| id | name     | rollno | marks |
+----+----------+--------+-------+
|  1 | Rahul    | 101    | 76    |
|  2 | Devesh   | 102    | 40    |
|  3 | Akshay   | 103    | 50    |
|  4 | Samiksha | 104    | 75    |
|  5 | Khushi   | 105    | 55    |
|  6 | Amit     | 106    | 10    |
+----+----------+--------+-------+
6 rows in set (0.00 sec)

mysql> select * from employee;
+------+---------+--------+
| E_id | E_name  | salary |
+------+---------+--------+
|    1 | Pranali | 500000 |
|    2 | Komal   | 300000 |
|    3 | Sachin  |  44000 |
|    4 | Anchal  |  22000 |
+------+---------+--------+
4 rows in set (0.00 sec)

mysql> select * from student s left join employee e on s.id=e.E_id where e.E_id is null;
+----+--------+--------+-------+------+--------+--------+
| id | name   | rollno | marks | E_id | E_name | salary |
+----+--------+--------+-------+------+--------+--------+
|  5 | Khushi | 105    | 55    | NULL | NULL   |   NULL |
|  6 | Amit   | 106    | 10    | NULL | NULL   |   NULL |
+----+--------+--------+-------+------+--------+--------+
2 rows in set (0.00 sec)