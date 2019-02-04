package com.gt.utility.endpoint.bean;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@ToString( includeFieldNames=true)
public class IssueResponse {

	@Getter @Setter
	private String key;

	@Getter @Setter
	private FieldResponse fields;
}
