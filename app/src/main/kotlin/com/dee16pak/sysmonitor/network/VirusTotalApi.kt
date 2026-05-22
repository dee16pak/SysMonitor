package com.dee16pak.sysmonitor.network

import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Path

interface VirusTotalApi {
    @GET("files/{file_hash}")
    suspend fun getFileReport(
        @Path("file_hash") fileHash: String,
        @Header("x-apikey") apiKey: String
    ): FileReportResponse
}

data class FileReportResponse(
    val data: FileReportData?
)

data class FileReportData(
    val id: String?,
    val attributes: FileAttributes?
)

data class FileAttributes(
    val last_analysis_stats: AnalysisStats?,
    val last_analysis_results: Map<String, AnalysisResult>?
)

data class AnalysisStats(
    val malicious: Int = 0,
    val suspicious: Int = 0,
    val undetected: Int = 0,
    val harmless: Int = 0
)

data class AnalysisResult(
    val category: String?,
    val engine_name: String?
)
