package com.example.complamap.model

import com.google.firebase.Timestamp
import com.google.firebase.firestore.GeoPoint

data class Complaint(
    val category: String? = null,
    var photo: String? = null,
    var creation_date: Timestamp? = null,
    val location: GeoPoint? = null,
    val description: String? = null,
    var approvals: Long? = null,
    var rejections: Long? = null,
    val status: String? = null,
    val followers: List<String>? = null,
    val creator: String? = null,
    var address: String? = null,
    var creation_day: String? = null
)
