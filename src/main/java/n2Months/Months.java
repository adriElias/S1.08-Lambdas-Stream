package n2Months;

import java.util.List;

public class Months {
    List<String> months = List.of("January",
                                            "February",
                                            "March",
                                            "April",
                                            "May",
                                            "June",
                                            "July",
                                            "August",
                                            "September",
                                            "October",
                                            "November",
                                            "December");

    public void printMonth(){
        months.forEach(month -> System.out.println(month));
    }
    public void printMonthReferences(){
        months.forEach(System.out::println);
    }
}
