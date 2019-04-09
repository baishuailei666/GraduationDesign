package sms.util;

import java.sql.Date;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * 时间转换工具类
 * @author baishuailei
 * @date 2018-04-12
 */
public class DatetimeUtil {

    private final static String datetimeFormat = "yyyy-MM-dd HH:mm:ss";

    private final static String dateFormat = "yyyy-MM-dd";
    /**
     * 得到java.sql.Date
     *
     * @param strDate String type
     * @return java.sql.Date object
     * @throws ParseException parseException
     */
    public static Date getDate(String strDate) {
        Date date = null;
        try {
            date = new Date(new SimpleDateFormat(dateFormat).parse(strDate).getTime());
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }


    public static String getDate(long strDate){
        SimpleDateFormat format =  new  SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        java.util.Date date = new java.util.Date();
        return format.format(date.getTime());

    }
}
