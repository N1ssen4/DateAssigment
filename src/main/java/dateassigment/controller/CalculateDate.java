package dateassigment.controller;

import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class CalculateDate {

    /*public String calculateDate(@RequestParam int year, int month, int day){
        LocalDate today = LocalDate.now(); //definerer dagens dato
        LocalDate yesterday = LocalDate.of(year, month, day); //Laver mulighed for input af dato
        int diff = today.compareTo(yesterday); //Udregner forskellen
        System.out.println(diff); //printer forskellen
        return "" + diff;*/
    //Virker ikke med måned^^

        public String calcdate(@RequestParam int year, int month, int day){
            LocalDate end = LocalDate.of(year, month, day); //Laver mulighed for input af dato
            long diff = LocalDate.now().until(end, ChronoUnit.DAYS); //Udregner forskellen
            return "" + diff;
        }

    } //http://localhost:8080/date?year=2021&month=2&day=27

