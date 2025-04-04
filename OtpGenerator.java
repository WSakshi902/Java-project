                                      // ***OTP Generator*** //

  class OtpGenerator  
  {
  	public static void main(String[] args) 
  	{
  		String otp1 = generateOtp1();
  		System.out.println("String otp1"+otp1) ;
  		int otp2=generateOtp2();
  		System.out.println("int otp2"+otp2) ;
  	}
  	public static String generateOtp1()
  	{
  		String Otp = "" ;
  		for(int i=1;i<=4;i++)
  			Otp += ((int)(Math.random()*9)) ;
  		    return Otp ;
  	}
  	public static int generateOtp2()
  	{
  		return(int)(Math.random()*9999) ;
  	}
  		
  	}
  
