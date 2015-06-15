package org.fao.fenix.commons.find.dto.filter;


import java.util.Calendar;

public class TimeFilter {

    private static final String MIN = "10000101000000";
    private static final String MAX = "99991231235959";

    public Long from; //seconds when filter metadata
    public Long to; //seconds when filter metadata

    //Utils

    public Long getFrom(int precision) {
        if (from!=null) {
            String value = from.toString();
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

    public Long getTo(int precision) {
        if (to!=null) {
            String value = to.toString();
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

}
