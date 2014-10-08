package oito;

import java.util.Calendar;
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
		
		// System.out.println(e.getDias()); // 3
		
		//System.out.println(e.getDiasAte()); // 8
		
		Parcela p = new Parcela(1, new Date(9, 20, 2014));
		
		//System.out.println(p.isVencida()); // true
		
		p.setVencimento(new Date(10,20,2014));
		
		//System.out.println(p.isVencida()); // false
		
		p.setVencimento(new Date(10,8,2014));
		
		//System.out.println(p.isVencida()); // false
		
		p.setPagamento(new Date(10, 8, 2014));
		
		System.out.println(p.getPagamento().getMonth() == 8);
		
		Calendar c = Calendar.getInstance();
		System.out.println(c);
		System.out.println(c.get(Calendar.MONTH) == 8);
		
		
	}

}
