DROP PUBLIC DATABASE LINK wind_db;
CREATE PUBLIC DATABASE LINK wind_db
 CONNECT TO windzx IDENTIFIED BY windzx
 USING '(DESCRIPTION =(ADDRESS_LIST =(ADDRESS =(PROTOCOL = TCP)(HOST = 192.168.1.107)(PORT = 1521)))(CONNECT_DATA =(SERVICE_NAME = buyside)))';
-- 提交后查询：
SELECT * FROM dba_db_links;