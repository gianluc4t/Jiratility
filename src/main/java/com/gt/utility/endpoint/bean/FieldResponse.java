package com.gt.utility.endpoint.bean;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.gt.utility.feign.resource.Field;
import com.gt.utility.feign.resource.NameField;
import com.gt.utility.feign.resource.ValueField;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@ToString(includeFieldNames = true)
public class FieldResponse {

	@Getter
	@Setter
	private String summary;

	@Getter
	@Setter
	private String description;

	@Getter
	@Setter
	private String responsavelVivo;

	@Getter
	@Setter
	private String estadoIncidencia;

	@Getter
	@Setter
	private String dataDeEntrada;

	@Getter
	@Setter
	private String pontosTotal;

	@Getter
	@Setter
	private String cap;

	@Getter
	@Setter
	private String dataDeAprovacao;

	@Getter
	@Setter
	private String sistema;

	@Getter
	@Setter
	private String pontosJaneiro;

	@Getter
	@Setter
	private String pontosFevereiro;

	@Getter
	@Setter
	private String pontosMarço;

	@Getter
	@Setter
	private String pontosAbril;

	@Getter
	@Setter
	private String pontosMaio;

	@Getter
	@Setter
	private String pontosJunho;

	@Getter
	@Setter
	private String pontosJulho;

	@Getter
	@Setter
	private String pontosAgosto;

	@Getter
	@Setter
	private String pontosSetembro;

	@Getter
	@Setter
	private String pontosOutubro;

	@Getter
	@Setter
	private String pontosNovembro;

	@Getter
	@Setter
	private String pontosDezembro;

	@Getter
	@Setter
	private String anoDeReferencia;

	@Getter
	@Setter
	private String jiraJaneiro;

	@Getter
	@Setter
	private String jiraFevereiro;

	@Getter
	@Setter
	private String jiraMarço;

	@Getter
	@Setter
	private String jiraAbril;

	@Getter
	@Setter
	private String jiraMaio;

	@Getter
	@Setter
	private String jiraJunho;

	@Getter
	@Setter
	private String jiraJulho;

	@Getter
	@Setter
	private String jiraAgosto;

	@Getter
	@Setter
	private String jiraSetembro;

	@Getter
	@Setter
	private String jiraOutubro;

	@Getter
	@Setter
	private String jiraNovembro;

	@Getter
	@Setter
	private String jiraDezembro;

	@Getter
	@Setter
	private String issuetype;

	@Getter
	@Setter
	private String reporter;

	@Getter
	@Setter
	private String release;

	@Getter
	@Setter
	private String assignee;

	public FieldResponse(Field field) {
		this.summary = field.getSummary();
		this.description = field.getDescription();
		this.responsavelVivo = field.getCustomfield_14115();
		this.estadoIncidencia = field.getCustomfield_13576();
		this.dataDeEntrada = field.getCustomfield_14122();
		this.pontosTotal = field.getCustomfield_14162();
		this.cap = field.getCustomfield_14163();
		this.dataDeAprovacao = field.getCustomfield_14164();
		this.sistema = checkValue(field.getCustomfield_14165());
		this.pontosJaneiro = field.getCustomfield_14293();
		this.pontosFevereiro = field.getCustomfield_14295();
		this.pontosMarço = field.getCustomfield_14297();
		this.pontosAbril = field.getCustomfield_14302() != null ? field.getCustomfield_14302().toString() : "";
		this.pontosMaio = field.getCustomfield_14304();
		this.pontosJunho = field.getCustomfield_14307();
		this.pontosJulho = field.getCustomfield_14309();
		this.pontosAgosto = field.getCustomfield_14311();
		this.pontosSetembro = field.getCustomfield_14313();
		this.pontosOutubro = field.getCustomfield_14315();
		this.pontosNovembro = field.getCustomfield_14317();
		this.pontosDezembro = field.getCustomfield_14319();
		this.anoDeReferencia = field.getCustomfield_14326();
		this.jiraJaneiro = checkList(field.getCustomfield_14298());
		this.jiraFevereiro = checkList(field.getCustomfield_14299());
		this.jiraMarço = checkList(field.getCustomfield_14300());
		this.jiraAbril = checkList(field.getCustomfield_14301());
		this.jiraMaio = checkList(field.getCustomfield_14303());
		this.jiraJunho = checkList(field.getCustomfield_14306());
		this.jiraJulho = checkList(field.getCustomfield_14308());
		this.jiraAgosto = checkList(field.getCustomfield_14310());
		this.jiraSetembro = checkList(field.getCustomfield_14312());
		this.jiraOutubro = checkList(field.getCustomfield_14314());
		this.jiraNovembro = checkList(field.getCustomfield_14316());
		this.jiraDezembro = checkList(field.getCustomfield_14318());
		this.release = field.getCustomfield_14352();
		this.issuetype = checkName(field.getIssuetype());
		this.reporter = checkName(field.getReporter());
		this.assignee = checkName(field.getAssignee());
	}

	private String checkList(List<String> listField) {
		String result = null;
		if (listField != null) {
			result = listField.toString();
		}
		return removeSquareBrackets(result);
	}

	private String checkValue(ValueField valueField) {
		String result = null;
		if (valueField != null) {
			result = valueField.getValue();
		}
		return removeSquareBrackets(result);
	}

	private String checkName(NameField nameField) {
		String result = null;
		if (nameField != null) {
			result = nameField.getName();
		}
		return removeSquareBrackets(result);
	}

	private String removeSquareBrackets(String result) {

		if (result != null) {
			result = result.replaceAll("[\\[\\]]", "");
		}

		return result;
	}
}
