package peak.chao.androidautoupdate.util

import java.text.SimpleDateFormat
import java.util.*

object TimeUtil {
    val simpleDateFormat = SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
    val dateFormat = SimpleDateFormat("yyyy-MM-dd")
    val timeFormat = SimpleDateFormat("HH:mm:ss")

    val yearFormat = SimpleDateFormat("yyyy")
    val monthFormat = SimpleDateFormat("MM")
    val dayFormat = SimpleDateFormat("dd")

    /**
     * 获取日期 yyyy-MM-dd
     */
    fun getDate() = dateFormat.format(Date())

    /**
     * 获取时间 HH:mm:ss
     */
    fun getTime() = timeFormat.format(Date())

    /**
     * 获取时间日期 yyyy-MM-dd HH:mm:ss
     */
    fun getDateTime() = simpleDateFormat.format(Date())

    /**
     * 获取年
     */
    fun getYear() = yearFormat.format(Date())

    /**
     * 获取月
     */
    fun getMonth() = monthFormat.format(Date())

    /**
     * 获取日
     */
    fun getDay() = dayFormat.format(Date())
}