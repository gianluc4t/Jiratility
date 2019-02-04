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
public class IssueSearchResult {

	@Getter @Setter private String expand;

	@Getter @Setter private Long startAt;
	
	@Getter @Setter private Long maxResults;
	
	@Getter @Setter private Long total;
	
	@Getter @Setter private List<Issue> issues;

}
