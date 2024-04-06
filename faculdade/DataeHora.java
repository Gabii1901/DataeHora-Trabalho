	/*package faculdade;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;

public class DataeHora {
    public static String obterDataPorExtenso() {
        
        LocalDate hoje = LocalDate.now();

        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd 'de' MMMM 'de' yyyy", new Locale("pt", "BR"));
        String dataFormatada = hoje.format(formatter);

        
        DayOfWeek diaSemana = hoje.getDayOfWeek();
        String diaSemanaExtenso = diaSemana.getDisplayName(TextStyle.FULL, new Locale("pt", "BR"));

        
        int hora = java.time.LocalTime.now().getHour();
        int minutos = java.time.LocalTime.now().getMinute();

        
        String dataPorExtenso = String.format("Hoje é %s, %s e agora são %d horas e %d minutos.", diaSemanaExtenso, dataFormatada, hora, minutos);

        return dataPorExtenso;
    }

    public static void main(String[] args) {
        String dataExtensa = obterDataPorExtenso();
        System.out.println(dataExtensa);
    }
}

--------------------------------------------------------------------------------------------------	

	import java.time.LocalDate;
	import java.time.format.DateTimeFormatter;
	import java.time.temporal.ChronoUnit;
	import java.util.Scanner;
	import java.util.Locale;

	public class DataeHora {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Digite o dia:");
	        int dia = scanner.nextInt();

	        System.out.println("Digite o mês:");
	        int mes = scanner.nextInt();

	        System.out.println("Digite o ano:");
	        int ano = scanner.nextInt();

	        contaTempo(dia, mes, ano);

	        scanner.close();
	    }

	    private static void contaTempo(int dia, int mes, int ano) {

	        LocalDate dataAtual = LocalDate.now();

	        LocalDate dataDesejada = LocalDate.of(ano, mes, dia);

	        long diasRestantes = ChronoUnit.DAYS.between(dataAtual, dataDesejada);

	        if (diasRestantes < 0) {
	            System.out.println("A data já passou.");
	        } else if (diasRestantes == 0) {
	            System.out.println("A data é hoje!");
	        } else {
	        
	            String dataFormatada = dataDesejada.format(DateTimeFormatter.ofPattern("dd 'de' MMMM 'de' yyyy", new Locale("pt", "BR")));
	            System.out.println("Faltam " + diasRestantes + " dias para a data " + dataFormatada + ".");
	        }
	    }
	}

	*/




