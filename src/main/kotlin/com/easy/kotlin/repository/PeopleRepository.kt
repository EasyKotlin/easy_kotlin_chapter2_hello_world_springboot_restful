package com.easy.kotlin.repository

import com.easy.kotlin.entity.People
import org.springframework.data.repository.CrudRepository

/**
 * Created by jack on 2017/6/7.
 */
interface PeopleRepository : CrudRepository<People, Long> {
    fun findByLastName(lastName: String): List<People>?
}
