package com.ravishrajput

import io.micronaut.http.MediaType
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.Produces

@Controller("/api")
class AppController(private val apiRepository: ApiRepository) {

    @Get(uri = "/users")
    @Produces(value = [MediaType.APPLICATION_JSON])
    fun index(): List<User> {
        return apiRepository.getAllData()
    }

}