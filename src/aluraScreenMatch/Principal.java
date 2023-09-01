package aluraScreenMatch;

public class Principal {
	public static void main(String[] args) {
		Filme filme1 = new Filme();
		filme1.nome = "Um sonho de liberdade";
		filme1.anoDeLancamento = 1994;
		filme1.duracaoEmMinutos = 144;
		filme1.incluidoNoPlano = true;
		
		filme1.exibeFichaTecnica();
		filme1.avalia(9);
		filme1.avalia(10);
		filme1.avalia(10);
		
		System.out.println(filme1.pegaMedia());
		}
}
