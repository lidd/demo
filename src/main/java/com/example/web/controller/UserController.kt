package com.example.web.controller

import com.example.web.entity.Thread
import com.example.web.entity.User
import com.example.web.modle.Response
import com.example.web.service.UserService
import com.example.web.status.ResponseState
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import javax.servlet.http.HttpSession

/**
 * Created by Administrator on 2016/11/4.
 */
@Controller
class UserController {

    @Autowired
    val userService: UserService? = null

    @RequestMapping("/login")
    fun login(@RequestParam(required = false) username: String?, @RequestParam(required = false) userPwd: String?, session: HttpSession): String {
        if (username == null || userPwd == null){
            return "login"
        }
        val response: Response<User> = Response()
        val user = userService!!.findUser(username, userPwd)
        if (user != null && session.getAttribute("user") == null) {
            session.setAttribute("user", user)
        } else {
            response.status = ResponseState.FAIL
            return "login"
        }
        return "index"
    }

    fun postedThreads(): Response<Thread> {
        val response: Response<Thread> = Response()
        response.list = mutableListOf()
        return response
    }

    @RequestMapping("/logout")
    fun logout(model: Model, session: HttpSession): String {
        val user: User = session.getAttribute("user") as User
        model.addAttribute("username", user.username)
        session.removeAttribute("user")
        return "login"
    }
}