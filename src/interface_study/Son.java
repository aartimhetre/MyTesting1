package interface_study;

public class Son implements Father,Mother{

	public static void main(String[] args) {
	Son s=new Son();
	s.nature();
	s.love();
	s.money();
	s.look();
	s.rules();
Father.property();
Mother.eyes();
	}

	@Override
	public void nature() {
		System.out.println("mothers nature completed in sons class");
		
	}

	@Override
	public void love() {
		System.out.println("mothers love completed in sons class");
		
	}

	@Override
	public void money() {
		System.out.println("fathers money completed in sons class");
		
	}

	@Override
	public void rules() {
System.out.println("fathers rule completed in sons class");
		
	}

	@Override
	public void look() {
		// TODO Auto-generated method stub
		Father.super.look();
		Mother.super.look();
	}


		
	}

