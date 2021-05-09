package hr.ferit.nikoladanilovic.mvvm.data.repository

import hr.ferit.nikoladanilovic.mvvm.data.model.User
import hr.ferit.nikoladanilovic.mvvm.data.api.ApiHelper
import io.reactivex.Single

class MainRepository (private val apiHelper: ApiHelper) {
    fun getUsers(): Single<List<User>> {
        return apiHelper.getUsers()
    }
}