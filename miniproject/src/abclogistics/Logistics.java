package abclogistics;

public class Logistics {

	public static void main(String[] args) {

		AbcDao dao = new AbcDao();

		AbcDto dto = new AbcDto();

		dto.setFirstName("ramana");
		dto.setLastName("dasari");
		dto.setMobileNumber(9490079740l);
		dto.setGender('m');
		dto.setEmailId("ram12@gmail.com");
		dto.setPassword("ram12@");

		dao.accountCreation(dto);

	}
}
