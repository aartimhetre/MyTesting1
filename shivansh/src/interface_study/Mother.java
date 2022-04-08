package interface_study;

public interface Mother {

	void nature();
	void love();
	default void look()
	{
		System.out.println("mothers look");
	}
	static void eyes()
	{
		System.out.println("mothers eyes");
	}
}
