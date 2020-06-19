package IntervewTasks;

import org.w3c.dom.ls.LSOutput;

public class SpellingNumbers {

    public static String numbersToWords(int number){
        String numberWords = "";

        String[] numbersLessThanTen = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten"};
        String[] numbersBetweenTenAndTwenty = {"Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
        String[] multiplesOfTen = {"Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
        String[] multiplesOfHundred = {"Hundred", "Thousand"};

        if(number < 10){
            numberWords = numbersLessThanTen[number];
        }else if(number >= 10 && number < 20){
            if(number % 10 == 0){
                numberWords = multiplesOfTen[number/10 - 1];
            }else{
                numberWords = numbersBetweenTenAndTwenty[number % 10 - 1];
            }
        }else if(number >= 20 && number < 100){
            numberWords += multiplesOfTen[number / 10 - 1];
            if(number % 10 > 0){
                numberWords += " " + numbersLessThanTen[number % 10];
            }
        }else if(number >= 100 && number < 1000){
            numberWords += numbersLessThanTen[number / 100] + " " + multiplesOfHundred[0];
            if(number % 100 >= 10 && number % 100 < 20){
                if(number % 10 == 0){
                    numberWords += " " + multiplesOfTen[(number % 100)/10 - 1];
                }else{
                    numberWords += " " + numbersBetweenTenAndTwenty[number % 10 - 1];
                }
            }else if(number % 100 < 10 && number % 100 > 0){
                numberWords += " " + numbersLessThanTen[number % 100];
            }else if(number % 100 >= 20 && number % 100 < 100){
                numberWords +=  " " + multiplesOfTen[(number % 100) / 10 - 1];
                if(number % 10 > 0){
                    numberWords += " " + numbersLessThanTen[number  % 10];
                }
            }

        }else if(number >= 1000 && number < 10000){
            numberWords += numbersLessThanTen[number / 1000] + " " + multiplesOfHundred[1];

            if(number % 1000 >= 100){
                numberWords += " " + numbersLessThanTen[number % 1000 / 100] + " " + multiplesOfHundred[0];
                if(number % 100 >= 10 && number % 100 < 20){
                    if(number % 10 == 0){
                        numberWords += " " + multiplesOfTen[(number % 100)/10 - 1];
                    }else{
                        numberWords += " " + numbersBetweenTenAndTwenty[number % 10 - 1];
                    }
                }else if(number % 100 < 10 && number % 100 > 0){
                    numberWords += " " + numbersLessThanTen[number % 100];
                }else if(number % 100 >= 20 && number % 100 < 100){
                    numberWords +=  " " + multiplesOfTen[(number % 100) / 10 - 1];
                    if(number % 10 > 0){
                        numberWords += " " + numbersLessThanTen[number  % 10];
                    }
                }

            }else if(number % 1000 >= 20 && number % 1000 < 100){
                numberWords += " " + multiplesOfTen[number % 1000 / 10 - 1];
                if(number % 10 > 0){
                    numberWords += " " + numbersLessThanTen[number  % 10];
                }
            }else if(number % 1000 >= 10 && number % 1000 < 20){
                if(number % 1000 == 10){
                    numberWords += " " + multiplesOfTen[(number % 1000)/10 - 1];
                }else{
                    numberWords += " " + numbersBetweenTenAndTwenty[number % 10 - 1];
                }
            }else{
                numberWords += " " + numbersLessThanTen[number % 10];
            }

        }

        return numberWords;
    }

    public static void main(String[] args) {
        System.out.println(numbersToWords(9899));
    }

}
