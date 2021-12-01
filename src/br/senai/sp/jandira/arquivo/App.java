package br.senai.sp.jandira.arquivo;

public class App {

	public static void main(String[] args) {

		String caminho = "C:\\Users\\21276435\\Desktop\\teste\\aula.txt";
		String conteudo = "FPOO SENAI - DS1T";
		String lorem = "Cras rutrum sed lacus vitae volutpat."
				+ " Nunc et elit non dolor tristique iaculis. Aenean dapibus "
				+ "risus non semper suscipit. Duis justo lectus, egestas ac rutrum id, "
				+ "volutpat et tellus. Nulla cursus turpis pulvinar augue volutpat "
				+ "eleifend. Vivamus aliquet, tellus at tempus iaculis, purus nulla"
				+ " egestas massa, consectetur tempor diam urna cursus ipsum. "
				+ "Suspendisse bibendum venenatis nisl, a lacinia erat lobortis at. "
				+ "Vivamus consectetur magna metus, at ultrices urna tincidunt sit amet. "
				+ "Nunc vehicula, nibh in porta tristique, quam sem accumsan velit, "
				+ "nec porta magna massa sed tortor. Nunc ornare magna ut tincidunt "
				+ "tristique. Sed quis diam augue. Vestibulum nec neque id quam tempor "
				+ "molestie vitae feugiat neque.";

		// System.out.println(caminho);
		Arquivo objArquivo = new Arquivo();
		
    
        String conteudoArquivo = objArquivo.ler(caminho);
		conteudoArquivo += "\n" + lorem;
		
		objArquivo.escrever(caminho, conteudoArquivo);
		
		System.out.println(conteudoArquivo);

	}

}
