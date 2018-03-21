package basic;

import java.time.LocalDate;
import java.time.Period;

public class MichalFBirthday {
	
	public static final LocalDate MICHAL_F_BIRTHDAY = LocalDate.of(1969,03,27);

	public static void main(String[] args) {

		int MICHAL_F_BIRTHDAY_DAY = MICHAL_F_BIRTHDAY.getDayOfYear();
		LocalDate localDate = LocalDate.now();
		Period michalFFullAge = MICHAL_F_BIRTHDAY.until(localDate);
		int michalFAge = michalFFullAge.getYears();
		int daysToMichalFBirthdayDay = (MICHAL_F_BIRTHDAY_DAY)-(localDate.getDayOfYear());
				
		System.out.println("Aktualna data: " + LocalDate.now());
		System.out.println("Zatem mój obecny wiek to " + michalFAge + " lat.");
		
		if (daysToMichalFBirthdayDay >0) {
			
			System.out.println("Do moich najbli¿szych, " + (michalFAge+1) + " urodzin - pozosta³o " + daysToMichalFBirthdayDay + " dni.");
			
			} else if (daysToMichalFBirthdayDay <0) {
					
				System.out.println("Do moich nastêpnych, " + (michalFAge+1) + " urodzin pozosta³o " + (daysToMichalFBirthdayDay+365) + " dni.");
				
				} else {
					System.out.println("W³aœnie dziœ obchodzê " + michalFAge + " urodziny!");
			
				}
		
		System.out.println("Nie zapomnij o ¿yczeniach i o prezencie dla Jubilata!");

	}
}
