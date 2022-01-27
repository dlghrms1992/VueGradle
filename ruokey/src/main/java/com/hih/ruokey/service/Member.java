package com.hih.ruokey.service;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Member {
	private String id;
	private String loginId;
	private String password;
	private String name;
	private String phone;
	private String email;
	private String age;
	private String gender;
	private String etc;

}
