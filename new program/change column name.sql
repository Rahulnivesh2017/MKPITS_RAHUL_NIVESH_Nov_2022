// change column name

mysql> select * from ram1;
+-------+--------+-------------+---------+
| sr_no | name   | address     | roll_no |
+-------+--------+-------------+---------+
|     1 | rahul  | ram_nagar   | 21      |
|     2 | devesh | laxmi_nagar | 22      |
|     3 | akshay | pawan       | 23      |
|     4 | roshan | mom         | 24      |
+-------+--------+-------------+---------+
4 rows in set (0.00 sec)

mysql> alter table ram1 change column sr_no id int;
Query OK, 4 rows affected (0.04 sec)
Records: 4  Duplicates: 0  Warnings: 0

mysql> select * from ram1;
+------+--------+-------------+---------+
| id   | name   | address     | roll_no |
+------+--------+-------------+---------+
|    1 | rahul  | ram_nagar   | 21      |
|    2 | devesh | laxmi_nagar | 22      |
|    3 | akshay | pawan       | 23      |
|    4 | roshan | mom         | 24      |
+------+--------+-------------+---------+
4 rows in set (0.00 sec)
