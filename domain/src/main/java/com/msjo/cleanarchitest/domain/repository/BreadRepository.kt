package com.msjo.cleanarchitest.domain.repository

import com.msjo.cleanarchitest.domain.entity.BreadEntity
import com.msjo.cleanarchitest.domain.utils.ApiResult

/**
 * 빵 관련 비지니스 로직들..
 * - data 모듈쪽의 상세 구현으로부터 분리
 *
 *
 * Created by msjo on 2024. 05..
 */
interface BreadRepository {
    /**
     * <pre>
     * 설명 : 빵 일반정보(상세정보 x)
     *
     * </pre>
     *
     * @param id : 조회할 빵 id
     *
     * <p>
     *
     * 2024. 05.. msjo
     */
    suspend fun getSelectedBread(id: Int): ApiResult<BreadEntity>

    /**
     * <pre>
     * 설명 : 빵 상세정보 조회용
     *
     * </pre>
     *
     * @param id : 조회할 빵 id
     *
     * <p>
     *
     * 2024. 05.. msjo
     */
    suspend fun getBreadDetail(id: Int): ApiResult<BreadEntity>
}