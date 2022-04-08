package daily_practice;

public interface Amazon {

	void grocery();
	default void electronics()
	{
		System.out.println("electronics from amazon");
	}
}
