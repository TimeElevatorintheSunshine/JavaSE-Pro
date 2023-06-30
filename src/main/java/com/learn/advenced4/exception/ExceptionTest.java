package com.learn.advenced4.exception;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExceptionTest {
    public static void main(String[] args) throws ParseException {
        System.out.println(Integer.valueOf("111"));

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date parse = null;
        //try {
            parse = simpleDateFormat.parse("2077-1-1 11:11:11");
      //  } catch (ParseException e) {
      //      throw new RuntimeException(e);
     //   }
        System.out.println(parse);

    }
}
