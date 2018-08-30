/**
 * 
 */
package br.com.totvs.testeSelecao.parse;

import org.springframework.stereotype.Component;

import br.com.totvs.testeSelecao.config.PositionFileConfig;
import br.com.totvs.testeSelecao.domain.Line;
import br.com.totvs.testeSelecao.domain.LineSalesmanFactory;

/**
 * @author tiago marzari
 * @since 29/08/2018
 */
@Component
public class LineParseSaleman implements LineParse {

	@Override
	public Line parse(String[] data) {
		String cpf = data[PositionFileConfig.PLACE_SALESMAN_CPF];
		String name = data[PositionFileConfig.PLACE_SALESMAN_NAME];
		String salary = data[PositionFileConfig.PLACE_SALESMAN_SALARY];

		return new LineSalesmanFactory(cpf, name, salary);
	}

}
