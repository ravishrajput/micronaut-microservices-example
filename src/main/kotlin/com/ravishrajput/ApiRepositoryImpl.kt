package com.ravishrajput

class ApiRepositoryImpl : ApiRepository {
    override fun getAllData(): List<User> {
        // TODO remove dummy data & integrate db
        return listOf(
                User(1, "Dhruv Rajput", "dhruv@rajput.com"),
                User(2, "Ronav Rajput", "ronav@rajput.com")
        )
    }
}