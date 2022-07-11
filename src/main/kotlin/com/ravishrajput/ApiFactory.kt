package com.ravishrajput

import io.micronaut.context.annotation.Bean
import io.micronaut.context.annotation.Factory
import jakarta.inject.Singleton

@Factory
class ApiFactory {

    @Bean
    @Singleton
    fun apiRepo(): ApiRepository = ApiRepositoryImpl()
}