package com.gt.utility.feign.body;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@ToString( includeFieldNames=true)
public class PostSearchBody {
	
	@Getter @Setter private String jql;
	@Getter @Setter private Long startAt;
	@Getter @Setter private Long maxResults;
	@Getter @Setter private List<String> fields;

}
