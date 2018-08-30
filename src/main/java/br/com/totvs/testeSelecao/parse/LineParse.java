/**
 * 
 */
package br.com.totvs.testeSelecao.parse;

import br.com.totvs.testeSelecao.domain.Line;

/**
 * @author tiago marzari
 * @since 29/08/2018
 */
public interface LineParse {
	
	public abstract Line parse(String[] data);

}
