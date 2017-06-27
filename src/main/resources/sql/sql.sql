CREATE TABLE user_info (
  `user_id`    INT(11) PRIMARY KEY AUTO_INCREMENT,
  `user_name`  VARCHAR(20) UNIQUE,
  `user_phone` VARCHAR(11) UNIQUE NOT NULL,
  `user_psw`   VARCHAR(20)        NOT NULL
);

CREATE TABLE express_info
(
  id      INT AUTO_INCREMENT
    PRIMARY KEY,
  name    VARCHAR(20) NULL,
  express VARCHAR(20) NULL,
  message VARCHAR(40) NULL,
  remark  VARCHAR(20) NULL,
  address VARCHAR(20) NULL,
  station TINYINT     NULL,
  user_id INT         NULL,
  phone   VARCHAR(20) NULL
)ENGINE=InnoDB DEFAULT CHARSET=utf8;;

INSERT INTO express_info (name, express, message, remark, address, station, user_id, phone)

VALUES ('张三','圆通快递','取件码1234567','你好，同学','this is an address',1,0,'123456') ,
  ('张三','圆通快递','取件码1234567','你好，同学','this is an address',1,0,'123456')
,('张三','圆通快递','取件码1234567','你好，同学','this is an address',2,0,'123456'),
  ('张三','圆通快递','取件码1234567','你好，同学','this is an address',3,0,'123456') ,
  ('张三','圆通快递','取件码1234567','你好，同学','this is an address',4,0,'123456') ,
  ('张三','圆通快递','取件码1234567','你好，同学','this is an address',5,0,'123456')
