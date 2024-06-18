package com.msjo.cleanarchitest.di

import com.msjo.cleanarchitest.data.apis.BreadApi
import com.msjo.cleanarchitest.data.repository.BreadDataSource
import com.msjo.cleanarchitest.data.repository.BreadRemoteDataSource
import com.msjo.cleanarchitest.data.repository.BreadRepositoryImpl
import com.msjo.cleanarchitest.domain.repository.BreadRepository
import com.msjo.cleanarchitest.domain.usecase.BreadOrderDetail
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
class DataModule {


    @Provides
    @Singleton
    fun provideMovieRemoteDataSource(
        movieApi: BreadApi
    ): BreadDataSource.Remote {
        return BreadRemoteDataSource(movieApi)
    }

    @Provides
    @Singleton
    fun provideBreadRepository(
        movieRemote: BreadDataSource.Remote
    ): BreadRepository {
        return BreadRepositoryImpl(movieRemote)
    }

    /**
     * <pre>
     * 설명 : BreadViewModel 생성자에 주입되는 제공자
     *
     * </pre>
     *
     * <p>
     *
     * 2024. 05.. msjo
     */
    @Provides
    fun provideBreadOrderDetailUseCase(breadRepository: BreadRepository): BreadOrderDetail {
        return BreadOrderDetail(breadRepository)
    }
}