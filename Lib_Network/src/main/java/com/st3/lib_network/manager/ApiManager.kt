package com.sum.network.manager

import com.st3.lib_network.api.ApiInterface


/**
 * @desc   API管理器
 */
object ApiManager {
    val api by lazy { HttpManager.create(ApiInterface::class.java) }
}