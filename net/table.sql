CREATE TABLE tblRegister(
 id VARCHAR(20) PRIMARY KEY,
 pwd CHAR(20) NOT NULL,
 name CHAR(20) NOT NULL,
 regdate DATETIME  DEFAULT NOW()
);

INSERT INTO tblRegister
VALUES('aaa', '1234', 'ȫ�浿', NOW());

INSERT INTO tblRegister
VALUES('bbb', '1234', '����â', NOW());

INSERT INTO tblRegister
VALUES('ccc', '1234', '������', NOW());
tblregister
CREATE TABLE tblMessage(
 no INT AUTO_INCREMENT PRIMARY  KEY,
 fid VARCHAR(20) NOT  NULL,
 tid VARCHAR(20) NOT  NULL,
 msg VARCHAR(50) NOT  NULL,
 mdate timestamp DEFAULT NOW()
);