// enter the phone no sr_no 3

mysql> update ram1 set pone_no='1234' where sr_no=3;
Query OK, 1 row affected (0.01 sec)
Rows matched: 1  Changed: 1  Warnings: 0

mysql> select * from ram1;
+-------+--------+-------------+---------+---------+
| sr_no | name   | address     | roll_no | pone_no |
+-------+--------+-------------+---------+---------+
|     1 | rahul  | ram_nagar   | 21      | NULL    |
|     2 | devesh | laxmi_nagar | 22      | NULL    |
|     3 | akshay | pawan       | 23      | 1234    |
|     4 | zaffar | mom         | 24      | NULL    |
+-------+--------+-------------+---------+---------+
4 rows in set (0.00 sec)
