package com.example.web.repository

import com.example.web.entity.Reservation
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

/**
 * Created by Administrator on 2016/10/26.
 */
@Repository
interface ReservationRepository : CrudRepository<Reservation, Long>{

     fun findByName(name:String):List<Reservation>
}
