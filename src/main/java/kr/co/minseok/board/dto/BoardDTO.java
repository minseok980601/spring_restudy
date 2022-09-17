package kr.co.minseok.board.dto;

import java.sql.Date;

import org.springframework.stereotype.Component;

@Component("boardDTO")
public class BoardDTO {
	
	private int post_num;
	private String id;
	private String post_title;
	private String post_content;
	private Date post_date;
	private int visitcount;
	private int countcomment;
	
	public BoardDTO() {
		
	}
	
	public BoardDTO(int post_num, String id, String post_title, String post_content, Date post_date, int visitcount,
			int countcomment) {
		this.post_num = post_num;
		this.id = id;
		this.post_title = post_title;
		this.post_content = post_content;
		this.post_date = post_date;
		this.visitcount = visitcount;
		this.countcomment = countcomment;
	}

	public int getPost_num() {
		return post_num;
	}

	public void setPost_num(int post_num) {
		this.post_num = post_num;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPost_title() {
		return post_title;
	}

	public void setPost_title(String post_title) {
		this.post_title = post_title;
	}

	public String getPost_content() {
		return post_content;
	}

	public void setPost_content(String post_content) {
		this.post_content = post_content;
	}

	public Date getPost_date() {
		return post_date;
	}

	public void setPost_date(Date post_date) {
		this.post_date = post_date;
	}

	public int getVisitcount() {
		return visitcount;
	}

	public void setVisitcount(int visitcount) {
		this.visitcount = visitcount;
	}

	public int getCountcomment() {
		return countcomment;
	}

	public void setCountcomment(int countcomment) {
		this.countcomment = countcomment;
	}

	
}
