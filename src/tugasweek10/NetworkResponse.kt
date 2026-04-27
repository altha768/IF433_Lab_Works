package tugasweek10

class NetworkResponse {

    data class ApiResponse<T>(val status: String, val data: T)
}