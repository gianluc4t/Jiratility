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
public class Issue {
	
	@Getter @Setter
	private String key;

	@Getter @Setter
	private Field fields;
		
}
