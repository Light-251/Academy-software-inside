package it.softwareinside.models;


import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CatFacts {

	public Status status;
	public String _id;
	public String user;
	public String text;
	public int __v;
	public String source;
	public Date updatedAt;
	public String type;
	public Date createdAt;
	public boolean deleted;
	public boolean used;
}


