// PARTNER NAME: ALEJANDRO BELLO
// PARTNER NAME:
// CS111 SECTION #: 3033
// DATE: 2/5/2025

public class Main
{
	public static void main(String[] args)
	{
		//DECLARATION + INITIALIZATION SECTION
		//complete fields
		String surname, givenName, category, cardNum, birthCountry, termsAndConditions;
		char sex;

		//parts of fields 
		String birthMonth; 
		int usciNum1, usciNum2, usciNum3, birthDay, birthYear,
			validDay, validMonth, validYear, expireDay, expireMonth, expireYear;

		surname = "BELLO"; 
		givenName = "ALEJANDRO";
		category = "C09";
		cardNum = "USA2080181062";
		birthCountry = "United States of America";
		termsAndConditions = "None";
		sex = 'M'; //note single quotes
	
		birthMonth = "FEB"; 
		usciNum1 = 123; 
		usciNum2 = 456;
		usciNum3 = 789; 
		birthDay = 1; 
		birthYear = 1972; 
		validDay = 4; 
		validMonth = 5; 
		validYear = 2025; 
		expireDay = 4; 
		expireMonth = 5; 
		expireYear = 2035;


		//INPUT SECTION
		// N/A
		//CALCULATION SECTION
		//N/A

		//OUTPUT SECTION
		System.out.println("╔══════════════════════════════════════════════════════════════════════");
		System.out.println("║         UNITED STATES OF AMERICA");
		System.out.println("║                                  EMPLOYMENT AUTHORIZATION CARD");
		System.out.println("║                       Surname");
		System.out.println("║                       "+ surname +" ");
		System.out.println("║  .----.    .----.     Given Name");
		System.out.println("║ (   ^  \\  /  ^   )    "+ givenName + " ");
		System.out.println("║        |  |           USCIS#         Category   Card#");
		System.out.println("║       _/  \\_          " + usciNum1 + "-" + usciNum2 + "-" + usciNum3 + "    " + category + "        " + cardNum + "");
		System.out.println("║      (_    _)         Country of Birth");
		System.out.println("║   ,    `--`    ,      " + birthCountry + " ");
		System.out.println("║   \\'-.______.-'/      Terms and Conditions");
		System.out.println("║    \\          /       " + termsAndConditions + " ");
		System.out.println("║     '.--..--.'        Date of Birth   Sex");
		System.out.println("║       `\"\"\"\"\"`         " + birthDay + " " + birthMonth + " " + birthYear + "      " + sex + "");
		System.out.println("║                       Valid From:     " + validMonth + "/" + validDay + "/" + validYear + "");
		System.out.println("║                       Card Expires:   " + expireMonth + "/" + expireDay + "/" + expireYear + "");
		System.out.println("║ ascii art by: jgs     NOT VALID FOR REENTRY TO U.S.");
		System.out.println("╚══════════════════════════════════════════════════════════════════════");
		//ascii art credit: http://www.oocities.org/spunk1111/bodypart.htm
	}
}