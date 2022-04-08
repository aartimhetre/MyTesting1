package daily_practice;

public interface Flipcart{ //  by using multiple inheritance {

void shopping();
default void electronics()
{
	System.out.println("electronics from flipcart");
	}
}
