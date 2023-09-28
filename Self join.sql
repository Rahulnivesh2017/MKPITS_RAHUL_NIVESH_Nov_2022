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

mysql> select name as student_name,E_name as employee_name, rollno from student,employee;
+--------------+---------------+--------+
| student_name | employee_name | rollno |
+--------------+---------------+--------+
| Rahul        | Pranali       | 101    |
| Rahul        | Komal         | 101    |
| Rahul        | Sachin        | 101    |
| Rahul        | Anchal        | 101    |
| Devesh       | Pranali       | 102    |
| Devesh       | Komal         | 102    |
| Devesh       | Sachin        | 102    |
| Devesh       | Anchal        | 102    |
| Akshay       | Pranali       | 103    |
| Akshay       | Komal         | 103    |
| Akshay       | Sachin        | 103    |
| Akshay       | Anchal        | 103    |
| Samiksha     | Pranali       | 104    |
| Samiksha     | Komal         | 104    |
| Samiksha     | Sachin        | 104    |
| Samiksha     | Anchal        | 104    |
| Khushi       | Pranali       | 105    |
| Khushi       | Komal         | 105    |
| Khushi       | Sachin        | 105    |
| Khushi       | Anchal        | 105    |
| Amit         | Pranali       | 106    |
| Amit         | Komal         | 106    |
| Amit         | Sachin        | 106    |
| Amit         | Anchal        | 106    |
+--------------+---------------+--------+
24 rows in set (0.00 sec)