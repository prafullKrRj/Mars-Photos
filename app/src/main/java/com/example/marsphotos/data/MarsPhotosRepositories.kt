package com.example.marsphotos.data

import com.example.marsphotos.model.MarsPhoto
import com.example.marsphotos.network.MarsApiService

interface MarsPhotosRepositories {
    suspend fun getPhotos(): List<MarsPhoto>
}


class NetworkMarsPhotoRepository(
    private val marsApiService: MarsApiService
): MarsPhotosRepositories {
    override suspend fun getPhotos(): List<MarsPhoto> {
        return marsApiService.getPhotos()
    }

}