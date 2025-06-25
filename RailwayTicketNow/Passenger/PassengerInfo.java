package Passenger ;

import java.lang.*;
import javax.swing.*;
import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class PassengerInfo 
{
	private String name;
    private String mobileNumber;
    private String citizenship;
    private String facilities;
    private String fromStation;
    private String toStation;
    private String feedback;
    private String seatClass;
	private String seatPrice;
	
	private File file;
	private FileWriter fWriter;
	
	public PassengerInfo() { }
	public PassengerInfo(String name, String mobileNumber, String citizenship, String facilities, String fromStation, String toStation, String feedback, String seatClass, String seatPrice)
	{
		this.name = name;
        this.mobileNumber = mobileNumber;
        this.citizenship = citizenship;
        this.facilities = facilities;
        this.fromStation = fromStation;
        this.toStation = toStation;
        this.feedback = feedback;
        this.seatClass = seatClass;
		this.seatPrice = seatPrice ;
	}
    
	public void insertInfo()
	{
		try 
		{
			file = new File("Data/userdata.txt");

            if (!file.exists()) {
                file.getParentFile().mkdirs();
                file.createNewFile();
            }


			LocalDateTime now = LocalDateTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm a, dd/MM/yyyy");
            String timeAndDate = now.format(formatter);
			
			fWriter = new FileWriter(file, true);  // append mode
            fWriter.write("Date and Time: " + timeAndDate + "\n");
            fWriter.write("========================================\n");
            fWriter.write("Name          : " + name + "\n");
            fWriter.write("Mobile Number : " + mobileNumber + "\n");
            fWriter.write("Bangladeshi   : " + citizenship + "\n");
            fWriter.write("Facilities  : " + facilities + "\n");
            fWriter.write("From Station  : " + fromStation + "\n");
            fWriter.write("To Station    : " + toStation + "\n");
            fWriter.write("Seat Class    : " + seatClass + "\n");
			fWriter.write("Seat Price    : " + seatPrice + "\n");
            fWriter.write("Feedback      : " + feedback + "\n");
            fWriter.write("----------------------------------------\n\n");

            fWriter.flush();
            fWriter.close();
		}
		catch (IOException ioe) {
            ioe.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error writing to file!");
        }

	}
}