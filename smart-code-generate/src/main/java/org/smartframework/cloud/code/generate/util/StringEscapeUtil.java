package org.smartframework.cloud.code.generate.util;

import lombok.experimental.UtilityClass;

/**
 * 字符串转义工具类
 * 
 * @author liyulin
 * @date 2019-07-15
 */
@UtilityClass
public class StringEscapeUtil {
	
	/**
	 * 转义表 字段备注
	 * 
	 * @param comment
	 * @return
	 */
	public static String secapeComment(String comment) {
		// 转义双引号
		return comment.replaceAll("\"", "\\\\\"");
	}
	
}