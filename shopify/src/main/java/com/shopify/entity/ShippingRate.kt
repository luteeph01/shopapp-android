package com.shopify.entity

import java.math.BigDecimal

data class ShippingRate(
    val title: String,
    val price: BigDecimal,
    val handle: String
)