package Projects.Project6;

/**
 * This course project is copyright of CyberTek ©CyberTek[2017]. All rights reserved.
 * Any redistribution or reproduction of part or all of the contents in any form is
 * prohibited without the express consent of CyberTek.
 */


// import static org.junit.Assert.assertEquals;

import java.util.Calendar;

public class Date implements Comparable<Date>{

    private static final int[] DAYS = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    protected final int month;
    protected final int day;
    protected final int year;

    /*
     * Initialized a new date from the month, day and year.
     * @param month the month (between 1 and 12)
     * @param day the day (between 1 and 28-31, depending on the month)
     * @param year the year

     */


    public Date(int month, int day, int year){
        if(!isValid(month, day, year)){
            System.out.println("Invalid Date");
            throw new IllegalArgumentException();
        }
        this.month = month;
        this.day = day;
        this.year =year;

    }

    /*
     * @return month of that month
     */
    public int getMonth(){
        return this.month;
    }

    /*
     * @return day of that day
     */
    public int getDay(){
        return this.day;
    }

    /*
     * @return year of that year
     */
    public int getYear(){
        return this.year;
    }

    /**
     * This method checks if a given date is a valid calendar date
     *
     * @param m  month
     * @param d  day
     * @param y  year. (A year is no less than 1900, and no greater than 2100)
     * @return  true if the given date is a valid calendar date. false otherwise
     */
    public static boolean isValid(int m, int d, int y){
        if(y >= 1900 && y <= 2100){
            if(m >= 1 && m <=12){
                if(d >=1 && d <= DAYS[m]){
                    return true;
                }
            }
        }
        return false;
    }


    /**
     * @param year
     * @return true if the given year is a leap year. false otherwise.
     */
    public static boolean isLeapYear(int year){
        if(year % 4 == 0){
            return true;
        }
        return false;
    }

    /**
     * Compare this date to that date.
     * @return {a negative integer or zero or a positive integer}, depending on whether
     * this date is {before, equal to, after} that date
     */

    public int compareTo(Date that) {
        if(isValid(that.month, that.day, that.year)){
            if(that.year > this.year){
                return -1;
            }
            else if(that.year < this.year){
                return 1;
            }else{
                if(that.month > this.month){
                    return -1;
                }else if(that.month < this.month){
                    return 1;
                }else{
                    if(that.day > this.day){
                        return -1;
                    }else if(that.day < this.day){
                        return 1;
                    }else{
                        return 0;
                    }
                }
            }
        }

        return 0;
    }

    /**
     * Return a string representation of this date.
     * @return the string representation in the format MM/DD/YYYY
     */
    public String toString(){

        return this.month+"/"+this.day+"/"+this.year;
    }


    /**
     *
     * @return the word representation of the date.
     * Example: (new Date(12,1,2017)).dateToWords() returns "December One Two Thousand Seventeen"
     */
    public String dateToWords() {
        String[] monthWords = {"January", "February", "March", "April", "May", "June", "July", "August", "September","October", "November", "December"};
        String[] numbersLessThanTen = {"One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten"};
        String[] numbersBetweenTenAndTwenty = {"Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
        String[] multiplesOfTen = {"Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
        String[] yearWords = {"Hundred", "Thousand"};

        String newDateToString ="";
        newDateToString += monthWords[this.month-1] + " ";
        if(this.day <= 10){
            newDateToString += numbersLessThanTen[this.day -1] +" ";
        }else if(this.day >10 && this.day < 20){
            newDateToString += numbersBetweenTenAndTwenty[this.day%10 -1];
        }else if(this.day > 19 && this.day < 30){
            newDateToString += multiplesOfTen[1] + " ";
            if(this.day % 20 > 0){
                newDateToString += numbersLessThanTen[this.day % 20 -1] + " ";
            }
        }else{
            newDateToString += multiplesOfTen[2] + " ";
            if(this.day == 31){
                newDateToString+= numbersLessThanTen[this.day % 30 -1] + " ";
            }
        }

        //start first two digits of the year

        newDateToString += numbersLessThanTen[this.year/1000 -1] + " ";//1967 % 1000 =967 //2000
        newDateToString += yearWords[1] + " ";                        // 967/100=9
        if(((this.year%1000)/100)>0){
            newDateToString += numbersLessThanTen[((this.year%1000)/100) -1] + " ";
            newDateToString += yearWords[0] + " ";
        }
        //End first two digits of the year

        // Last two digits of the year
        int lastTwoDigitsOfTheYear = this.year%100;  // 1956 % 100 =56
        if (lastTwoDigitsOfTheYear > 0 && lastTwoDigitsOfTheYear < 10){ //1906 % 100 =6
            newDateToString += numbersLessThanTen[lastTwoDigitsOfTheYear-1] + " ";
        }else if(lastTwoDigitsOfTheYear >=10 && lastTwoDigitsOfTheYear < 20){// 1919 % 100 =19
            newDateToString += numbersBetweenTenAndTwenty[(lastTwoDigitsOfTheYear%10)-1] + " ";//19 % 10 =9
        }

        else if(lastTwoDigitsOfTheYear >=20 && lastTwoDigitsOfTheYear < 100) { // 2089 % 100 = 89
            newDateToString += multiplesOfTen[(lastTwoDigitsOfTheYear/10)-1] + " "; // 89 /10 = 8
            if (lastTwoDigitsOfTheYear%10 > 0){
                newDateToString += numbersLessThanTen[(lastTwoDigitsOfTheYear%10)-1]+" ";// 89 % 10 = 9
            }
        }

        return newDateToString;
    }

    public int age(){
        Calendar cal = Calendar.getInstance();
        int d = cal.get(Calendar.DAY_OF_MONTH);
        int m = cal.get(Calendar.MONTH);		//starts from 0 to 11
        int y = cal.get(Calendar.YEAR);

        int age = 0;

        if(this.year < y){
            age = y - this.year;
        }

        return age;
    }


}
