package at.roteskreuz.stopcorona.model.api

import at.roteskreuz.stopcorona.model.entities.infection.exposure_keys.ApiIndexOfDiagnosisKeysArchives
import okhttp3.ResponseBody
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Streaming

/**
 * Description of API for downloading the exposure key archives
 */
interface ContentDeliveryNetworkDescription {

    @GET("exposures/at/index.json")
    suspend fun indexOfDiagnosisKeysArchives(): ApiIndexOfDiagnosisKeysArchives

    @Streaming
    @GET("{fullPathProvidedAsParameter}")
    suspend fun downloadExposureKeyArchive(
        @Path("fullPathProvidedAsParameter", encoded = true) path: String
    ): ResponseBody
}