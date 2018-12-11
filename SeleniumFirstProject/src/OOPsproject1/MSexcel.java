package OOPsproject1;

public class MSexcel implements MSOfficeAbstractMethod {

	@Override
	public void Start() {
		System.out.println("Save MS Excel");
		
	}

	@Override
	public void New() {
		System.out.println("create new sheet in  MSExcel");
		
	}

	@Override
	public void Save() {
		System.out.println("Save the  sheet in  MSExcel");
		
	}
	
	public void Saveas() {
		System.out.println("Saveas the  sheet in  MSExcel");
		
	}

}
