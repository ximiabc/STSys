package cn.lzf.stsys.util;
import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 * 时间辅助
 * @author Administrator
 *
 */
public class DateUtil {
	
	/**
	 * 唯一标识码
	 * @return
	 */
	public static String getDateUUID(){
		Format format = new SimpleDateFormat("mmssSSS");
		return format.format(new Date());
	}
	/**
	 * 获取年月日
	 * @param date
	 * @return
	 */
	public static String getYMD(Date date){
		if(date==null){
	        return "无";			
			}else{
				
				SimpleDateFormat sFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
				String datestr= sFormat.format(date);
				String datestrs[]=datestr.split(" ");
				return datestrs[0];
			}
	}
	
	/**
	 * 获取年月日时分
	 * @param date
	 * @return
	 */
	public static String getDates(Date date){
		if(date==null){
	        return "无";			
			}else{
				
				SimpleDateFormat sFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
				String datestr= sFormat.format(date);
				return datestr;
			}
	}
	
	/**
	 * 获取年月日
	 * @param date
	 * @return
	 */
	public static String getDate(Date date){
		if(date==null){
	        return "无";			
			}else{
				
				SimpleDateFormat sFormat = new SimpleDateFormat("yyyy-MM-dd");
				String datestr= sFormat.format(date);
				return datestr;
			}
	}
	
	/**
	 * 获取时分秒
	 * @param date
	 * @return
	 */
	public static String getHMS(Date date){
		if(date==null){
        return "无";			
		}else{
			
			SimpleDateFormat sFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			String datestr= sFormat.format(date);
			String datestrs[]=datestr.split(" ");
			return datestrs[1];
		}
	}
	/**
	 * 时间辅助   字符串转化为Date
	 * @throws ParseException
	 */
	public static Date[] StringToDate(String start,String end,Date startDate,Date endDate){
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		try {
			endDate = sdf.parse(end);
			startDate = sdf.parse(start);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Date dates[] = new Date[2];
		dates[0]=startDate;
		dates[1]=endDate;
		return dates;
	}
}
