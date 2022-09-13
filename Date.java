public class Date {
    private int day;
    private int month ; 
    private int year; 
    private static final int[] daysPerMonth = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
    public Date (int day , int month , int year ){
        if (month <= 0 || month > 12)
 throw new IllegalArgumentException("month (" + month + ") must be 1-12");
        if (day <= 0 ||
        (day > daysPerMonth[month] && !(month == 2 && day == 29)))
throw new IllegalArgumentException("day (" + day + ") out-of-range for the specified month and year");
    if (month == 2 && day == 29 && !(year % 400 == 0 ||
    (year % 4 == 0 && year % 100 != 0)))
    throw new IllegalArgumentException("day (" + day + ") out-of-range for the specified month and year"); 
        this.day = day;
        this.month = month; 
        this.year = year ; 
    }
    public void setday(int day )
    { 
         if(day  > 0 )
        this.day = day ; 
    }
    public int getday(){ 
        return day; 
    }
    public void setmonth(int month )
    { 
         if(month  > 0 )
        this.month = month; 
    }
    public int getmonth(){ 
        return month; 
    }
    public void setyear (int year )
    { 
         if(year  > 0 )
        this.year = year ; 
    }
    public int getyear(){ 
        return year ;  
    }
    public String toString(){
    return String.format(" %d/%d/%d   ", getday() , getmonth() , getyear());
    }
}

