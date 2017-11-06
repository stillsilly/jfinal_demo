package com.demo.login;

import com.demo.common.model.Member;
import com.jfinal.core.Controller;

import java.util.List;

public class LoginController extends Controller{

    LoginService service = new LoginService();
    public void index(){
        render("login.html");
    }

    public void api(){
        String name = getPara("name");
        System.out.println(name);
        String password = getPara("password");
        List members = service.findByName(name);
        if(members.size()<1){
            setAttr("userErrMessage","用户不存在");
            render("login.html");
            return;
        }
        Member member = (Member) members.get(0);
        String rightPassword =  member.getPassword();

        if(password == rightPassword){
            redirect("/todo");
        }else {
            setAttr("errMessage","密码错误");
            render("login.html");
        }
    }
}
