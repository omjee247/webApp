package com.springboot.webApp.todo;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import jakarta.validation.Valid;

@Controller
@SessionAttributes("name")
public class TodoController {

	public TodoController(TodoService todoService) {
		super();
		this.todoService = todoService;
	}

	private TodoService todoService;
	
	@RequestMapping("todo-List")
	public String TodoList(ModelMap model) {
		
		List<Todo> todos = todoService.findByUsername("Om");
		model.addAttribute("todos",todos);
		
		return "todoList";
	}
	
	@RequestMapping(value="add-todo", method = RequestMethod.GET)
	public String ShowTodo(ModelMap model) {
		String username = (String)model.get("username");
		Todo todo = new Todo(0, username, "", LocalDate.now().plusYears(1), false);
		model.put("todo", todo);
		return "todo";
	}
	
	@RequestMapping(value="add-todo", method = RequestMethod.POST)
	public String AddTodo(ModelMap model,@Valid Todo todo, BindingResult result) {
		
		if(result.hasErrors()) {
			return "todo";
		}
		
		String username = (String)model.get("username");
		
		todoService.addTodo(username, todo.getDesc(), LocalDate.now().plusYears(1), false);
		return "redirect:todo-List";
	}
	
	@RequestMapping("delete-todo")
	public String DeleteTodo(int id) {
		todoService.deleteById(id);
		return "redirect:todo-List";
	}
}
