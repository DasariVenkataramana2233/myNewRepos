package abclogistics;

public class AbcDao {

	public void accountCreation(AbcDto dto) {

		String firstName = dto.getFirstName();

		String lastName = dto.getLastName();

		long number = dto.getMobileNumber();

		char gender = dto.getGender();

		String email = dto.getEmailId();

		String password = dto.getPassword();

		if (dto != null)

			System.out.println("account created successfully");
		else 

			throw new MyException("account not created ...try it again");
		
	}

}
