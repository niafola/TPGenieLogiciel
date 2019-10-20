package roman;

import java.util.HashMap;
import java.util.Map;
import org.junit.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertEquals;


public class RomanNumberTest {
  public static final HashMap<Integer, String> KNOWN_VALUES = new HashMap<>();
  static {
    KNOWN_VALUES.put(1, "I");
    KNOWN_VALUES.put(2, "II");
    KNOWN_VALUES.put(3, "III");
    KNOWN_VALUES.put(4, "IV");
    KNOWN_VALUES.put(5, "V");
    KNOWN_VALUES.put(6, "VI");
    KNOWN_VALUES.put(7, "VII");
    KNOWN_VALUES.put(8, "VIII");
    KNOWN_VALUES.put(9, "IX");
    KNOWN_VALUES.put(10, "X");
    KNOWN_VALUES.put(50, "L");
    KNOWN_VALUES.put(100, "C");
    KNOWN_VALUES.put(500, "D");
    KNOWN_VALUES.put(1000, "M");
    KNOWN_VALUES.put(31, "XXXI");
    KNOWN_VALUES.put(148, "CXLVIII");
    KNOWN_VALUES.put(294, "CCXCIV");
    KNOWN_VALUES.put(312, "CCCXII");
    KNOWN_VALUES.put(421, "CDXXI");
    KNOWN_VALUES.put(528, "DXXVIII");
    KNOWN_VALUES.put(621, "DCXXI");
    KNOWN_VALUES.put(782, "DCCLXXXII");
    KNOWN_VALUES.put(870, "DCCCLXX");
    KNOWN_VALUES.put(941, "CMXLI");
    KNOWN_VALUES.put(1043, "MXLIII");
    KNOWN_VALUES.put(1110, "MCX");
    KNOWN_VALUES.put(1226, "MCCXXVI");
    KNOWN_VALUES.put(1301, "MCCCI");
    KNOWN_VALUES.put(1485, "MCDLXXXV");
    KNOWN_VALUES.put(1509, "MDIX");
    KNOWN_VALUES.put(1607, "MDCVII");
    KNOWN_VALUES.put(1754, "MDCCLIV");
    KNOWN_VALUES.put(1832, "MDCCCXXXII");
    KNOWN_VALUES.put(1993, "MCMXCIII");
    KNOWN_VALUES.put(2074, "MMLXXIV");
    KNOWN_VALUES.put(2152, "MMCLII");
    KNOWN_VALUES.put(2212, "MMCCXII");
    KNOWN_VALUES.put(2343, "MMCCCXLIII");
    KNOWN_VALUES.put(2499, "MMCDXCIX");
    KNOWN_VALUES.put(2574, "MMDLXXIV");
    KNOWN_VALUES.put(2646, "MMDCXLVI");
    KNOWN_VALUES.put(2723, "MMDCCXXIII");
    KNOWN_VALUES.put(2892, "MMDCCCXCII");
    KNOWN_VALUES.put(2975, "MMCMLXXV");
    KNOWN_VALUES.put(3051, "MMMLI");
    KNOWN_VALUES.put(3185, "MMMCLXXXV");
    KNOWN_VALUES.put(3250, "MMMCCL");
    KNOWN_VALUES.put(3313, "MMMCCCXIII");
    KNOWN_VALUES.put(3408, "MMMCDVIII");
    KNOWN_VALUES.put(3501, "MMMDI");
    KNOWN_VALUES.put(3610, "MMMDCX");
    KNOWN_VALUES.put(3743, "MMMDCCXLIII");
    KNOWN_VALUES.put(3844, "MMMDCCCXLIV");
    KNOWN_VALUES.put(3888, "MMMDCCCLXXXVIII");
    KNOWN_VALUES.put(3940, "MMMCMXL");
    KNOWN_VALUES.put(3999, "MMMCMXCIX");
  }

  // String -> RomanNumber
  @Test
  public void fromRomanKnownValues() {
    for (Map.Entry<Integer, String> v : KNOWN_VALUES.entrySet()) {

assertEquals(v.getValue(),RomanNumber.toRoman(v.getKey()));
    }
  }

  
  @Test
  public void ToRomanKnownValues() {
    for (Map.Entry<Integer, String> v : KNOWN_VALUES.entrySet()) {
      assertThat(RomanNumber.valueOf(v.getKey()).toString(),is(v.getValue()));
    }
  }


  @Test(expected = IllegalArgumentException.class)
  public void toRomanNegativeValues() {
    RomanNumber.toRoman(-1);
  }

  @Test(expected = IllegalArgumentException.class)
  public void toRomanNonIntegerValues() {
    RomanNumber.valueOf(0.1);
  }

  @Test(expected = IllegalArgumentException.class)
  public void toRomanOutOfRangeValues() {
    RomanNumber.toRoman(4000);
  }

  @Test(expected = IllegalArgumentException.class)
  public void toRomanTooMuchRepetition() {
    String [] echantillon  = {"IIII","VVVVV","XXXX","CCCC", "MMMMMM"};
    for(int i=0;i<echantillon.length;i++){
    	RomanNumber.valueOf(echantillon[i]);
    }
  }

  @Test(expected = IllegalArgumentException.class)
  public void toRomanRepetionOfPairs() {
    String [] echantillon  = {"IXIX","VV"};
    for(int i=0;i<echantillon.length;i++){
    	RomanNumber.valueOf(echantillon[i]);
    }
  }

 @Test(expected = IllegalArgumentException.class)
  public void toRomanIncorrectValues() {
    String [] echantillon  = {"VX","XCX"};
    for(int i=0;i<echantillon.length;i++){
    	RomanNumber.valueOf(echantillon[i]);
    }
  }

  // int -> RomanNumber
  @Test(expected = IllegalArgumentException.class)
  public void toRomanZero() {
    RomanNumber.toRoman(0);
  }

  @Test
  public void fromRomanToRomanKnownValues() {
    for(int n=1;n<4000;n++){
	assertThat(RomanNumber.fromRoman(RomanNumber.toRoman(n)),is(n));
	
    }
  }

 @Test
  public void Maj() {
    for(int n=1;n<4000;n++){
	assertThat(RomanNumber.valueOf(n).toString(), is(RomanNumber.valueOf(n).toString().toUpperCase()));
    }
  }

  @Test (expected = IllegalArgumentException.class)
  public void notMaj() {
	String [] roman = {"Iii", "Ii"};
	for(int i=0; i<roman.length;i++){
		RomanNumber.valueOf(roman[i]);
	}

    
  }







}
