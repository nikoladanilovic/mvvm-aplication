package hr.ferit.nikoladanilovic.mvvm.data.api

import hr.ferit.nikoladanilovic.mvvm.data.model.User
import io.reactivex.Single

interface ApiService {

    fun getUsers(): Single<List<User>>

}