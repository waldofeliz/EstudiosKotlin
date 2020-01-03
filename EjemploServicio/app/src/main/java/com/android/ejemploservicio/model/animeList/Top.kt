package com.android.ejemploservicio.model.animeList

import com.google.gson.annotations.SerializedName

/*
Copyright (c) 2020 Kotlin Data Classes Generated from JSON powered by http://www.json2kotlin.com

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.

For support, please feel free to contact me at https://www.linkedin.com/in/syedabsar */


data class Top (

	@SerializedName("mal_id") val mal_id : Int? = null,
	@SerializedName("rank") val rank : Int? = null,
	@SerializedName("title") val title : String? = null,
	@SerializedName("url") val url : String? = null,
	@SerializedName("image_url") val image_url : String? = null,
	@SerializedName("type") val type : String? = null,
	@SerializedName("episodes") val episodes : Int? = null,
	@SerializedName("start_date") val start_date : String? = null,
	@SerializedName("end_date") val end_date : String? = null,
	@SerializedName("members") val members : Int? = null,
	@SerializedName("score") val score : Double? = null
)