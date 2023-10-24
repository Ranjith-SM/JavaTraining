package Practice_Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Pdate {

    public static void main(String[] args) throws ParseException {

//        Date date =new Date();
//        String dat= "23.10.20234";
//        System.out.println(date);

        SimpleDateFormat sdate = new SimpleDateFormat("dd/MM/yyyy");
        Date date = sdate.parse("31/03/2015");
//        date fdate = sdate.format(date);

        System.out.println(sdate.format(date));
    }
}
