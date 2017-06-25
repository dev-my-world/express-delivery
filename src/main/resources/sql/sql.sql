CREATE TABLE user_info (
  `user_id`    INT(11) PRIMARY KEY AUTO_INCREMENT,
  `user_name`  VARCHAR(20) UNIQUE,
  `user_phone` VARCHAR(11) UNIQUE NOT NULL,
  `user_psw`   VARCHAR(20)        NOT NULL
);

create table express_info
(
  id int auto_increment
    primary key,
  name varchar(20) null,
  express varchar(20) null,
  message varchar(40) null,
  remark varchar(20) null,
  address varchar(20) null,
  station tinyint null,
  user_id int null,
  phone varchar(20) null
)
;
