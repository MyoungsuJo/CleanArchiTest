package com.msjo.cleanarchitest.domain.usecase

import com.msjo.cleanarchitest.domain.entity.BreadEntity
import com.msjo.cleanarchitest.domain.repository.BreadRepository
import com.msjo.cleanarchitest.domain.utils.ApiResult

/**
 * 빵 관련 비지니스 프로세스
 *
 * Created by msjo on 2024. 05..
 */
class BreadOrderDetail(private val breadRepository: BreadRepository) {
    suspend operator fun invoke(id: Int): ApiResult<BreadEntity> = breadRepository.getBreadDetail(id)
}