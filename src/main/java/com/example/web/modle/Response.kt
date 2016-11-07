package com.example.web.modle

import com.example.web.status.ResponseState

/**
 * Created by Administrator on 2016/11/4.
 */
class Response<T> constructor() {
    var status: ResponseState = ResponseState.SUCCESS
    var message: String = ""
    var data: T? = null
    var list: MutableList<T>? = null
    var map: MutableMap<Any, Any>? = null
}