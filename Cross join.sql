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

mysql> select * from student cross join employee;
+----+----------+--------+-------+------+---------+--------+
| id | name     | rollno | marks | E_id | E_name  | salary |
+----+----------+--------+-------+------+---------+--------+
|  1 | Rahul    | 101    | 76    |    1 | Pranali | 500000 |
|  1 | Rahul    | 101    | 76    |    2 | Komal   | 300000 |
|  1 | Rahul    | 101    | 76    |    3 | Sachin  |  44000 |
|  1 | Rahul    | 101    | 76    |    4 | Anchal  |  22000 |
|  2 | Devesh   | 102    | 40    |    1 | Pranali | 500000 |
|  2 | Devesh   | 102    | 40    |    2 | Komal   | 300000 |
|  2 | Devesh   | 102    | 40    |    3 | Sachin  |  44000 |
|  2 | Devesh   | 102    | 40    |    4 | Anchal  |  22000 |
|  3 | Akshay   | 103    | 50    |    1 | Pranali | 500000 |
|  3 | Akshay   | 103    | 50    |    2 | Komal   | 300000 |
|  3 | Akshay   | 103    | 50    |    3 | Sachin  |  44000 |
|  3 | Akshay   | 103    | 50    |    4 | Anchal  |  22000 |
|  4 | Samiksha | 104    | 75    |    1 | Pranali | 500000 |
|  4 | Samiksha | 104    | 75    |    2 | Komal   | 300000 |
|  4 | Samiksha | 104    | 75    |    3 | Sachin  |  44000 |
|  4 | Samiksha | 104    | 75    |    4 | Anchal  |  22000 |
|  5 | Khushi   | 105    | 55    |    1 | Pranali | 500000 |
|  5 | Khushi   | 105    | 55    |    2 | Komal   | 300000 |
|  5 | Khushi   | 105    | 55    |    3 | Sachin  |  44000 |
|  5 | Khushi   | 105    | 55    |    4 | Anchal  |  22000 |
|  6 | Amit     | 106    | 10    |    1 | Pranali | 500000 |
|  6 | Amit     | 106    | 10    |    2 | Komal   | 300000 |
|  6 | Amit     | 106    | 10    |    3 | Sachin  |  44000 |
|  6 | Amit     | 106    | 10    |    4 | Anchal  |  22000 |
+----+----------+--------+-------+------+---------+--------+
24 rows in set (0.00 sec)
