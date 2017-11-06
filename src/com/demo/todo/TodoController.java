package com.demo.todo;

import com.demo.common.model.Todo;
import com.jfinal.aop.Before;
import com.jfinal.core.Controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;


public class TodoController extends Controller{

    static TodoService service = new TodoService();
    public void index(){
        System.out.println(getPara());
        if(getParaToInt("id") == null){
            setAttr("todoList",service.findAll());
            render("index.html");
        }else {
            setAttr("todo",service.findById(getParaToInt("id")));
            render("detail.html");
        }

    }

    public void detail(){
        setAttr("todo",service.findById(getParaToInt("id")));
        render("detail.html");
    }

    public void add() {

    }

    @Before(TodoValidator.class)
    public void save() {
        getModel(Todo.class).save();
        redirect("/todo");
    }

    public void edit() {
        setAttr("todo",service.findById(getParaToInt()));
    }

    @Before(TodoValidator.class)
    public void update() {
        getModel(Todo.class).update();
        redirect("/todo");
    }

    public void delete() {
        service.deleteById(getParaToInt());
        redirect("/todo");
    }

    public void addauto() {
        Todo todo = new Todo();
        Date now = new Date();
        String nowStr = new SimpleDateFormat("yyyMMddhhmmss").format(now);
        todo.set("title","新增todo-"+nowStr);
        todo.set("content","content:这是内容-" + nowStr);
        todo.save();
        redirect("/todo");
    }

    public void search() {
        System.out.println(getPara("keyword"));
        List todoList = service.findKeyword(getPara("keyword"));
        setAttr("todoList",todoList);
        render("index.html");
    }
}
