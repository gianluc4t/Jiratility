package com.gt.utility.feign.resource;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@ToString( includeFieldNames=true)
public class ValueField {

	@Getter @Setter private String value;
}
