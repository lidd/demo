package com.example.web.repository

import com.example.web.entity.User
import org.springframework.data.repository.CrudRepository

/**
 * Created by Administrator on 2016/11/4.
 */
interface UserRepository : CrudRepository<User, Long> {
    fun findByUsernameAndUserPwd(username:String,userPwd:String):User?
}