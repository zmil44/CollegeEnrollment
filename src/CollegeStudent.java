/*
 * Zachary Miller
 * Assignment 2.2
 * CollegeStudent.java
 * This program provides the CollegeStudent class used by TestCollegeStudent. It sets the students first and last name,
 *  enrollment date and projected graduation date. It also gives methods to retrieve this information. 
 * Bellevue University
 */
import java.util.*;

public class CollegeStudent
	{
		Calendar enrollmentDate = new GregorianCalendar();// enrollmentDate,projectedGraduationDate;
		Calendar projectedGraduationDate = new GregorianCalendar();
		
		String firstName, lastName;
		public String getFirstName()
		{
			return firstName;
		}
		public void setFirstName(String studentFirstName)
		{
			firstName = studentFirstName;
		}
		public String getLastName()
		{
			return lastName;
		}
		public void setLastName(String studentLastName)
		{
			lastName = studentLastName;
		}
		
		public int getEnrollmentYear()
		{
			return enrollmentDate.get(GregorianCalendar.YEAR);
		}
		public int getEnrollmentMonth()
		{
			return enrollmentDate.get(GregorianCalendar.MONTH);
		}
		public int getEnrollmentDay()
		{
			return enrollmentDate.get(GregorianCalendar.DAY_OF_MONTH);
		}
		
		public void setEnrollmentDate(int year,int month, int day)
		{
			enrollmentDate.clear();
			enrollmentDate.set(year, month, day);
		}
		public int getProjectedGraduationYear()
		{
			return projectedGraduationDate.get(GregorianCalendar.YEAR);
		}
		public int getProjectedGraduationMonth()
		{
			return projectedGraduationDate.get(GregorianCalendar.MONTH);
		}
		public int getProjectedGraduationDay()
		{
			return projectedGraduationDate.get(GregorianCalendar.DAY_OF_MONTH);
		}
		
		public void setProjectedGraduationDate(int year,int month,int day)
		{
			projectedGraduationDate.set((year+4), month, day);
		}
	}
