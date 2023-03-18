package it.softwareinside.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Status {
	public boolean verified;
	public String feedback;
	public int sentCount;
}