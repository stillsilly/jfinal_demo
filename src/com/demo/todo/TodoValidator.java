package com.demo.todo;

import com.demo.common.model.Todo;
import com.jfinal.core.Controller;

import com.jfinal.validate.Validator;

public class TodoValidator extends Validator {
    protected void validate(Controller controller){
        validateRequiredString("todo.title","titleMsg","请输入标题");
        validateRequiredString("todo.content","contentMsg","请输入内容");
    }

    protected void handleError(Controller controller){
        controller.keepModel(Todo.class);

        String actionKey = getActionKey();
        if(actionKey.equals("/todo/save")){
            controller.render("add.html");
        } else if (actionKey.equals("/todo/update")) {
            controller.render("edit.html");
        }
    }
}
