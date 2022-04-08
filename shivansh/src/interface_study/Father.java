package interface_study;

public interface Father {

	void money();
	void rules();
	default void look()
	{
		System.out.println("fathers look");
	}
	static void property()
	{
		System.out.println("fathers property");
	}
	
}
