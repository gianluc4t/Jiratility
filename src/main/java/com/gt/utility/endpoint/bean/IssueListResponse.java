package com.gt.utility.endpoint.bean;

import java.util.List;

import com.gt.utility.feign.resource.Issue;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@ToString( includeFieldNames=true)
public class IssueListResponse {
	
	@Getter @Setter private Long total;

	@Getter @Setter private List<IssueResponse> issues;
}
