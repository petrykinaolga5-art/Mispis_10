import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

public class Project {

	private String name;
	private Date start;
	private Date end;
	private Collection<Participation> participations;

	public Project(String name, Date start, Date end) {
		this.name = name;
		this.start = start;
		this.end = end;
		this.participations = new ArrayList<>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getStart() {
		return start;
	}

	public void setStart(Date start) {
		this.start = start;
	}

	public Date getEnd() {
		return end;
	}

	public void setEnd(Date end) {
		this.end = end;
	}

	public Collection<Participation> getParticipations() {
		return participations;
	}

	public void addParticipation(Participation participation) {
		this.participations.add(participation);
	}

	public void getIntermediateResult(){

	}
	public void addToProject(){

	}
	public void beginProject(){

	}
	public void finishProject(){

	}

}