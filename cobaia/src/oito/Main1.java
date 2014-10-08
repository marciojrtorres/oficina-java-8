package oito;

import java.io.File;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main1 {

	public static void main(String[] args) throws Exception {
		
		List<Filme> filmes = filmesDeTeste();
		
		// estado atual
		System.out.println(filmes.size()); // 23
		System.out.println(filmes.get(0).getTitulo()); // Matrix
		
		// nova lista com os filmes de 2000 para cá
		List<Filme> de2000paraCa = de2000paraCa(filmes);		
		System.out.println(de2000paraCa.size()); // 16		
		// que não cause efeitos colaterais
		System.out.println(filmes.size()); // 23
	
		
		int qtsFilmesDuramMaisDe2horas = qtsFilmesDuramMaisDe2horas(filmes);
		System.out.println(qtsFilmesDuramMaisDe2horas); // 14
		
		
		Filme filmeMaisLongo = filmeMaisLongo(filmes);
		System.out.println(filmeMaisLongo); // O Senhor dos Anéis: A Sociedade do Anel
		
		
		double mediaDuracao = mediaDuracao(filmes);
		System.out.println(mediaDuracao); // 134.34
		

		Filme maiorAvaliacaoFilmeDecada90 = maiorAvaliacaoFilmeDecada90(filmes); 
		System.out.println(maiorAvaliacaoFilmeDecada90); // 9.0
		
		
		boolean haFilmeComMaisDe1MdeAvaliadores = haFilmeComMaisDe1MdeAvaliadores(filmes);
		System.out.println(haFilmeComMaisDe1MdeAvaliadores);  // true
		

		boolean todosFilmesTemLetraA = todosFilmesTemLetraA(filmes);		
		System.out.println(todosFilmesTemLetraA); // false	

		
		List<Filme> filmesClassificados3melhores = filmesClassificados3melhores(filmes);
		System.out.println(filmesClassificados3melhores); // [Filme [titulo=Batman - O Cavaleiro das Trevas, tituloOriginal=The Dark Knight, ano=2008, duracao=152, avaliacao=9.0, avaliadores=1251686], Filme [titulo=Pulp Fiction: Tempo de Violência, tituloOriginal=Pulp Fiction, ano=1994, duracao=154, avaliacao=9.0, avaliadores=991553], Filme [titulo=Clube da Luta, tituloOriginal=Fight Club, ano=1999, duracao=139, avaliacao=8.9, avaliadores=985641]]]
		
		
	}

	private static List<Filme> de2000paraCa(List<Filme> filmes) {
		// TODO Auto-generated method stub
		return Collections.EMPTY_LIST;
	}
	
	private static int qtsFilmesDuramMaisDe2horas(List<Filme> filmes) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	private static Filme filmeMaisLongo(List<Filme> filmes) {
		return null;
	}

	private static double mediaDuracao(List<Filme> filmes) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	private static Filme maiorAvaliacaoFilmeDecada90(List<Filme> filmes) {
		// TODO Auto-generated method stub
		return null;
	}
	
	private static boolean haFilmeComMaisDe1MdeAvaliadores(List<Filme> filmes) {
		// TODO Auto-generated method stub
		return false;
	}
	
	private static boolean todosFilmesTemLetraA(List<Filme> filmes) {
		// TODO Auto-generated method stub
		return false;
	}

	private static List<Filme> filmesClassificados3melhores(List<Filme> filmes) {
		List<Filme> melhores = new ArrayList<Filme>(filmes);
		Collections.sort(melhores, new Comparator<Filme>() {
			@Override
			public int compare(Filme o1, Filme o2) {
				if (o1.getAvaliacao() < o2.getAvaliacao()) {
					return 1;
				} else if (o1.getAvaliacao() > o2.getAvaliacao()) {
					return -1;
				} else {
					return 0;
				}
			}
		});
		return melhores.subList(0, 3);
	}

	
	
	

	
	private static List<Filme> filmesDeTeste() throws Exception {
		List<Filme> filmes = new ArrayList<>();
		
		Scanner linhas = new Scanner(new File(Main1.class.getResource("filmes.csv").getFile()));
		
		while (linhas.hasNextLine()) {			
			Scanner colunas = new Scanner(linhas.nextLine());			
			colunas.useDelimiter(";");			
			filmes.add(new Filme(colunas.next(), colunas.next(),
					colunas.nextInt(), colunas.nextInt(),
					colunas.nextDouble(), colunas.nextInt()));
		}		
		
		linhas.close();
		return filmes;
	}

	
	
	

}
