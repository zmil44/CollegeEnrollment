/*
 * Zachary Miller
 * assignment 2.2
 * TestCollegeStudent.java
 * This program gets user input for two students and creates objects from the CollegeStudent.java class using the input
 * Bellevue University
 */
import javax.swing.*;
public class TestCollegeStudent 
{

	public static void main(String[] args) 
	{
		CollegeStudent student1 = new CollegeStudent();
		CollegeStudent student2 = new CollegeStudent();
		int count = 1,year=0,month=0,day=0;
		boolean input=false;
		JTextField firstNameField = new JTextField(15);
	    JTextField lastNameField = new JTextField(15);
	    JTextField enrollmentYearField = new JTextField(4);
	    JTextField enrollmentMonthField = new JTextField(2);
	    JTextField enrollmentDayField = new JTextField(2);

	    
		while(count<=2)
		{
			while(input==false)
			{
				try
				{
					JPanel myPanel = new JPanel();
				    myPanel.add(new JLabel("First Name:"));
				    myPanel.add(firstNameField);
				    myPanel.add(new JLabel("Last Name:"));
				    myPanel.add(lastNameField);
				    myPanel.add(new JLabel("Enrollment Year"));
				    myPanel.add(enrollmentYearField);
				    myPanel.add(new JLabel("Enrollment Month"));
				    myPanel.add(enrollmentMonthField);
				    myPanel.add(new JLabel("Enrollment Day"));
				    myPanel.add(enrollmentDayField);
			    	int result = JOptionPane.showConfirmDialog(null, myPanel,
			    		"Please Enter first name last name, and enrollment date (yyyy/mm/dd)", JOptionPane.OK_OPTION);
			    	
			    		year = Integer.parseInt(enrollmentYearField.getText());
			    		month = Integer.parseInt(enrollmentMonthField.getText());
			    		day = Integer.parseInt(enrollmentDayField.getText());
				}
			    	catch(NumberFormatException e)
			    	{
			    		JOptionPane.showMessageDialog(null, "I'm sorry but one of the dates you entered seemed to be incorrect. Please try again.");
			    		input=false;
			    	}
			    	input=true;
		    		if(count ==1)
		    		{
		    			student1.setFirstName(firstNameField.getText());
		    			student1.setLastName(lastNameField.getText());
		    			student1.setEnrollmentDate(year,month,day);
		    			student1.setProjectedGraduationDate(year,month,day);
		    		}
		    		else
		    		{
		    			student2.setFirstName(firstNameField.getText());
		    			student2.setLastName(lastNameField.getText());
		    			student2.setEnrollmentDate(year,month,day);
		    			student2.setProjectedGraduationDate(year,month,day);
		    		}
		    	
	    	
				
			}
			count++;
			input=false;

		}
		JOptionPane.showMessageDialog(null, "Student Name:"+student1.getFirstName()+" "+student1.getLastName()+
				"\nEnrollment Date(dd/mm/yyyy): "+student1.getEnrollmentDay()+"/"+student1.getEnrollmentMonth()+"/"+student1.getEnrollmentYear()+
				"\nProjected Graduation date(dd/mm/yyyy): "+student1.getProjectedGraduationDay()+"/"+student1.getProjectedGraduationMonth()+"/"+student1.getProjectedGraduationYear()+
				"\n\nStudent Name:"+student2.getFirstName()+" "+student2.getLastName()+
				"\nEnrollment Date:(dd/mm/yyyy): "+student2.getEnrollmentDay()+"/"+student2.getEnrollmentMonth()+"/"+student2.getEnrollmentYear()+
				"\nProjected Graduation date(dd/mm/yyyy): "+student2.getProjectedGraduationDay()+"/"+student2.getProjectedGraduationMonth()+"/"+student2.getProjectedGraduationYear());
	}
}
