package com.example.web.entity

import javax.persistence.*

/**
 * Created by Administrator on 2016/10/26.
 */
@Entity
class Reservation {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    var id: Long? = null
    @Column
    var name: String? = null

    constructor() {
    }

    constructor(id: Long?, name: String) {
        this.id = id
        this.name = name
    }
}
