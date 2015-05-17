
package com.thihoa.dahouet.tests;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author T
 */

class Valid {
    public static boolean validEmail (String email) {
        boolean status = false;
      String EMAIL_PATTERN =  "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9]+)*@"+ 
            "[_A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
      
      Pattern pattern = Pattern.compile(EMAIL_PATTERN);
      Matcher matcher = pattern.matcher(email);
      status = matcher.matches();
          return status;
    }}