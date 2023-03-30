// change the name zaffar to roshan

mysql> select * from ram1;
+-------+--------+-------------+---------+---------+
| sr_no | name   | address     | roll_no | pone_no |
+-------+--------+-------------+---------+---------+
|     1 | rahul  | ram_nagar   | 21      | 43546   |
|     2 | devesh | laxmi_nagar | 22      | 43546   |
|     3 | akshay | pawan       | 23      | 43546   |
|     4 | zaffar | mom         | 24      | 43546   |
+-------+--------+-------------+---------+---------+
4 rows in set (0.00 sec)

mysql> update ram1 set name='roshan' where sr_no=4;
Query OK, 1 row affected (0.00 sec)
Rows matched: 1  Changed: 1  Warnings: 0

mysql> select * from ram1;
+-------+--------+-------------+---------+---------+
| sr_no | name   | address     | roll_no | pone_no |
+-------+--------+-------------+---------+---------+
|     1 | rahul  | ram_nagar   | 21      | 43546   |
|     2 | devesh | laxmi_nagar | 22      | 43546   |
|     3 | akshay | pawan       | 23      | 43546   |
|     4 | roshan | mom         | 24      | 43546   |
+-------+--------+-------------+---------+---------+
4 rows in set (0.00 sec)

