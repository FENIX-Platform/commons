package org.fao.fenix.commons.msd.utils;

//import org.fao.fenix.commons.msd.dto.type.dsd.DSDDataType;

import java.util.*;

public class DataUtils {

    public static Date roundDate(Date date) {
        if (date != null) {
            Calendar c = Calendar.getInstance();
            c.setTime(date);
            c.set(Calendar.HOUR,0);
            c.set(Calendar.MINUTE,0);
            c.set(Calendar.SECOND,0);
            c.set(Calendar.MILLISECOND,0);
            return c.getTime();
        } else {
            return null;
        }
    }

    public static Date fromStringToDate(String yearName, String month, String day, boolean start) {
        if (yearName!=null && !"".equals(yearName.trim())) {
            Calendar calendar = Calendar.getInstance();
            if (start) {
                calendar.set(Integer.parseInt(yearName.trim()), month!=null ? Integer.parseInt(month) : Calendar.JANUARY, day!=null ? Integer.parseInt(day) : 1, 0, 0, 0);
                calendar.set(Calendar.MILLISECOND,0);
            } else {
                calendar.set(Integer.parseInt(yearName.trim()), month!=null ? Integer.parseInt(month) : Calendar.DECEMBER, day!=null ? Integer.parseInt(day) : 31, 23, 59, 59);
                calendar.set(Calendar.MILLISECOND,999);
            }
            return calendar.getTime();
        } else
            return null;
    }

    public static Collection<Long> dateToNumber (Collection<?> values/*, DSDDataType dateType*/) throws Exception {
/*        if(values!=null) {
            Collection<Long> dates = new LinkedList<Long>();
            long number;
            for (Object value : values)
                if ((number=dateToNumber(value,dateType))==-1)
                    throw new Exception("Cannot convert date "+value+" to type "+dateType);
                else
                    dates.add(number);
            return dates;
        }
*/        return null;
    }
    private static long dateToNumber(Object value/*, DSDDataType dateType*/) {
/*        if (value!=null && (dateType==DSDDataType.year || dateType==DSDDataType.month || dateType==DSDDataType.date)) {
            if (value instanceof Date) {
                Calendar c = Calendar.getInstance();
                c.setTime((Date)value);
                switch (dateType) {
                    case year: return c.get(Calendar.YEAR);
                    case month: return c.get(Calendar.YEAR)*100+c.get(Calendar.MONTH);
                    case date: return c.get(Calendar.YEAR)*10000+c.get(Calendar.MONTH)*100+c.get(Calendar.DATE);
                }
            }
            if (value instanceof Number) {
                long number = ((Number) value).longValue();
                int digits = Long.toString(number).length();

                if (digits>4)
                    if (digits>6)
                        if (digits>8) { //timestamp
                            Calendar c = Calendar.getInstance();
                            c.setTime(new Date(number));
                            switch (dateType) {
                                case year: return c.get(Calendar.YEAR);
                                case month: return c.get(Calendar.YEAR)*100+c.get(Calendar.MONTH);
                                case date: return c.get(Calendar.YEAR)*10000+c.get(Calendar.MONTH)*100+c.get(Calendar.DATE);
                            }
                        } else //day
                            switch (dateType) {
                                case year: return number/10000;
                                case month: return number/100;
                                case date: return number;
                            }
                    else //month
                        switch (dateType) {
                            case year: return number/100;
                            case month: return number;
                            case date: return number*100+1;
                        }
                else //year
                    switch (dateType) {
                        case year: return number;
                        case month: return number*100;
                        case date: return number*1000+1;
                    }
            }
        }
*/        return -1;
    }

    public static Collection<Long> getTimeSeries (Date from, Date to/*, DSDDataType dataType*/) throws Exception {
/*        if (from!=null && to!=null) {
            Calendar cf = Calendar.getInstance();
            cf.setTime(roundDate(from));
            Calendar ct = Calendar.getInstance();
            ct.setTime(roundDate(to));
            Collection<Long> series = new LinkedList<Long>();
            switch (dataType) {
                case year:
                    for (long f = getYear(from,true),t = getYear(to,false); f<=t; series.add(f++));
                    break;
                case month:
                    for (long f = getMonth(from,true), t = getMonth(to,false); f<=t; f=(f%100==11?(f/100+1)*100:f+1))
                        series.add(f);
                    break;
                case date:
                    for (;cf.compareTo(ct)<=0;cf.add(Calendar.DATE,1))
                        series.add((long)getDay(cf));
                    break;
                default:
                    throw new Exception("Unsupported data type "+dataType+" as destination for date conversion");
            }
            return series;
        }
*/        return null;
    }


    public static int getYear (Date date, boolean from) {
        Calendar cF = Calendar.getInstance();
        cF.setTime(date);
        if (from)
            return cF.get(Calendar.YEAR) + (cF.get(Calendar.DATE)==1 && cF.get(Calendar.MONTH)==0 ? 0 : 1);
        else
            return cF.get(Calendar.YEAR) - (cF.get(Calendar.DATE)==31 && cF.get(Calendar.MONTH)==11 ? 0 : 1);
    }
    public static int getMonth (Date date, boolean from) {
        Calendar cF = Calendar.getInstance();
        cF.setTime(date);
        if (from && cF.get(Calendar.DATE)>1)
            cF.add(Calendar.MONTH,1);
        else if (!from && cF.get(Calendar.DATE)<cF.getMaximum(Calendar.DATE))
            cF.add(Calendar.MONTH,-1);
        return cF.get(Calendar.YEAR)*100+cF.get(Calendar.MONTH);
    }
    public static int getDay (Calendar c) {
        return c.get(Calendar.YEAR)*10000+c.get(Calendar.MONTH)*100+c.get(Calendar.DAY_OF_MONTH);
    }



    public static <T> Set<T> toSet(Collection<T> array) {
        return array==null ? new HashSet<T>() : new HashSet<>(array);
    }
    public static <T> List<T> toList(Collection<T> array) {
        return array==null ? new LinkedList<T>() : new LinkedList<>(array);
    }


}
