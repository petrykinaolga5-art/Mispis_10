public class Participation {

	private int hours;
	private ResearchAssociate researchAssociate;
	private Project project;

	public Participation(ResearchAssociate researchAssociate, Project project, int hours) {
		this.researchAssociate = researchAssociate;
		this.project = project;
		this.hours = hours;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	public ResearchAssociate getResearchAssociate() {
		return researchAssociate;
	}

	public void setResearchAssociate(ResearchAssociate researchAssociate) {
		this.researchAssociate = researchAssociate;
	}

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}
}