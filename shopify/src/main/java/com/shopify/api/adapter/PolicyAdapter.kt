package com.shopify.api.adapter

import com.domain.entity.Policy
import com.shopify.buy3.Storefront

object PolicyAdapter {

    fun adapt(adaptee: Storefront.ShopPolicy?): Policy? {
        return if (adaptee != null) {
            Policy(
                adaptee.title,
                adaptee.body,
                adaptee.url)
        } else {
            null
        }
    }
}