// Create databases and Tables

mysql> create database newfamily;
Query OK, 1 row affected (0.00 sec)

mysql> show databases;
+---------------------+
| Database            |
+---------------------+
| information_schema  |
| b1                  |
| empdb               |
| employee            |
| emprr               |
| familyaaa           |
| familydb            |
| familyrn            |
| login1              |
| login2              |
| login3              |
| login5              |
| logindemo           |
| memoryab            |
| myfamily            |
| myfamilyan          |
| myfamilydb          |
| myfriends           |
| myrahul             |
| mysql               |
| newfamily           |
| niveshab            |
| performance_schema  |
| practice_database   |
| rahul22             |
| rahulss             |
| somaliadb           |
| somalidb2           |
| structure_inventory |
| structure_moviesdb  |
| test                |
+---------------------+
31 rows in set (0.01 sec)

mysql> use newfamily;
Database changed
mysql> create table newmember (sr int(5),name varchar(20),age varchar(10),relation varchar(20),mobile varchar(10));
Query OK, 0 rows affected (0.02 sec)

mysql> show tables;
+---------------------+
| Tables_in_newfamily |
+---------------------+
| newmember           |
+---------------------+
1 row in set (0.01 sec)