package org.smart4j.chapter2.util;



/**
 * 数据转换类型工具类
 */
public final class CastUtil {

    /**
     * 转为String类型
     */
    public static String castString(Object obj)
    {
        return CastUtil.castString(obj, "");
    }

    /**
     * 转为String类型 (提供默认值)
     */
    private static String castString(Object obj, String def) {
        return obj != null ? String.valueOf(obj) : def;
    }


    /**
     * 转为double型
     */
    public static double castDouble(Object obj)
    {
        return CastUtil.castDouble(obj, 0);
    }

    /**
     * 转为double型 (提供默认值)
     */
    public static double castDouble(Object obj, double def)
    {
        double doubleVal = def;
        if(obj != null)
        {
            String strVal = castString(obj);
            if(StringUtil.isNotEmpty(strVal))
            {
                try{
                    doubleVal = Double.parseDouble(strVal);
                }catch (NumberFormatException e)
                {
                    doubleVal = def;
                }
            }
        }

        return doubleVal;
    }

    /**
     * 转为long型
     */
    public static long castLong(Object obj)
    {
        return CastUtil.castLong(obj, 0);
    }

    /**
     * 转为long型 (提供默认值)
     */
    public static long castLong(Object obj, long def)
    {
        long longeVal = def;
        if(obj != null)
        {
            String strVal = castString(obj);
            if(StringUtil.isNotEmpty(strVal))
            {
                try{
                    longeVal = Long.parseLong(strVal);
                }catch (NumberFormatException e)
                {
                    longeVal = def;
                }
            }
        }

        return longeVal;
    }

    /**
     * 转为 int 型
     */
    public static int castInt(Object obj)
    {
        return CastUtil.castInt(obj, 0);
    }

    /**
     * 转为 int 型(提供默认值)
     */
    public static int castInt(Object obj, int def)
    {
        int intValue = def;
        if(obj != null)
        {
            String strValue = castString(obj);
            if(StringUtil.isNotEmpty(strValue))
            {
                try{
                    intValue = Integer.parseInt(strValue);
                }catch (NumberFormatException e) {
                    intValue = def;
                }
            }
        }

        return  intValue;
    }

    /**
     * 转为 boolean 型
     */
    public static boolean castBoolean(Object obj)
    {
        return CastUtil.castBoolean(obj, false);
    }

    /**
     * 转为 boolean 型(提供默认值)
     */
    public static boolean castBoolean(Object obj, boolean def)
    {
        boolean booleanVal = def;
        if(obj != null)
        {
            booleanVal = Boolean.parseBoolean(castString(obj));
        }

        return  booleanVal;
    }

}
