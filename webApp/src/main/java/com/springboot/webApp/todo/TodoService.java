package com.springboot.webApp.todo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.SessionAttributes;

import jakarta.validation.Valid;

@Service
public class TodoService {

	private static List<Todo> todos = new ArrayList<>();
	private static int todosCount=0;
	static {
		todos.add(new Todo(++todosCount, "Om", "Get AWS Certified", LocalDate.now().plusYears(1), false));
		todos.add(new Todo(++todosCount, "Om", "Cloud Computing", LocalDate.now().plusYears(2), false));
		todos.add(new Todo(++todosCount, "Om", "Devops", LocalDate.now().plusYears(3), false));
		todos.add(new Todo(++todosCount, "Om", "Full Stack Dev", LocalDate.now().plusYears(4), false));
	}
	
	public List<Todo> findByUsername(String username){
		return todos;
	}
	
	public void addTodo(String username, String description, LocalDate targetDate, boolean done) {
		Todo todo = new Todo(++todosCount, username, description, targetDate, done);
		todos.add(todo);
	}
	public void deleteById(int id) {
		
		Predicate<? super Todo> predicate = todo -> todo.getId() == id;
		todos.removeIf(predicate);
	}
	
	public void updateTodo(int id, Object username, LocalDate plusYears, boolean b) {
		
		Predicate<? super Todo> predicate = todo -> todo.getId() == id;
	}

	public Todo findById(int id) {
		Predicate<? super Todo> predicate = todo -> todo.getId() == id;
		Todo todo = todos.stream().filter(predicate).findFirst().get();
		return todo;
	}

	public void updateTodo(@Valid Todo todo) {
		deleteById(todo.getId());
		todos.add(todo);
	}
	
	
}
