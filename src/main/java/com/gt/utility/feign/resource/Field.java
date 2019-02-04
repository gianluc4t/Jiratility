package com.gt.utility.feign.resource;


import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@ToString( includeFieldNames=true)
public class Field {

	@Getter @Setter private String summary;
	@Getter @Setter private String description;
	
    //responsavelVivo
	@Getter @Setter private String customfield_14115;

    //estadoIncidencia
	@Getter @Setter private  String customfield_13576;
	
    //dataDeEntrada
	@Getter @Setter private  String customfield_14122;
	
    //pontosTotal
	@Getter @Setter private  String customfield_14162;
	
    //cap
	@Getter @Setter private  String customfield_14163;
	
    //dataDeAprovacao
	@Getter @Setter private  String customfield_14164;
	
    //sistema
	@Getter @Setter private  ValueField customfield_14165;
	
    //pontosJaneiro
	@Getter @Setter private  String customfield_14293;
	
    //pontosFevereiro
	@Getter @Setter private  String customfield_14295;
	
    //pontosMarço
	@Getter @Setter private  String customfield_14297;
	
    //pontosAbril
	@Getter @Setter private  List<String> customfield_14302;
	
    //pontosMaio
	@Getter @Setter private  String customfield_14304;
	
    //pontosJunho
	@Getter @Setter private  String customfield_14307;
	
    //pontosJulho
	@Getter @Setter private  String customfield_14309;
	
    //pontosAgosto
	@Getter @Setter private  String customfield_14311;
	
    //pontosSetembro
	@Getter @Setter private  String customfield_14313;
	
    //pontosOutubro
	@Getter @Setter private  String customfield_14315;
	
    //pontosNovembro
	@Getter @Setter private  String customfield_14317;
	
    //pontosDezembro
	@Getter @Setter private  String customfield_14319;
	
    //anoDeReferencia
	@Getter @Setter private  String customfield_14326;
	
    //jiraJaneiro
	@Getter @Setter private  List<String> customfield_14298;
	
    //jiraFevereiro
	@Getter @Setter private  List<String> customfield_14299;
	
    //jiraMarço
	@Getter @Setter private  List<String> customfield_14300;
	
    //jiraAbril
	@Getter @Setter private  List<String> customfield_14301;
	
    //jiraMaio
	@Getter @Setter private  List<String> customfield_14303;
	
    //jiraJunho
	@Getter @Setter private  List<String> customfield_14306;
	
    //jiraJulho
	@Getter @Setter private  List<String> customfield_14308;
	
    //jiraAgosto
	@Getter @Setter private  List<String> customfield_14310;
	
    //jiraSetembro
	@Getter @Setter private  List<String> customfield_14312;
	
    //jiraOutubro
	@Getter @Setter private  List<String> customfield_14314;
	
    //jiraNovembro
	@Getter @Setter private  List<String> customfield_14316;
	
    //jiraDezembro
	@Getter @Setter private  List<String> customfield_14318;
	
    //release
	@Getter @Setter private  String customfield_14352;

	@Getter @Setter private NameField issuetype;
	
	@Getter @Setter private NameField reporter;
	
	@Getter @Setter private NameField assignee;

}
	
