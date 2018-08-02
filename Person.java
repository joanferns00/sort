import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ArrayList; 
import java.util.List; 
import java.util.Collections;
import java.util.Scanner;
import java.text.ParseException;


public class Person {
		String ssn;
		Date dateOfBirth;
		String firstName;
		String lastName;
		Double heightIn;
		Double weightLb;

		Person(String ssn, Date dateOfBirth, String firstName, String lastName, Double heightIn, Double weightLb){
			this.ssn = ssn;
			this.dateOfBirth = dateOfBirth;
			this.firstName = firstName;
			this.lastName = lastName;
			this.heightIn = heightIn;
			this.weightLb = weightLb;
		}
		String getSsn(){
			return this.ssn;
		}		
		Date getDateOfBirth(){
			return this.dateOfBirth;
		}				
		String getFirstName(){
			return this.firstName;
		}

		String getLastName(){
			return this.lastName;
		}

		Double getHeightIn(){
			return this.heightIn;
		}		

		Double getWeightLb(){
			return this.weightLb;
		}		
		Integer getSsnNum(){
			return Integer.parseInt(this.ssn);	
		}


		/**
		   Function to sort the list of Person objects using a sort field
		   people: Iterable Object
		   sortField: Field to be sorted by
		   ascending: If the data needs to be ascending

		**/	
		static List<Person> sort(Iterable<Person> people, String sortField, String ascending){
			Boolean ascendingBool = Boolean.valueOf(ascending);
			List<Person> personList = new ArrayList<>();
			for(Person p : 	people){
			personList.add(p);	
			}
          
          switch(sortField){
          	 case "ssn":
          	    if(ascendingBool){
					//Sort ascending
				    personList.sort(
		      			(Person p1, Person p2) -> p1.getSsnNum().compareTo(p2.getSsnNum()));          	    	
          	    }
      	    	else{
					//Sort descending
				    personList.sort(
		      			(Person p1, Person p2) -> p2.getSsnNum().compareTo(p1.getSsnNum()));   
      	    	}
          	    break;
          	 case "dateOfBirth":
          	    if(ascendingBool){
					//Sort ascending
				    personList.sort(
		      			(Person p1, Person p2) -> p1.getDateOfBirth().compareTo(p2.getDateOfBirth()));             	    	
          	    }
      	    	else{
					//Sort descnding
				    personList.sort(
		      			(Person p1, Person p2) -> p2.getDateOfBirth().compareTo(p1.getDateOfBirth()));   
      	    	}
          	    break;	          	    	

          	case "firstName":
          	  if(ascendingBool){
					//Sort ascending
				    personList.sort(
		      			(Person p1, Person p2) -> p1.getFirstName().compareTo(p2.getFirstName()));
          	  }
			  else{
					//Sort descending		    
					personList.sort(
							(Person p1, Person p2) -> p2.getFirstName().compareTo(p1.getFirstName()));
			  }
          		break;
          	 case "lastName":
          	    if(ascendingBool){
					//Sort ascending
				    personList.sort(
		      			(Person p1, Person p2) -> p1.getLastName().compareTo(p2.getLastName()));
          	    }
      	    	else{
					//Sort descending		    
					personList.sort(
							(Person p1, Person p2) -> p2.getLastName().compareTo(p1.getLastName()));
      	    	}
          	    break;	   
          	 case "heightIn":
          	    if(ascendingBool){
					//Sort ascending
				    personList.sort(
		      			(Person p1, Person p2) -> p1.getHeightIn().compareTo(p2.getHeightIn()));
          	    }
      	    	else{
					//Sort descending
				    personList.sort(
		      			(Person p1, Person p2) -> p2.getHeightIn().compareTo(p1.getHeightIn()));
      	    	}
          	    break;	       
          	 case "weightLb":
          	    if(ascendingBool){
					//Sort ascending
				    personList.sort(
		      			(Person p1, Person p2) -> p1.getWeightLb().compareTo(p2.getWeightLb()));
          	    }
      	    	else{
					//Sort ascending
				    personList.sort(
		      			(Person p1, Person p2) -> p2.getWeightLb().compareTo(p1.getWeightLb()));
      	    	}
          	    break;          	       	    
          	default: return personList;
          }
			return personList;
		}

    /**
       Main function to set data and get user inputs
    **/
	public static void main(String[] args){	
		double h0 = 10.10;
		double h1 = 20.10;
		double h2 = 30.10;
		double h3 = 40.10;
		double h4 = 50.10;
		double h5 = 60.10;		

		double w0 = 60.10;
		double w1 = 50.10;
		double w2 = 40.10;
		double w3 = 30.10;
		double w4 = 20.10;
		double w5 = 10.10;

		SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy");
		Date date0 = new Date();
		Date date1 = new Date();
		Date date2 = new Date();
		Date date3 = new Date();
		Date date4 = new Date();
		Date date5 = new Date();

        try {
		 date0 = formatter.parse("7-Jun-2013");
		 date1 = formatter.parse("7-Jun-2014");
		 date2 = formatter.parse("7-Jun-2015");
		 date3 = formatter.parse("7-Jun-2016");
		 date4 = formatter.parse("7-Jun-2017");
		 date5 = formatter.parse("7-Jun-2018");
        } 
        catch (ParseException e) {
            e.printStackTrace();
        }

		Person p0 = new Person("40", date0, "Amy", "Zera", h0, w0);
		Person p1 = new Person("100", date1, "Bach", "Xena", h1, w1);
		Person p2 = new Person("1", date2, "Cher", "Strata", h2, w2);
		Person p3 = new Person("5", date3, "Denny", "Lou", h3, w3);
		Person p4 = new Person("25", date4, "Euge", "Bran", h4, w4);
		Person p5 = new Person("10", date5, "Frances", "Axe", h5, w5);

		List<Person> personList = new ArrayList<>();
		personList.add(p0);
		personList.add(p1);
		personList.add(p2);
		personList.add(p3);
		personList.add(p4);
		personList.add(p5);

	    Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the field (Type one of the following, ssn, dateOfBirth, firstName, lastName, heightIn, weightLb):  ");	   
        String field = scanner.next(); 
        System.out.print("Do you want it ascending? (Type either true or false):  ");	   
        String ascending = scanner.next(); 

        List<Person> sortedPersonList = sort(personList, field, ascending);    

        for(Person p : sortedPersonList){
			System.out.println(p.getSsn() + " " + p.getDateOfBirth() + " " + p.getFirstName() + " " + p.getLastName() + " " + p.getHeightIn() + " " + p.getWeightLb());         	
        }
	}
}
