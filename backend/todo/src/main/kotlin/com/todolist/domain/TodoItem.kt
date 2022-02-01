package com.todolist.domain

import java.math.BigDecimal
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
data class TodoItem(@Id @GeneratedValue(strategy = GenerationType.AUTO)
                    var id: Long = 0,
                    var title: String = "",
                    var done: Boolean = false)
