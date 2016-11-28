package org.fao.fenix.commons.find.dto.filter;


import java.util.Calendar;

public class TimeFilter {

    private static final String MIN = "10000101000000";
    private static final String MAX = "99991231235959";

    public Long from; //seconds when filter metadata
    public Long to; //seconds when filter metadata

    //Utils

    public Long getFrom(int precision) {
        return getFrom(precision, true);
    }
    public Long getFrom(int precision, boolean nullable) {
        String value = from!=null ? from.toString() : (nullable ? null : MIN);
        if (value!=null) {
            int currentPrecision = value.length();

            if (currentPrecision<precision)
                return Long.parseLong(value + MIN.substring(currentPrecision,precision));
            else if (currentPrecision>precision)
                return Long.parseLong(value.substring(0,precision));
            else
                return from;
        } else
            return null;
    }
    public Long getFromTimestamp(boolean nullable) {
        String value = from!=null ? from.toString() : (nullable ? null : MIN);
        if (value!=null) {
            int currentPrecision = value.length();

            Calendar calendar = Calendar.getInstance();
            calendar.set(Calendar.YEAR, Integer.parseInt(value.substring(0,4)));
            calendar.set(Calendar.MONTH, currentPrecision>=6 ? Integer.parseInt(value.substring(4,6))-1 : 0);
            calendar.set(Calendar.DAY_OF_MONTH, currentPrecision>=8 ? Integer.parseInt(value.substring(6,8)) : 1);
            calendar.set(Calendar.HOUR, currentPrecision>=10 ? Integer.parseInt(value.substring(8,10)) : 0);
            calendar.set(Calendar.MINUTE, currentPrecision>=12 ? Integer.parseInt(value.substring(10,12)) : 0);
            calendar.set(Calendar.SECOND, currentPrecision>=14 ? Integer.parseInt(value.substring(12,14)) : 0);
            calendar.set(Calendar.MILLISECOND, 0);

            return calendar.getTimeInMillis();
        } else
            return null;
    }

    public Long getTo(int precision) {
        return getTo(precision, true);
    }
    public Long getTo(int precision, boolean nullable) {
        String value = to!=null ? to.toString() : (nullable ? null : MAX);
        if (value!=null) {
            int currentPrecision = value.length();

            if (currentPrecision<precision) {
                if (currentPrecision==6) {
                    Calendar calendar = Calendar.getInstance();
                    calendar.set((int)(to/100), (int)(to%100), 1);
                    return Long.parseLong(value+calendar.getActualMaximum(Calendar.DAY_OF_MONTH)+(precision>8 ? MAX.substring(currentPrecision+2, precision) : ""));
                } else
                    return Long.parseLong(value + MAX.substring(currentPrecision, precision));
            } else if (currentPrecision>precision)
                return Long.parseLong(value.substring(0,precision));
            else
                return to;
        } else
            return null;
    }
    public Long getToTimestamp(boolean nullable) {
        String value = to!=null ? to.toString() : (nullable ? null : MAX);
        if (value!=null) {
            int currentPrecision = value.length();

            Calendar calendar = Calendar.getInstance();
            calendar.set(Calendar.YEAR, Integer.parseInt(value.substring(0,4)));
            calendar.set(Calendar.MONTH, currentPrecision>=6 ? Integer.parseInt(value.substring(4,6))-1 : 0);
            calendar.set(Calendar.DAY_OF_MONTH, currentPrecision>=8 ? Integer.parseInt(value.substring(6,8)) : calendar.getActualMaximum(Calendar.DAY_OF_MONTH));
            calendar.set(Calendar.HOUR, currentPrecision>=10 ? Integer.parseInt(value.substring(8,10)) : 23);
            calendar.set(Calendar.MINUTE, currentPrecision>=12 ? Integer.parseInt(value.substring(10,12)) : 59);
            calendar.set(Calendar.SECOND, currentPrecision>=14 ? Integer.parseInt(value.substring(12,14)) : 59);
            calendar.set(Calendar.MILLISECOND, 999);

            return calendar.getTimeInMillis();
        } else
            return null;
    }

}
