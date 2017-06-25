CREATE TABLE user_info (
  `user_id`    INT(11) PRIMARY KEY AUTO_INCREMENT,
  `user_name`  VARCHAR(20) UNIQUE,
  `user_phone` VARCHAR(11) UNIQUE NOT NULL,
  `user_psw`   VARCHAR(20)        NOT NULL
);


INSERT INTO user_info (user_phone, user_psw)
VALUES ('admin', 'admin'), ('123', '123'), ('test', 'test');