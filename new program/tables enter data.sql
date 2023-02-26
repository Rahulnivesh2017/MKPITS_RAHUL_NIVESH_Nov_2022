// Enter to data in table

mysql> insert into newmember Values(1,'Prakash',53,'Father',9988776655);
Query OK, 1 row affected (0.01 sec)

mysql> insert into newmember Values(2,'Pritamdevi',51,'Mother',9988776655);
Query OK, 1 row affected (0.01 sec)

mysql> insert into newmember Values(3,'Radha',32,'Sis',9988776655);
Query OK, 1 row affected (0.03 sec)

mysql> insert into newmember Values(4,'Manoj',30,'Bro',9988776655);
Query OK, 1 row affected (0.01 sec)

mysql> insert into newmember Values(5,'Rahul',27,'Me',9988776655);
Query OK, 1 row affected (0.01 sec)

mysql> insert into newmember Values(6,'Amar',25,'Bro',9988776655);
Query OK, 1 row affected (0.02 sec)

mysql> insert into newmember Values(7,'Jyoti',23,'Sis',9988776655);
Query OK, 1 row affected (0.01 sec)

mysql> select * from newmember;
+------+------------+------+----------+------------+
| sr   | name       | age  | relation | mobile     |
+------+------------+------+----------+------------+
|    1 | Prakash    | 53   | Father   | 9988776655 |
|    2 | Pritamdevi | 51   | Mother   | 9988776655 |
|    3 | Radha      | 32   | Sis      | 9988776655 |
|    4 | Manoj      | 30   | Bro      | 9988776655 |
|    5 | Rahul      | 27   | Me       | 9988776655 |
|    6 | Amar       | 25   | Bro      | 9988776655 |
|    7 | Jyoti      | 23   | Sis      | 9988776655 |
+------+------------+------+----------+------------+
7 rows in set (0.00 sec)