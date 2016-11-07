package com.example.web.service

import com.example.web.entity.User
import com.example.web.repository.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

/**
 * Created by Administrator on 2016/11/4.
 */
@Service
class UserService {

    @Autowired
    val userRepository: UserRepository? = null

    fun findUser(username: String, userPwd: String): User? {
        return userRepository!!.findByUsernameAndUserPwd(username, userPwd)
    }
}