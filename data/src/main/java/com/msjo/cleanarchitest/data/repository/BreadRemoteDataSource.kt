package com.msjo.cleanarchitest.data.repository

import com.msjo.cleanarchitest.data.apis.BreadApi
import com.msjo.cleanarchitest.data.model.toDomain
import com.msjo.cleanarchitest.domain.entity.BreadEntity
import com.msjo.cleanarchitest.domain.utils.ApiResult

class BreadRemoteDataSource(private val breadApi: BreadApi): BreadDataSource.Remote {

    /**
     * <pre>
     * 설명 : 빵 정보를 외부로부터 실제 조회하는 부분
     *
     * </pre>
     *
     * @param id : 주문할 빵 id
     *
     * <p>
     *
     * 2024. 05.. msjo
     */
    override suspend fun getSelectedBread(id: Int): ApiResult<BreadEntity> = try {
        val result = breadApi.getBread(id)
        // 도메인 형식으로 변환
        ApiResult.Success(result.toDomain())
    } catch (e: Exception) {
        // logError(e)
        ApiResult.Error(e)
    }

    override suspend fun getBreadDetail(id: Int): ApiResult<BreadEntity> = try {
        val result = breadApi.getBreadDetails(id)
        // 도메인 형식으로 변환
        ApiResult.Success(result.toDomain())
    } catch (e: Exception) {
        // logError(e)
        ApiResult.Error(e)
    }
}