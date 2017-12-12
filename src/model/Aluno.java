package model;

public class Aluno {
	private static int cont;
	private static String matricula;
	private static String nome;
	private static String email;
	private static int idade;
	private static String sexo;
	private static String empresa;
	private static String cidade;
		@Override
	public String toString() {
		return cont + "Aluno [matricula=" + matricula + ", idade=" + idade + ", email=" + email + ", idade=" + idade + ", sexo=" + sexo
				+ ", empresa=" + empresa + ", cidade=" + cidade + "]";
	}
		public Aluno(int contagem, String matricula, String nome, String email, String idade, String sexo, String empresa, String cidade) {
			this.cont = contagem;
			this.matricula = matricula;
			this.nome = nome;
			this.email = email;
			this.idade = Integer.parseInt(idade);
			this.sexo= sexo;
			this.empresa = empresa;
			this.cidade = cidade;
		}
		public static String getMatricula() {
			return matricula;
		}
		public static String getNome() {
			return nome;
		}
		public static String getEmail() {
			return email;
		}
		public static int getIdade() {
			return idade;
		}
		public static String getSexo() {
			return sexo;
		}
		public static String getEmpresa() {
			return empresa;
		}
		public static String getCidade() {
			return cidade;
		}
}
