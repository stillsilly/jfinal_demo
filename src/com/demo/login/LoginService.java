package com.demo.login;

import com.demo.common.model.Member;

import java.util.List;

import static com.demo.common.model.Member.dao;

public class LoginService{

        public List<Member> findByName(String name){
            System.out.println(name);
            return dao.find("select * from member where name like '%" + name +"%'");
        }
}
