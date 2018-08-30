package br.com.totvs.testeSelecao.config;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author tiago marzari
 *
 */
public class FileConfig {
	
	public static final Path PATH_IN = Paths.get("\\dados\\in\\");
	public static final Path PATH_OUT = Paths.get("\\dados\\out\\");

	public static final String EXTENSION_DAT = ".dat";
	public static final String EXTENSION_DONE_DAT = ".dat.proc";

}
