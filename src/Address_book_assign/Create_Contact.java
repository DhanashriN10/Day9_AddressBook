package Address_book_assign;

public class Create_Contact 
{		
			public String f_nm;
		    public String l_nm;
		    public long mob_no;
		    public String email;
		    public String address;
		    public String city;
		    public String state;
		    public int zip;
		    
		    
		    public Create_Contact (String firstName, String lastName, long phoneNumber,
		            String emailId, String address, String city, String state, int zip) {
		    	
		          this.f_nm = firstName;
		          this.l_nm = lastName;
		          this.mob_no = phoneNumber;
		          this.email = emailId;
		          this.address = address;
		          this.city = city;
		          this.state = state;
		          this.zip = zip;
		       
		       }

		    public static void main(String[] args){
		       Create_Contact contacts = new Create_Contact("Dhanashri", "Nerkar", 88905548, "dhanashri@gmail.com",
		                                           "XYZ Colony", "Dhule","Maharashtr", 424002 );
		        System.out.println("FirstName : "+contacts.f_nm);
		        System.out.println("LastName : " +contacts.l_nm);
		        System.out.println("Mobile Number : "+contacts.mob_no);
		        System.out.println("EmailId : " +contacts.email);
		        System.out.println("Address : "+contacts.address);
		        System.out.println("City : " +contacts.city);
		        System.out.println("State : " +contacts.state);
		        System.out.println("Zip : "+contacts.zip);
		    }

		}
