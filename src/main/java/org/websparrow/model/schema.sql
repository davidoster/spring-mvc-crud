/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  david
 * Created: Oct 7, 2019
 */
CREATE TABLE `student` (
  `stu_id` int(11) NOT NULL AUTO_INCREMENT,
  `stu_name` varchar(30) DEFAULT NULL,
  `stu_email` varchar(30) DEFAULT NULL,
  `stu_course` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`stu_id`)
);

