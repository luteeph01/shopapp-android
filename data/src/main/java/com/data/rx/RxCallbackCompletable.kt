package com.data.rx

import com.client.shop.gateway.ApiCallback
import com.client.shop.gateway.entity.Error
import io.reactivex.CompletableEmitter

class RxCallbackCompletable(private val emitter: CompletableEmitter) : ApiCallback<Unit> {

    override fun onResult(result: Unit) {
        if (!emitter.isDisposed) {
            emitter.onComplete()
        }
    }

    override fun onFailure(error: Error) {
        if (!emitter.isDisposed) {
            emitter.onError(error)
        }
    }
}