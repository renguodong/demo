DROP TABLE clients;
CREATE TABLE clients (
	cid		INT		AUTO_INCREMENT,
	photo	VARCHAR(50)	DEFAULT 'nophoto.jpg',
	name	VARCHAR(20)	NOT NULL,
	sex	VARCHAR(3),
	createtime	TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
	lasttime	TIMESTAMP,
	birthday	DATE,
	explains		TEXT,
	CONSTRAINT pk_cid PRIMARY KEY(cid)
)type=innodb;
INSERT INTO clients (name, sex, explains)  VALUES ('SMITH', '男', '这个人很懒,什么都没留下...');
INSERT INTO clients (name, sex, explains)  VALUES ('TOM', '男', '这个人很懒,什么都没留下...');
INSERT INTO clients (name, sex, explains)  VALUES ('MARY', '女', '这个人很懒,什么都没留下...');
INSERT INTO clients (name, sex, explains)  VALUES ('WILLIAM', '男', '这个人很懒,什么都没留下...');
INSERT INTO clients (name, sex, explains)  VALUES ('王萍', '女', '这个人很懒,什么都没留下...');