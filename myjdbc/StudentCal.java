package myjdbc;

import java.sql.SQLException;

public class StudentCal {

	public int totalCal(StudentDto dto) {

		int total = dto.getTel() + dto.getHin() + dto.getEng() + dto.getMath() + dto.getSci() + dto.getSoc();

		return total;
	}

	public double percentageCal(StudentDto dto) {

		double t = dto.getTel() + dto.getHin() + dto.getEng() + dto.getMath() + dto.getSci() + dto.getSoc();

		double result = (t / 600) * 100;

		return result;

	}

	public String gradeCal(double percent) {

		if (percent >= 92) {

			return "A1";
		} else if (percent >= 83 && percent <= 91) {

			return "A2";

		} else if (percent >=75 && percent <= 82) {

			return "B1";

		} else if (percent >= 67 && percent <= 74) {

			return "C1";

		} else if (percent >= 59 && percent <= 66) {

			return "C2";
		} else if(percent>=51 && percent<=58){

			return "D";
		}
		else {
			
			return "F";
		}

	}

	public void insertRecord(StudentDto dto) throws SQLException {

		int total = totalCal(dto);
		double percent = percentageCal(dto);
		String grade = gradeCal(percent);

		dto.setTotal(total);
		dto.setPercentage(percent);
		dto.setGrade(grade);

		StudentDao dao = new StudentDao();
		dao.insertRecord(dto);

	}

}
