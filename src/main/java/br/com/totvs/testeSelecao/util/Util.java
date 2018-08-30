package br.com.totvs.testeSelecao.util;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

/**
 * @author tiago.marzari
 *
 */
@Component
public class Util {

	public static void createDirectory(Path path) throws IOException {
		Files.createDirectories(path);
	}

	public static void filePersist(Path path, String data) {
		try {
			Files.write(path, Arrays.asList(data));
		} catch (IOException e) {
			System.out.println("Erro ao persistir arquivo no disco local: " + path);
		}
	}

	public static List<String> getLinesFile(String path) throws IOException {
		//Testa se o arquivo pode ser lido, se o arquivo existe e se a Java virtual machine
		//tem privilégios necessários para abrir e ler o mesmo.
		if (Files.isReadable(Paths.get(path))) {
			return Files.readAllLines(Paths.get(path));
		} else {
			System.out.println("Não foi possivel ler o arquivo do diretótio: " + path);
		}
		return null;
	}

}
