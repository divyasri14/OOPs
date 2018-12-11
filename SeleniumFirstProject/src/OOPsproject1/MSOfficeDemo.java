package OOPsproject1;

public class MSOfficeDemo {

	public static void main(String[] args) {
		
		
		MSexcel MSX = new MSexcel();
		
		MSX.Save();
		MSX.Saveas();

		
		
		//Here interface methods only we call it not the class level stand alone methods
		MSOfficeAbstractMethod  mso = new MSexcel();
				mso.Save();
		mso.Start();
		mso.New();
	}

}
