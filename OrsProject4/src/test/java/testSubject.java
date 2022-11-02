import in.co.sunrays.proj4.bean.SubjectBean;
import in.co.sunrays.proj4.exception.ApplicationException;
import in.co.sunrays.proj4.exception.DuplicateRecordException;
import in.co.sunrays.proj4.model.SubjectModel;

public class testSubject {
	public static void main(String[] args) throws ApplicationException, DuplicateRecordException {
		ADD();
	}

	private static void ADD() throws ApplicationException, DuplicateRecordException {
		SubjectBean bean = new SubjectBean();
		SubjectModel model = new SubjectModel();
		bean.setDescription("maths");
		bean.setCourseId(1);
		bean.setName("B.tech");
		System.out.println("added");
		long i = model.add(bean); 
		
	}

}
