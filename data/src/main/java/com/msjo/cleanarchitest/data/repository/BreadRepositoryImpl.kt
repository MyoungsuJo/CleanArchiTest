package com.msjo.cleanarchitest.data.repository

import com.msjo.cleanarchitest.domain.entity.BreadEntity
import com.msjo.cleanarchitest.domain.repository.BreadRepository
import com.msjo.cleanarchitest.domain.utils.ApiResult


/**
 * 빵 관련 비지니스로직(도메인)과 DataSource를 가져와 구현
 *
 * Created by msjo on 2024. 05..
 */
class BreadRepositoryImpl(private val remote: BreadDataSource.Remote) : BreadRepository {
    override suspend fun getSelectedBread(id: Int): ApiResult<BreadEntity> = remote.getSelectedBread(id)
    override suspend fun getBreadDetail(id: Int): ApiResult<BreadEntity> = remote.getBreadDetail(id)
}