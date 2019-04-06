import java.time.LocalDate;

public class Tarefa {

	private String titulo;
	private Utilizador criador;
	private Utilizador responsavel;
	private String descricao;
	private Estado estadoTarefa;
	private LocalDate dataInicio; // justify
	private LocalDate dataFim;
	private LocalDate prazo;
	private PrioridadeTarefa prioridade;

}
