package com.todolist.control

import com.todolist.domain.TodoItem
import com.todolist.services.TodoService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.*

@RestController
class MainController {

    @Autowired
    lateinit var todoService: TodoService

    @GetMapping("/dummy")
    fun dummy(): List<TodoItem> = listOf(
        TodoItem(id = 1, title = "Todo 1", done = false),
        TodoItem(id = 2, title = "Todo 2", done = false),
        TodoItem(id = 3, title = "Todo 3", done = false)
    )

    @GetMapping("/todos")
    fun index(): List<TodoItem> = todoService.findTodoItems()

    @PostMapping
    fun post(@RequestBody todoItem: TodoItem) {
        todoService.post(todoItem)
    }
}