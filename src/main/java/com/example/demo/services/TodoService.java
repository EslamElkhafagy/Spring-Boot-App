package com.example.demo.services;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Todo;

@Service
public class TodoService {

	private static List<Todo> todos= new ArrayList<>();
	
	
	static {
		todos.add(new Todo(1, "Eslam", "Enjoy",new Date(), false));
		todos.add(new Todo(2, "Ahmed", "Enjoy",new Date(), false));
		todos.add(new Todo(1, "Eslam", "Enjoy",new Date(), false));
	}
	
	public void addNewTodo(Todo obj) {
		
		todos.add(obj);
		
	}
	
	public List<Todo> getAllTodos(){
		
		return todos;
	}
	
	public List<Todo> getTodo(String user) {
		List<Todo> filter =new ArrayList<>();
		
		for(Todo obj:todos) {
			
			if(obj.getUser().equals(user)) {
				filter.add(obj);
			}
		}
		
		return filter;
	}
	
	public boolean deleteTodo(int id) {
		Iterator<Todo> iterator=todos.iterator();
		
		while(iterator.hasNext()) {
			
			Todo obj= iterator.next();
			
			if(obj.getId()==id)
				iterator.remove();
				return true;
			
			
		}
		
		return false;
	}
	
}
