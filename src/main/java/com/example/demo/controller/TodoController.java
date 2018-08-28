package com.example.demo.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.model.Todo;
import com.example.demo.services.TodoService;

@Controller
public class TodoController {

	@Autowired
	TodoService todoservice;
	
	@RequestMapping(value="/alltodos",method=RequestMethod.GET)
//	@ResponseBody
	public String getTodos(ModelMap model){
		model.put("todos", todoservice.getAllTodos());
//		return todoservice.getAllTodos();
		return "alltodo";
	}
	
	@RequestMapping(value="/deletetodo", method=RequestMethod.GET)
//	@ResponseBody
	public String deleteTodo(@RequestParam int id) {
		
		 todoservice.deleteTodo(id);
		return "redirect:/alltodos";
	}
	
	@RequestMapping(value="/addnewtodo",method=RequestMethod.GET)
	public String addNewTodo() {
		
		return "addTodo";
	}
	
	@RequestMapping(value="/addnewtodo",method=RequestMethod.POST)
	public String newTodo(ModelMap model,@RequestParam String id,@RequestParam String user,@RequestParam String desc) {
		todoservice.addNewTodo(new Todo(Integer.parseInt(id), user, desc,new Date(), true));
		
		return "redirect:/alltodos";
	}
	
}
