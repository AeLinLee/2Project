package com.exam.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.apache.ibatis.type.Alias;

@Alias("MemberDTO")
public class MemberDTO {

	@NotBlank(message = "적어도 한글이상 적어주세요.")
	String userid;
	
	@Size(min = 4, message = "4글자 이상입니다.")
	String passwd;
	
	@NotBlank(message = "적어도 한글이상 적어주세요.")
	String username;
	String post;
	String addr1;
	String addr2;
	String phone;
	String email;
	
	public MemberDTO() {}

	public MemberDTO(String userid, @Size(min = 4, message = "4글자 이상입니다.") String passwd, String username, String post,
			String addr1, String addr2, String phone, String email) {
		super();
		this.userid = userid;
		this.passwd = passwd;
		this.username = username;
		this.post = post;
		this.addr1 = addr1;
		this.addr2 = addr2;
		this.phone = phone;
		this.email = email;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPost() {
		return post;
	}

	public void setPost(String post) {
		this.post = post;
	}

	public String getAddr1() {
		return addr1;
	}

	public void setAddr1(String addr1) {
		this.addr1 = addr1;
	}

	public String getAddr2() {
		return addr2;
	}

	public void setAddr2(String addr2) {
		this.addr2 = addr2;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "MemberDTO [userid=" + userid + ", passwd=" + passwd + ", username=" + username + ", post=" + post
				+ ", addr1=" + addr1 + ", addr2=" + addr2 + ", phone=" + phone + ", email=" + email + "]";
	}
	
     
	
	
	

	
}
