public class KlasseMitFunktion{
  public static int dreiSubtrahieren(int zahl){
    return zahl -3;
  }
}


===============================================
import static org.junit.Assert.assertEquals;

public class KlasseMitFunktionTest {
  //Test case: 1 input = 5, expected output =2
  
  int input1 = 5;
  int expectedOutput1 = 2;
  int actualOutput1 = KlasseMitFunktion.dreiSubtrahieren(input1);
  assertEquals(expectedOutput1, actualOutput1);
  
  int input = 10;
  int expectedOutput2 = ;
  int actualOutput2 = KlasseMitFunktion.dreiSubtrahieren(input2);
  assertEquals(expectedOutput2, actualOutput2);
  
  int input3 = -5;
  int expectedOutput3 = -8;
  int actualOutput3 = KlasseMitFunktion.dreiSubtrahieren(input3);
  assertEquals(expectedOutput3, actualOutput3);
  
  int input4 = 55;
  int expectedOutput4 = 52;
  int actualOutput4 = KlasseMitFunktion.dreiSubtrahieren(input4);
  assertEquals(expectedOutput4, actualOutput4);
  

}