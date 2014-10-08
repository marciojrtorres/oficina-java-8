package oito;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.MonthDay;
import java.time.Period;
import java.time.temporal.TemporalAmount;
import java.util.Date;

public class Main2 {

	public static void main(String[] args) {
		Evento e = new Evento();
		e.setNome("TDC");
		e.setLocal("Porto Alegre");
		e.setAno(2014);
		
		// e.setInicio(?); // 16/10/2014
		// e.setFim(?); // 18/10/2014
		// e.setHoraInicio(?) // 08:00
		// e.setHoraTermino(?) // 19:00

		e.setInicio(new Date("10/16/2014"));
		
		Duration d = Duration.ofHours(2);
		System.out.println(d.toMinutes());
		
		Period p = Period.between(LocalDate.now(), LocalDate.now().plusDays(1));
		
		LocalTime t1 = LocalTime.of(18, 30);
		Duration d1 = Duration.ofHours(10);
		LocalTime t2 = t1.plus(d1);
		System.out.println(t2);
		
		Duration d3 = Duration.between(LocalTime.of(2, 40), LocalTime.of(18, 30));
		System.out.println(d3);
		
		MonthDay md = MonthDay.of(12, 25);
		
		
		
		
		
	}

}
