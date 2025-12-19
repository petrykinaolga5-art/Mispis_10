import java.util.ArrayList;
import java.util.Collection;

public class ResearchAssociate extends Employee {

	private String fieldOfStudy;
	private Collection<Participation> participations;

	public ResearchAssociate() {
		this.participations = new ArrayList<>();
	}

	public String getFieldOfStudy() {
		return fieldOfStudy;
	}

	public void setFieldOfStudy(String fieldOfStudy) {
		this.fieldOfStudy = fieldOfStudy;
	}

	public Collection<Participation> getParticipations() {
		return participations;
	}

	public void addParticipation(Participation participation) {
		this.participations.add(participation);
	}
}