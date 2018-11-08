package peak.chao.androidautoupdate.util

import android.util.Log

/**
 * 季节工具类
 */
object SeasonUtil {

    /**
     * 根据月份获取季节
     */
    fun getSeason(month: Int? = null) {
        when (month ?: TimeUtil.getMonth().toInt()) {
            //春天
            in 3..5 -> {
                Log.e("TAG", "春天")
            }
            //夏天
            in 6..8 -> {
                Log.e("TAG", "夏天")
            }
            //秋天
            in 9..11 -> {
                Log.e("TAG", "秋天")
            }
            //冬天
            12, 1, 2 -> {
                Log.e("TAG", "冬天")
            }
        }
    }

}