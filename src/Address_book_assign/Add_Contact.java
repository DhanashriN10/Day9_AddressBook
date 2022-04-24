package Address_book_assign;

import java.util.Scanner;

public class Add_Contact
{			
			   private String f_nm;
			   private String l_nm;
			   private long mob_no;
			   private String email;
			   private String address;
			   private String city;
			   private String state;
			    int zip;
			    
			    static Scanner input = new Scanner(System.in);

			    public String getFirstName() {
					return f_nm;
				}
			    public void setFirstName(String firstName){
			        this.f_nm = firstName;
			    }
			    
			    
			    public String getLastName() {
					return l_nm;
				}
			    public void setLastName(String lastName){
			        this.l_nm = lastName;
		          }
			    
			    public long getMobileNumber() {
					return mob_no;
				}
			    public  void setMobileNumber(long phoneNumber){
			        this.mob_no = phoneNumber;
			    }
			    
			    public String getEmailId() {
					return email;
				}
			    public  void setEmailId(String emailId){
			        this.email = emailId;
			    }
			    
			    public String getAddress() {
					return address;
				}
			    public  void setAddress(String address){
			        this.address = address;
			    }
			    
			    public String getCity() {
					return city;
				}
			    public  void setCity(String city){
			        this.city = city;
			    }
			    
			    public String getState() {
					return state;
				}
			    public  void setState(String state){
			        this.state = state;
			    }
			    public int getZip() {
					return zip;
				}
			    public  void setZips(int zip) {
			        this.zip = zip;
			    }
			    public static void main(String[] args) {

			        Add_Contact person = new Add_Contact();

			        System.out.println("add person details");
			        Scanner scanner = new Scanner(System.in);

			        System.out.println("Enter First name: ");
			        person.setFirstName(scanner.next());

			        System.out.println("Enter Last name: ");
			        person.setLastName(scanner.next());

			        System.out.println("Enter Mobile Number: ");
			        person.setMobileNumber(scanner.nextLong());

			        System.out.println("Enter  Email id: ");
			        person.setEmailId(scanner.next());

			     
			        System.out.println("Enter Address: ");
			        person.setAddress(scanner.next());

			        System.out.println("Enter City: ");
			        person.setCity(scanner.next());

			        System.out.println("Enter State : ");
			        person.setState(scanner.next());

			        System.out.println("Enter Zip: ");
			        person.setZips(scanner.nextInt());

			        System.out.println("*********Person details***********");
			        System.out.println(" ");
			        
			        System.out.println("FirstName: "+person.f_nm);
			        System.out.println("LastName: "+person.l_nm);
			        System.out.println("PhoneNumber: "+person.mob_no);
			        System.out.println("Email id: "+person.email);
			        System.out.println("Address: "+person.address);
			        System.out.println("City: "+person.city);
			        System.out.println("State: "+person.state);
			        System.out.println("Zip: "+person.zip);
			    }
			}


