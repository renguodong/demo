package cn.rgd.util;

public class StringConvert {
	public static String firstUpper(String str) {
		return str.substring(0).toUpperCase() + str.substring(1, str.length()-1);
	}
	public static String firstLower(String str) {
		return str.substring(0).toLowerCase() + str.substring(1, str.length()-1);
	}
}
