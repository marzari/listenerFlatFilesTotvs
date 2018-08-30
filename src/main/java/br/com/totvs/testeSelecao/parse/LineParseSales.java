/**
 * 
 */
package br.com.totvs.testeSelecao.parse;

import org.springframework.stereotype.Component;

import br.com.totvs.testeSelecao.config.PositionFileConfig;
import br.com.totvs.testeSelecao.domain.Item;
import br.com.totvs.testeSelecao.domain.Line;
import br.com.totvs.testeSelecao.domain.LineSalesFactory;

/**
 * @author tiago marzari
 * @since 29/08/2018
 */
@Component
public class LineParseSales implements LineParse {
	
	@Override
	public Line parse(String[] data) {
		String saleman = data[PositionFileConfig.PLACE_SALE_SALESMAN];
		String idSale = data[PositionFileConfig.PLACE_SALE_ID];
		
		Item item = new Item(data[PositionFileConfig.PLACE_SALE_ITEM_ID],
				data[PositionFileConfig.PLACE_SALE_ITEM_QUANTITY],
				data[PositionFileConfig.PLACE_SALE_ITEM_COST]);

		return new LineSalesFactory(idSale, item, saleman);
	}
	
}
