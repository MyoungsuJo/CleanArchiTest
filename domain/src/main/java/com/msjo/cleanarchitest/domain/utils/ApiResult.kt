package com.msjo.cleanarchitest.domain.utils


/**
 * 빵 관련 응답처리
 *
 * Created by msjo on 2024. 05..
 */
sealed class ApiResult<T>{
    class Success<T>(val data: T) : ApiResult<T>()
    data class Error<T>(val error: Throwable) : ApiResult<T>()
//    class Error<out T : Any>(val data: T) : ApiResult<T>()
//    class Error(val exception: Throwable) : Response<Nothing>()
}
