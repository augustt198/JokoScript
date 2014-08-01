package me.august.jokoscript.util;

/**
 * Created by August on 7/26/14.
 * <p/>
 * Purpose Of File:
 * <p/>
 * Latest Change:
 */
public class StringUtils {

	public static String repeat(String src, int times) {
		StringBuilder builder = new StringBuilder(src.length() * times);
		for(int i = 0; i < times; i++) {
			builder.append(src);
		}
		return builder.toString();
	}

}
