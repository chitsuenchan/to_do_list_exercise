package com.todolist.domain

import java.math.BigDecimal
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

data class TodoItem(@Id
                    var id: Long = 0,
                    var title: String = "",
                    var done: Boolean = false)
