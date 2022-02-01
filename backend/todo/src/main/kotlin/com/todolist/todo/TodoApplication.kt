package com.todolist.todo

import com.todolist.domain.TodoItem
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
class TodoApplication

fun main(args: Array<String>) {
	runApplication<TodoApplication>(*args)
}

//TODO move below to a separate file and follow spring conventions

@RestController
class TodoItemResource {
	@GetMapping
	fun index(): List<TodoItem> = listOf(
		TodoItem(
			id = 1,
			title = "Todo 1",
			done = false
		) ,TodoItem(
		id = 2,
		title = "Todo 2",
		done = false
	), TodoItem(
		id = 3,
		title = "Todo 3",
		done = false
	)
	)

}

