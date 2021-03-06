package br.com.alura;

import java.util.List;

public class TestaBuscaAlunosNoCurso {

	public static void main(String[] args) {
		
		Curso javaColecoes = new Curso("Dominando as cole??es do Java", "Paulo Silveria");

		List<Aula> aulas = javaColecoes.getAulas();
		System.out.println(aulas);

		javaColecoes.adiciona(new Aula("Trabalhando com Arraylist", 21));
		javaColecoes.adiciona(new Aula("Criando uma aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com cole??es", 22));

		Aluno a1 = new Aluno("Rodrigo Turini", 34672);
		Aluno a2 = new Aluno("Guilherme Silveira", 5617);
		Aluno a3 = new Aluno("Maur?cio Aniche", 517645);
		Aluno a4 = new Aluno("Paulo Silveira", 5617);

		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);
		javaColecoes.matricula(a4);

		System.out.println("Quem ? o aluno com matr?cula 5617?");
		Aluno aluno = javaColecoes.buscaMatriculado(5617);
		System.out.println("aluno: " + aluno);
	}
}
