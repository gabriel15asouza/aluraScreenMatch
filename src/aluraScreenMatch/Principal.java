package aluraScreenMatch;

public class Principal {
	public static void main(String[] args) {
		Filme filme1 = new Filme();
		filme1.setNome("Um sonho de liberdade");
		filme1.setAnoDeLancamento(1994);
		filme1.setDuracaoEmMinutos(144);
		filme1.setIncluidoNoPlano(true);
		
		filme1.exibeFichaTecnica();
		filme1.avalia(9);
		filme1.avalia(10);
		filme1.avalia(10);
		
		System.out.println(filme1.pegaMedia());
		}
}
