package hw13FirstPart;

public class FirstPartHw13 {

//	9 ways to create dynamic xpath

	/*
	  1. Tag with a single attribute---facebook.com 
	 i) Email or ph number field: //input[@name='email'] 
	  ii) Password field: //div[@id='passContainer'] 
	  iii) Log in: //button[@class='_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy'] 
	  iv) First name on Sign up page: //input[@name='firstname'] 
	  v) Last name: //input[@name='lastname']
	 */

	/*
	 * 2. Tag with a multiple attributes with 'or' logic---facebook.com Facebook
	 * Sign Up button: 
	 		//button[@class='_6j mvm _6wk _6wl _58mi _3ma _6o _6v' or @name='websubmit']
	 */
	
	/*
	 3. Tag with a multiple attributes with 'and' logic
	 
	 i) New password filed FB: //input[@class='inputtext _58mg _5dba _2ph-' and @id='password_step_input']
	 ii)eBay search field: //input[@id='gh-ac' and @name='_nkw']
	 iii) chase.com password filed: //input[@class='jpui input logon-xs-toggle' and @name='password']
	 iv) chase.com userid: //input[@class='jpui input logon-xs-toggle' and @name='userId']
	 v) bestbuy password: //input[@class='tb-input ' and @id='fld-p1']
	 */
	
	/*4. Tag with inner text formula: //html tag [text() = 'inner text']
	 i)Bestbuy deals of the day: //a[text()='Deal of the Day']
	 ii) Bestbuy Credit Cards: //a[text()='Credit Cards']
	 iii) Bestbuy element account: //span[text()='Account']
	 iv) Bestbuy element To deals: //a[text()='Top Deals']
	 v) Bestbuy element Gift ideas: //a[text()='Gift Ideas']
	 */
	
	/*5. Partial inner text
	 i) Fedex - log in or sign up: //span[contains(text(), 'Sign Up or Lo')] 
	 ii) Fedex - create a user id:  //span[contains(text(), 'CREATE A ')]
	 iii) Fedex -Locatins: //span[contains(text(), 'LOCAT')]
	 iv) Career fedex - Fetured Jobs: //a[contains(text(), 'Featured J')]
	 v) Career fedex - I am Fedex: //a[contains(text(), 'I am Fe)]  
	 */
	
	/*6. Tag with attributes and use of contains
	 i) Macy's logo: //a[contains(@class, 'header-logo__image')]
	 ii) Macy's Wedding registry: //a[contains(@id, 'registry-link')]
	 iii) Macy's Craving more royalty by Maluma: //area[contains(@alt, 'Maluma BG 1 DT')]
	 iv) Macy's - Bag: //span[contains(@id, 'bag-icon-reskin')] 
	 */
	
	/*7. Normalize-space 
	 i) Truist bank - open account: //a[normalize-space(text())='Open account' and @class='truist-globalnav-nav-link truist-globalnav-dropdown-toggle']
	 ii)Amazon: //span[normalize-space(text())='Select your address']
	 iii)Amazon: //span[normalize-space(text())='Best Sellers & More']
	 iv) Amazon: //span[normalize-space(text())='Best Books of the Month' and @class='nav-a-content']
	 v) //span[normalize-space(text())='Textbook Rentals']
	 */
	
	/*8. Starts with text //html tag [starts-with(text(), 'attribute value')]
	 i) Amazon: //a[starts-with(text(), 'Fashion')]
	 ii) CVS : //a[starts-with(text(), 'HealthHUB')]
	 iii) CVS: //span[starts-with(text(), 'Get care from a provider')]
	 iv) CVS: //span[starts-with(text(), 'COVID-19 vaccines, tests, treatme')]
	 v) CVS: //a[starts-with(text(), 'Create an Acco')]
	 */
	
	//Deliberately avoided number 9 as this one has no use
	
}
