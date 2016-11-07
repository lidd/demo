package com.example.web.entity

import java.util.*
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

/**
 * Created by Administrator on 2016/11/4.
 */
@Entity
class User {
    constructor()
    constructor(username: String, userPwd: String) {
        this.username = username
        this.userPwd = userPwd
    }

    @Id
    @GeneratedValue
    var userId: Long = 0
    var username: String = ""
    var userPwd: String = ""
    var userPwdQ: String = ""
    var userPwdA: String = ""
    var userGender: Byte = 0
    var userBirth: Date? = null
    var userBlog: String = ""
    var userAddr: String = ""
    var userGrade: Short = 0
    var userEx: Int = 0
    var userRegTime: Date? = null
    var lastLogin: Date? = null
}