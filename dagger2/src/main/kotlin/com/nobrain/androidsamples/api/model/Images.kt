package com.nobrain.androidsamples.api.model

import java.util.*

data class Images(var result: Int = 0,
                  var pageCount: Int = 0,
                  var title: String? = null,
                  var totalCount: Int = 0,
                  var description: String? = null,
                  var item: List<Image> = ArrayList<Image>())
