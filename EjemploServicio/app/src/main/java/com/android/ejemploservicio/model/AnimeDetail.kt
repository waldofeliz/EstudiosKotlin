import com.google.gson.annotations.SerializedName

/*
Copyright (c) 2019 Kotlin Data Classes Generated from JSON powered by http://www.json2kotlin.com

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.

For support, please feel free to contact me at https://www.linkedin.com/in/syedabsar */


data class AnimeDetail (

	@SerializedName("request_hash") val request_hash : String? = null,
	@SerializedName("request_cached") val request_cached : Boolean? = null,
	@SerializedName("request_cache_expiry") val request_cache_expiry : Int? = null,
	@SerializedName("mal_id") val mal_id : Int? = null,
	@SerializedName("url") val url : String? = null,
	@SerializedName("image_url") val image_url : String? = null,
	@SerializedName("trailer_url") val trailer_url : String? = null,
	@SerializedName("title") val title : String? = null,
	@SerializedName("title_english") val title_english : String? = null,
	@SerializedName("title_japanese") val title_japanese : String? = null,
	@SerializedName("title_synonyms") val title_synonyms : List<String>? = null,
	@SerializedName("type") val type : String? = null,
	@SerializedName("source") val source : String? = null,
	@SerializedName("episodes") val episodes : Int? = null,
	@SerializedName("status") val status : String? = null,
	@SerializedName("airing") val airing : Boolean? = null,
	@SerializedName("aired") val aired : Aired? = null,
	@SerializedName("duration") val duration : String? = null,
	@SerializedName("rating") val rating : String? = null,
	@SerializedName("score") val score : Double? = null,
	@SerializedName("scored_by") val scored_by : Int? = null,
	@SerializedName("rank") val rank : Int? = null,
	@SerializedName("popularity") val popularity : Int? = null,
	@SerializedName("members") val members : Int? = null,
	@SerializedName("favorites") val favorites : Int? = null,
	@SerializedName("synopsis") val synopsis : String? = null,
	@SerializedName("background") val background : String? = null,
	@SerializedName("premiered") val premiered : String? = null,
	@SerializedName("broadcast") val broadcast : String? = null,
	@SerializedName("related") val related : Related? = null,
	@SerializedName("producers") val producers : List<Producers>? = null,
	@SerializedName("licensors") val licensors : List<Licensors>? = null,
	@SerializedName("studios") val studios : List<Studios>? = null,
	@SerializedName("genres") val genres : List<Genres>? = null,
	@SerializedName("opening_themes") val opening_themes : List<String>? = null,
	@SerializedName("ending_themes") val ending_themes : List<String>? = null
)