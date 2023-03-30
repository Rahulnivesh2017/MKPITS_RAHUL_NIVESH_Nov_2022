// change the datatype pone_no

mysql> desc ram1;
+---------+-------------+------+-----+---------+-------+
| Field   | Type        | Null | Key | Default | Extra |
+---------+-------------+------+-----+---------+-------+
| sr_no   | int(11)     | YES  |     | NULL    |       |
| name    | varchar(20) | YES  |     | NULL    |       |
| address | varchar(40) | YES  |     | NULL    |       |
| roll_no | varchar(30) | YES  |     | NULL    |       |
| pone_no | varchar(40) | YES  |     | NULL    |       |
+---------+-------------+------+-----+---------+-------+
5 rows in set (0.02 sec)

mysql> alter table ram1 modify column pone_no varchar(60);
Query OK, 4 rows affected (0.05 sec)
Records: 4  Duplicates: 0  Warnings: 0

mysql> desc ram1;
+---------+-------------+------+-----+---------+-------+
| Field   | Type        | Null | Key | Default | Extra |
+---------+-------------+------+-----+---------+-------+
| sr_no   | int(11)     | YES  |     | NULL    |       |
| name    | varchar(20) | YES  |     | NULL    |       |
| address | varchar(40) | YES  |     | NULL    |       |
| roll_no | varchar(30) | YES  |     | NULL    |       |
| pone_no | varchar(60) | YES  |     | NULL    |       |
+---------+-------------+------+-----+---------+-------+
5 rows in set (0.02 sec)
