import java.util.Scanner; 
class Calender 
{
 public void main () 
  {
    Scanner s = new Scanner ( System.in ); 
    int day = 0 , y = 0 , nextDay = 0 , count = 0 ; 
    String months [] = { " JANUARY " , " FEBRUARY " , " MARCH " , " APRIL " , " MAY " , " JUNE " , " JULY " , " AUGUST " , " SEPTEMBER " , " OCTOBER " , " NOVEMBER " , " DECEMBER " }; 
  String date = "" ; 
  System.out.print( " ENTER DAY NUMBER : " ) ; 
  day = s.nextInt() ; 
  System.out.print( " ENTER YEAR : " ) ; 
  y = s.nextInt() ; 
  System.out.print( " ENTER n NUMBER OF DAYS : " ) ; 
  nextDay = s.nextInt() ; 
  int m[] = {31 , 28 , 31 , 30 , 31 , 30 , 31 , 31 , 30 , 31 , 30 , 31 } ; // storing the number of days in each month 
  if (( y % 4 == 0 && y % 100 !=0 ) || ( y % 400 == 0 )) // checking for leap year 
    m[1] = 29 ; 
    for ( int i = 0 ; i < 12 ; i++ )
     { 
       for ( int j = 1 ; j <= m[i] ; j++ ) 
        { 
          date = j + months[i] + y ; 
          count++ ; 
          if ( count == day ) 
           System.out.println( " DATE : " + date ) ; 
          if ( count == ( day + nextDay ) ) 
          System.out.println( " DATE AFTER n DAYS : " + date ) ; 
       } //end of j loop 
     } //end of I loop 
   } //end of main 
} //end of class