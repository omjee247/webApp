package com.springboot.webApp.todo;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

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
	public String ShowTodo() {
		return "todo";
	}
	
	@RequestMapping(value="add-todo", method = RequestMethod.POST)
	public String AddTodo(@RequestParam	String decription, ModelMap model) {
		//String username = (String)model.get("name");
		
		//todoService.addTodo(username, decription, LocalDate.now().plusYears(1), false);
		return "redirect:todoList";
	}
	
}
