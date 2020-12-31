package com.board.domain;

import java.util.Date;

public class ReplyVO {
	/*
		CREATE TABLE `tbl_reply` (
			`rno` INT(11) NOT NULL AUTO_INCREMENT,
			`bno` INT(11) NOT NULL,
			`writer` VARCHAR(30) NOT NULL COLLATE 'utf8_general_ci',
			`content` MEDIUMTEXT NOT NULL COLLATE 'utf8_general_ci',
			`regDate` TIMESTAMP NOT NULL DEFAULT current_timestamp(),
			PRIMARY KEY (`rno`, `bno`) USING BTREE,
			INDEX `bno` (`bno`) USING BTREE,
			CONSTRAINT `tbl_reply_ibfk_1` FOREIGN KEY (`bno`) REFERENCES `board`.`tbl_board` (`bno`) ON UPDATE RESTRICT ON DELETE RESTRICT
		)
		COLLATE='latin1_swedish_ci'
		ENGINE=InnoDB
		;
	 */
	
	private int rno;
	private int bno;
	private String writer;
	private String content;
	private Date regDate;
	public int getRno() {
		return rno;
	}
	public void setRno(int rno) {
		this.rno = rno;
	}
	public int getBno() {
		return bno;
	}
	public void setBno(int bno) {
		this.bno = bno;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
}
