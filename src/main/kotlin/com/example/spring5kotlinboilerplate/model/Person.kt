package com.example.spring5kotlinboilerplate.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
data class Person (
        @Id
        var _id: Long = -1,
        var lastName: String = "",
        var firstName: String = ""
){ }
