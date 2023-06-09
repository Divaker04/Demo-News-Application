package com.example.myapplication000

data class Result(
    val approved: String,
    val available_for_patient: String,
    val cess_percentage: Int,
    val content: String,
    val directions: String,
    val discontinued: String,
    val dosage_type: String,
    val gst_percentage: Int,
    val gtin_number: String,
    val hsn_code: String,
    val image: String,
    val inventory_id: Int,
    val location: String,
    val lock_discount: String,
    val manufacturer_name: String,
    val max_quantity: Int,
    val medicine_id: Int,
    val medicine_name: String,
    val medicine_name_suggest: String,
    val medicine_type: String,
    val min_quantity: Int,
    val mrp: Double,
    val pack_size: String,
    val packing_size: String,
    val price: String,
    val quantity: Int,
    val sale_count: Int,
    val sale_discount: Int,
    val salt_content_id: String,
    val schedule_type: String,
    val sell_in_loose: String,
    val size: String,
    val slug: String
)