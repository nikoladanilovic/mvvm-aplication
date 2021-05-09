package hr.ferit.nikoladanilovic.mvvm.data.api

class ApiHelper(private val apiService: ApiService) {

    fun getUsers() = apiService.getUsers()

}