import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Aluno> alunos = new ArrayList<>();
    static ArrayList<Atividade> atividades = new ArrayList<>();
    static ArrayList<Nota> notas = new ArrayList<>();

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
			int opcao;

			do {
			    System.out.println("\n1 - Cadastrar Aluno");
			    System.out.println("2 - Criar Atividade");
			    System.out.println("3 - Lançar Nota");
			    System.out.println("4 - Ver Boletim");
			    System.out.println("0 - Sair");

			    opcao = sc.nextInt();
			    sc.nextLine();

			    switch(opcao) {
			        case 1:
			            System.out.print("Nome: ");
			            String nome = sc.nextLine();
			            System.out.print("Matricula: ");
			            String mat = sc.nextLine();
			            alunos.add(new Aluno(nome, mat));
			            break;

			        case 2:
			            System.out.print("Titulo: ");
			            String titulo = sc.nextLine();
			            System.out.print("Descricao: ");
			            String desc = sc.nextLine();
			            atividades.add(new Atividade(titulo, desc));
			            break;

			        case 3:
			            if(alunos.isEmpty() || atividades.isEmpty()) {
			                System.out.println("Cadastre aluno e atividade primeiro.");
			                break;
			            }

			            Aluno aluno = alunos.get(0); // simplificado
			            Atividade atividade = atividades.get(0);

			            System.out.print("Nota: ");
			            double valor = sc.nextDouble();

			            notas.add(new Nota(valor, aluno, atividade));
			            break;

			        case 4:
			            for(Nota n : notas) {
			                System.out.println("Aluno: " + n.aluno.nome +
			                                   " | Atividade: " + n.atividade.titulo +
			                                   " | Nota: " + n.valor);
			            }
			            break;
			    }

			} while(opcao != 0);
		}
    }
}