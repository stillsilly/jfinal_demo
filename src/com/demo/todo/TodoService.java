package com.demo.todo;

import com.demo.common.model.Todo;

import java.util.List;

public class TodoService {
    private static final Todo dao = new Todo().dao();

    public List findAll(){
        return dao.find("select * from todo order by id asc");
    }
    public Todo findById(int id){
        return dao.findById(id);
    }

    public void  deleteById(int id){
        dao.deleteById(id);
    }

    public List findKeyword(String keyword) {
        keyword = keyword.trim();
        return dao.find("select * from todo where title like '%"+keyword+"%' or content like '%" + keyword +"%'");
    }
}

