package com.todolist.data

import com.todolist.domain.TodoItem
import org.springframework.data.jdbc.repository.query.Query
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.repository.CrudRepository

interface TodoRepository : JpaRepository<TodoItem, Long> {
}