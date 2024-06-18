package com.msjo.cleanarchitest.data.apis

import com.msjo.cleanarchitest.data.model.BreadData
import kotlinx.coroutines.Deferred
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query


/**
 * Retrofit 을 이용한 API INTERFACE 목록
 *
 *
 * Created by msjo on 2024. 05..
 */
interface BreadApi {
//    @GET(BuildConfig.API_URL2 + "/front/v1/{midPath}/{lastPath}")
//    suspend fun request(
//        @Path("midPath") midPath: String = HOME_DISP,
//        @Path("lastPath") lastPath: String
//    ): Deferred<BreadData>


    /**
     * <pre>
     * 설명 : 빵 id(다수)에 해당하는 빵 상세 데이터 목록 조회 API INTERFACE
     *
     * </pre>
     *
     * @param ids : 주문할 빵 id 리스트
     *
     * <p>
     *
     * 2024. 05.. msjo
     */
    @GET("/breads")
    suspend fun getBreads(@Query("id") ids: List<Int>): List<BreadData>

    @GET("/bread")
    suspend fun getBread(@Query("id") id: Int): BreadData

    @GET("/bread/details")
    suspend fun getBreadDetails(@Query("id") id: Int): BreadData
}