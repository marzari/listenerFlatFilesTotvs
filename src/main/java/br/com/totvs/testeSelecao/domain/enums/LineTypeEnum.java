package br.com.totvs.testeSelecao.domain.enums;

import java.util.Arrays;
import java.util.List;

import br.com.totvs.testeSelecao.parse.LineParse;
import br.com.totvs.testeSelecao.parse.LineParseBuyer;
import br.com.totvs.testeSelecao.parse.LineParseSaleman;
import br.com.totvs.testeSelecao.parse.LineParseSales;

/**
 * @author tiago.marzari
 * @since 29/08/2018
 * 
 */

public enum LineTypeEnum {

	SALEMAN("001", new LineParseSaleman()), 
	BUYER("002", new LineParseBuyer()), 
	SALE("003", new LineParseSales());

	private final String lineId;
	private final LineParse parse;

	private LineTypeEnum(String lineId, LineParse parse) {
		this.lineId = lineId;
		this.parse = parse;
	}

	public LineParse getConverter() {
		return parse;
	}
	
	public static LineTypeEnum findById(String id) {
		List<LineTypeEnum> kind = Arrays.asList(values());
		for (LineTypeEnum lineTypeEnum : kind) {
			if(lineTypeEnum.lineId.equals(id)) {
				return lineTypeEnum;
			}
		}
		return null;
	}

}
