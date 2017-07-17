package game.interF;

public interface HasGrade {
	final public String FREE_GRADE = "free";
	final public String BASIC_GRADE = "basic";
	final public String RARE_GRADE = "rare";
	final public String HERO_GRADE = "hero";
	final public String LEGEND_GRADE = "legend";
	
	public void setGrade(String grade);
	public String getGrade();
}
