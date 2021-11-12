/* Date.java */

public class Date {

  private int month, day, year;
   

  /** Constructs a date with the given month, day and year.   If the date is
   *  not valid, the entire program will halt with an error message.
   *  @param month is a month, numbered in the range 1...12.
   *  @param day is between 1 and the number of days in the given month.
   *  @param year is the year in question, with no digits omitted.
   *              done
   */
  public Date(int month, int day, int year) {
    this.month = month;
    this.day = day;
    this.year = year;

    if(!isValidDate(this.month, this.day, this.year)){
       this.month = 0;
       this.day = 0;
       this.year = 0;
    }
  }

  /** Constructs a Date object corresponding to the given string.
   *  @param s should be a string of the form "month/day/year" where month must
   *  be one or two digits, day must be one or two digits, and year must be
   *  between 1 and 4 digits.  If s does not match these requirements or is not
   *  a valid date, the program halts with an error message.
   *           done
   */
  public Date(String s) {
    String[] date = s.split("/");

    if(date[0].length() == 1 || date[0].length() == 2){
      this.month = Integer.parseInt(date[0]);
    }else{
      this.month = 0;
    }

    if(date[1].length() == 1 || date[1].length() == 2){
      this.day = Integer.parseInt(date[1]);
    }else{
      this.day = 0;
    }

    if(date[2].length() > 0 && date[2].length() < 5){
      this.year = Integer.parseInt(date[2]);
    }else{
      this.year = 0;
    }

  }

  /** Checks whether the given year is a leap year.
   *  @return true if and only if the input year is a leap year.
   *            done
   */
  public static boolean isLeapYear(int year) {
    if(year % 4 == 0 && year % 100 != 0) {
      return true;
    }
    else if(year % 100 == 0 && year % 400 == 0){
      return true;
    }
    else{
      return false;
    }
  }

  /** Returns the number of days in a given month.
   *  @param month is a month, numbered in the range 1...12.
   *  @param year is the year in question, with no digits omitted.
   *  @return the number of days in the given month.
   *        done
   */
  public static int daysInMonth(int month, int year) {
    if(isLeapYear(year) && month == 2){
      return 29;
    }else if(!isLeapYear(year) && month == 2){
      return 28;
    }else if(month != 2 && month > 0 && month < 13){
      switch(month){
        case 1:
        case 3:
        case 5:
        case 7:
        case 8:
        case 10:
        case 12:
          return 31;
        default:
          return 30;
      }
    }
    else{
      return 0;
    }
  }

  /** Checks whether the given date is valid.
   *  @return true if and only if month/day/year constitute a valid date.
   *
   *  Years prior to A.D. 1 are NOT valid.
   *        done
   */
  public static boolean isValidDate(int month, int day, int year) {

    if(year > 0){
      if(month > 0 && month < 13){
        if(day > 0 && day <= daysInMonth(month, year)){
          return true;
        } else{
          return false;
        }
      } else{
        return false;
      }
    } else{
      return false;
    }
  }

  /** Returns a string representation of this date in the form month/day/year.
   *  The month, day, and year are expressed in full as integers; for example,
   *  12/7/2006 or 3/21/407.
   *  @return a String representation of this date.
   *      done
   */
  public String toString() {
    return this.month + "/" + this.day + "/" + this.year;
  }

  /** Determines whether this Date is before the Date d.
   *  @return true if and only if this Date is before d.
   *        done
   */
  public boolean isBefore(Date d) {
    boolean before = false;

    if((this.year - d.year) < 0){
      before = true;
    }
    else if((this.year - d.year) == 0){
      if((this.month - d.month) < 0) {
        before = true;
      }
      else if((this.month - d.month) == 0){
        if((this.day - d.day) < 0){
          before = true;
        }
        else{
          before = false;
        }
      }
    }
    return before;
  }

  /** Determines whether this Date is after the Date d.
   *  @return true if and only if this Date is after d.
   *        done
   */
  public boolean isAfter(Date d) {
    boolean after = false;

    if((this.year - d.year) > 0){
      after = true;
    }
    else if((this.year - d.year) == 0){
      if((this.month - d.month) > 0) {
        after = true;
      }
      else if((this.month - d.month) == 0){
        if((this.day - d.day) > 0){
          after = true;
        }
        else{
          after = false;
        }
      }
    }
    return after;
  }

  /** Returns the number of this Date in the year.
   *  @return a number n in the range 1...366, inclusive, such that this Date
   *  is the nth day of its year.  (366 is used only for December 31 in a leap
   *  year.)
   *          done
   */ 
  public int dayInYear() {

    int daysInYear = 365, dayInYear = 0;

    if(isLeapYear(this.year)) {
      daysInYear++;
    }

    for(int i = 1; i < this.month; i++){
      dayInYear += daysInMonth(i, this.year);
    }

    dayInYear += this.day;
    return dayInYear;
  }

  /** Determines the difference in days between d and this Date.  For example,
   *  if this Date is 12/15/2012 and d is 12/14/2012, the difference is 1.
   *  If this Date occurs before d, the result is negative.
   *  @return the difference in days between d and this date.
   *          done
   */
  public int difference(Date d) {
    int one = 0, two = 0, dif = 0;

    for(int i = 0; i < this.year; i++){
      if(isLeapYear(i)){
        one += 366;
      }else{
        one += 365;
      }
    }
    for(int i = 0; i < d.year; i++){
      if(isLeapYear(i)){
        two += 366;
      }else{
        two += 365;
      }
    }

    one += this.dayInYear();
    two += d.dayInYear();

    dif = one-two;

    return dif;
  }

  /*
  public static void main(String[] argv) {

    System.out.println (Math.sqrt(-16));



  }
   */
}