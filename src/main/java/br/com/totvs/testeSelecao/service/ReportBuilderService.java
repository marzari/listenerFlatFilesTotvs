/**
 * 
 */
package br.com.totvs.testeSelecao.service;

import java.math.BigDecimal;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import br.com.totvs.testeSelecao.domain.CalcReport;
import br.com.totvs.testeSelecao.domain.Line;
import br.com.totvs.testeSelecao.domain.LineBuyerFactory;
import br.com.totvs.testeSelecao.domain.LineSalesFactory;
import br.com.totvs.testeSelecao.domain.LineSalesmanFactory;

/**
 * @author tiago.marzari
 * @since 29/08/2018
 *
 */
@Service
public class ReportBuilderService {

	public CalcReport dataProcess(List<Line> lineParsed) {
		long sumBuyers = sumBuyers(lineParsed);
		long sumSalesman = sumSalesman(lineParsed);
		long idMmostExpensiveSale = idMmostExpensiveSale(lineParsed);
		LineSalesmanFactory worstSalesman = worstSalesman(lineParsed);
		return new CalcReport(idMmostExpensiveSale, sumBuyers, sumSalesman, worstSalesman);
	}

	private long sumSalesman(List<Line> lineParsed) {
		return lineParsed.stream().filter(LineSalesmanFactory.class::isInstance).count();
	}

	private long sumBuyers(List<Line> lineParsed) {
		return lineParsed.stream().filter(LineBuyerFactory.class::isInstance).count();
	}

	/**
	 * @param lineParsed
	 * @return
	 * Verifica qual foi a melhor venda
	 */
	private long idMmostExpensiveSale(List<Line> lineParsed) {
		List<LineSalesFactory> sales = getSales(lineParsed);

		if (sales.isEmpty()) return 0l;

		//Retorna o id da maior venda
		return Collections.max(sales, Comparator.comparing(LineSalesFactory::getCost)).getIdSale();
	}

	private List<LineSalesFactory> getSales(List<Line> lineParsed) {
		return lineParsed.stream().filter(LineSalesFactory.class::isInstance).map(x -> (LineSalesFactory) x).collect(Collectors.toList());
	}

	
	/**
	 * @param linesParsed
	 * @return
	 * Verifica o vendedor com a pior venda
	 */
	private LineSalesmanFactory worstSalesman(List<Line> linesParsed) {
		
		List<LineSalesmanFactory> salesmans = getSalesman(linesParsed);
		List<LineSalesFactory> sales = getSales(linesParsed);
		Map<LineSalesmanFactory, BigDecimal> salesBySalesman = new HashMap<>();
                
		for (LineSalesFactory lineSalesFactory : sales) {
			for (LineSalesmanFactory salesman : salesmans) {
				if(lineSalesFactory.getSalesman().equals(salesman.getName())) {
					salesBySalesman.put(salesman, lineSalesFactory.getCost());
				}
			}
		}
		
		//Retornando a chave da pior venda
		return Collections.min(salesBySalesman.entrySet(), Comparator.comparing(Entry::getValue)).getKey();
	}

	private List<LineSalesmanFactory> getSalesman(List<Line> linesParsed) {
		return linesParsed.stream().filter(LineSalesmanFactory.class::isInstance).map(x -> (LineSalesmanFactory) x).collect(Collectors.toList());
	}

}
