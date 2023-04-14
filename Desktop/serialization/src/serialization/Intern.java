package serialization;

import java.io.Serializable;

public class Intern implements Serializable {
	
	private String name;
	
	private Integer id;
	
	private String team;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public Intern() {
		super();
	}

	@Override
	public String toString() {
		return "Intern [name=" + name + ", id=" + id + ", team=" + team + "]";
	}

	public Intern(String name, Integer id, String team) {
		super();
		this.name = name;
		this.id = id;
		this.team = team;
	}
	
	

}
