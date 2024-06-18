package com.msjo.cleanarchitest.data.repository

import com.msjo.cleanarchitest.data.model.BreadData
import com.msjo.cleanarchitest.domain.entity.BreadEntity
import com.msjo.cleanarchitest.domain.utils.ApiResult

interface BreadDataSource {
    interface Remote{
        suspend fun getSelectedBread(id: Int): ApiResult<BreadEntity>
        suspend fun getBreadDetail(id: Int): ApiResult<BreadEntity>
    }

    interface Local{
        // Room 이나 로컬데이터베이스 혹은 프리퍼런스로의 요청..
    }
}