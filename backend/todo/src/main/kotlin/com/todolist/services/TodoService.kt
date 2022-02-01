package com.todolist.services

import com.todolist.data.TodoRepository
import com.todolist.domain.TodoItem
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class TodoService() {

    @Autowired
    lateinit var todoRepository: TodoRepository

    fun findTodoItems(): List<TodoItem> = todoRepository.findAll()

    fun post(todoItem: TodoItem){
        todoRepository.save(todoItem)
    }
}
